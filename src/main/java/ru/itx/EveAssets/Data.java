package ru.itx.EveAssets;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementMap;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import enterprises.orbital.evexmlapi.EveXmlApiAdapter;
import enterprises.orbital.evexmlapi.IEveXmlApi;
import enterprises.orbital.evexmlapi.chr.ICharacterAPI;
import enterprises.orbital.evexmlapi.eve.IConquerableStation;
import enterprises.orbital.evexmlapi.eve.IEveAPI;
import enterprises.orbital.evexmlapi.eve.ITypeName;
import enterprises.orbital.evexmlapi.map.IMapAPI;
import enterprises.orbital.evexmlapi.map.ISovereignty;
import enterprises.orbital.evexmlapi.map.ISystemSovereignty;
import enterprises.orbital.evexmlapi.shared.IAsset;
import enterprises.orbital.evexmlapi.shared.IBlueprint;
import enterprises.orbital.evexmlapi.shared.IIndustryJob;
import enterprises.orbital.evexmlapi.shared.IMarketOrder;
import enterprises.orbital.evexmlapi.svr.IServerAPI;



@Root 
public class Data {
	
	public IEveXmlApi apiHandle;
	public IEveAPI iEveAPI;
	public IServerAPI serverAPIHandle;
	public IMapAPI iMapAPI;

	
	//Stations list <staStationsID,Name>
	private HashMap<Long,Station> stations;
	@ElementList
	private TreeSet<Credential> credentials;
	public HashMap<Integer,ICharacterAPI> charAPIHandles;
	private HashMap<Integer,ISystemSovereignty> solarSystems;
	// Solar sy <ISystemID,name>
	@ElementMap(entry="cacheSolarSystem",key="key",attribute=true, inline=true)
	private HashMap<Integer,String>cacheSolarSystems;
	@ElementMap(entry="conquerableStations",key="key",attribute=true, inline=true)
	private HashMap<Long,ConquerableStation> conquerableStations;
	private HashMap<Integer,ITypeName> typeNames;
	@ElementMap(entry="cacheTypeNames",key="key",attribute=true, inline=true)
	private HashMap<String,Integer> cacheTypeNames;
	
	private HashMap<Long,Integer> cacheQuantityes;
	@ElementList
	private TreeSet<String> hubs;
	@ElementMap(entry="assets",key="key",attribute=true, inline=true)
	private HashMap<Integer,Wrapper> assets;
	

	
	private static Data instance;
	private long lastLocationID;

	public static Data getInstance(){
		if(instance==null) instance=new Data();
		return instance;
	}

	public static void loadDataFromFile() throws Exception {
		Serializer serializer = new Persister();
		File source = new File("data.xml");
		instance = serializer.read(Data.class, source);
	}

	public void  saveDataToFile() throws Exception {
		Serializer serializer = new Persister();
		File result = new File("data.xml");
		serializer.write(this, result);	
		}
	
	private Data(){
		stations=new HashMap<Long,Station>();
		credentials=new TreeSet<Credential>();
		charAPIHandles=new HashMap<Integer, ICharacterAPI>();
		solarSystems=new HashMap<Integer, ISystemSovereignty>();
		cacheSolarSystems=new HashMap<Integer, String>();
		conquerableStations=new HashMap<Long, ConquerableStation>();
		typeNames=new HashMap<Integer, ITypeName>();
		assets=new HashMap<Integer, Wrapper>();
		cacheTypeNames=new HashMap<String, Integer>();
		cacheQuantityes=new HashMap<Long, Integer>();
		hubs=new TreeSet<String>();
		hubs.add("Hek");
		hubs.add("Jita");
		hubs.add("Amarr");
		hubs.add("Rens");
		hubs.add("Dodixie");
		hubs.add("Bahromab");
		try {
			apiHandle = new EveXmlApiAdapter();
	    	iEveAPI=apiHandle.getEveAPIService();
	    	serverAPIHandle = apiHandle.getServerAPIService();
	    	iMapAPI= apiHandle.getMapAPIService();
	    	for(Credential c:App._credentials) {
	    		charAPIHandles.put(c.getKeyID(),apiHandle.getCharacterAPIService(c.getKeyID(), c.getvCode(), c.getCharacterID()));
	    		credentials.add(c);
	    	}
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}

	public void putSolarSystem(ISystemSovereignty ss){
		solarSystems.put(ss.getSolarSystemID(),ss);
		cacheSolarSystems.put(ss.getSolarSystemID(), ss.getSolarSystemName());
	}

	public String getSolarSystem(int solarSystemID){
		return cacheSolarSystems.get(solarSystemID);
	}
	
	public void putStation(Station st){
		stations.put(st.stationID,st);
	}
	
	public Station getStation(long stationID){
		return stations.get(stationID);
	}

	public void putConquerableStation(IConquerableStation st){
		conquerableStations.put(st.getStationID(),ConquerableStation.cloneIConquerableStation(st));
	}
	
	public ConquerableStation  getConquerableStation(long stationID){
		return conquerableStations.get(stationID);
	}

	public void putTypeName(ITypeName tn){
		typeNames.put(tn.getTypeID(),tn);
	}

	public void putTypeName(Collection<ITypeName> tns){
		for(ITypeName tn:tns) {
			typeNames.put(tn.getTypeID(),tn);
			cacheTypeNames.put(tn.getTypeName(), tn.getTypeID());
		}
	}
	
	public ITypeName getTypeName(int typeID){
		return typeNames.get(typeID);
	}
	
	public void loadStations() throws FileNotFoundException{
		File staStations = new File("staStations.yaml");
		Scanner sc=new Scanner(staStations).useLocale(Locale.ENGLISH);;
		try{
		while(sc.hasNext()){
		Station st= new Station();
		sc.next();
		if(sc.next().equals("constellationID:")) st.constellationID=sc.nextInt();
		if(sc.next().equals("corporationID:")) st.corporationID=sc.nextInt();
		if(sc.next().equals("dockingCostPerVolume:")) st.dockingCostPerVolume=sc.nextInt();
		if(sc.next().equals("maxShipVolumeDockable:")) st.maxShipVolumeDockable=sc.nextInt();
		if(sc.next().equals("officeRentalCost:")) st.officeRentalCost=sc.nextInt();
		if(sc.next().equals("operationID:")) st.operationID=sc.nextInt();
		if(sc.next().equals("regionID:")) st.regionID=sc.nextInt();
		if(sc.next().equals("reprocessingEfficiency:")) st.reprocessingEfficiency=sc.nextDouble();
		if(sc.next().equals("reprocessingHangarFlag:")) st.reprocessingHangarFlag=sc.nextInt();
		if(sc.next().equals("reprocessingStationsTake:")) st.reprocessingStationsTake=sc.nextDouble();
		if(sc.next().equals("security:")) st.security=sc.nextDouble();
		if(sc.next().equals("solarSystemID:")) st.solarSystemID=sc.nextInt();
		if(sc.next().equals("stationID:")) st.stationID=sc.nextInt();
		if(sc.next().equals("stationName:")) st.stationName=sc.nextLine();
		if(sc.next().equals("stationTypeID:")) st.stationTypeID=sc.nextInt();
		if(sc.next().equals("x:")) st.x=sc.nextDouble();
		if(sc.next().equals("y:")) st.y=sc.nextDouble();
		if(sc.next().equals("z:")) st.z=sc.nextDouble();
		putStation(st);
		}
		}catch(Exception e){}
	} 
	
	public void scanAssets(Collection<IAsset> assets,long characterID) throws IOException{
		int counter=0;
		for(IAsset a:assets){
			if((counter++ % 200)==0)System.out.print(".");
	    	if(getTypeName(a.getTypeID())==null){
	    		Collection<ITypeName> tns= iEveAPI.requestTypeName(a.getTypeID());
	    		putTypeName(tns);
		    	}
	    	putAsset(a,characterID);
//	    	String sys=location2SolarSystem(a.getLocationID());
//	    	System.out.printf("%1$30.30s:  %2$7s (%3$d/%4$s/%5$s)\n", Data.getInstance().getTypeName(a.getTypeID()).getTypeName() , a.getQuantity(), 
//	    			a.getTypeID(), a.getContainedAssets().size(),sys );
	    }
	}

	public void scanOrders(Collection<IMarketOrder> orders,long characterID) throws IOException{
		int counter=0;
		for(IMarketOrder o:orders){
			if((counter++ % 10)==0)System.out.print(".");
	    	if(getTypeName(o.getTypeID())==null){
	    		Collection<ITypeName> tns= iEveAPI.requestTypeName(o.getTypeID());
	    		putTypeName(tns);
		    	}
	    	putAssetFromOrder(o,characterID);
	    }
	}

	public void scanJobs(Collection<IIndustryJob> jobs, long characterID) throws IOException {
		int counter=0;
		for(IIndustryJob j:jobs){
			if((counter++ % 10)==0)System.out.print(".");
	    	Asset a=putAssetFromJob(j,characterID);
	    	if(a!=null && getTypeName((int)a.getTypeID())==null){
	    		Collection<ITypeName> tns= iEveAPI.requestTypeName(a.getTypeID());
	    		putTypeName(tns);
		    	}
	    }
	}
	
	public Asset putAsset(IAsset asset,long characterID) throws IOException{
		if(asset.getLocationID()!=0)lastLocationID=asset.getLocationID();
		if(!assets.containsKey(asset.getTypeID())) assets.put(asset.getTypeID(),new Wrapper());
		Asset currAsset=Asset.cloneIAsset(asset);
		currAsset.setLocationID(lastLocationID);
		assets.get(asset.getTypeID()).assets.add(currAsset);
		assets.get(asset.getTypeID()).characterIDs.add(characterID);		
		if(cacheQuantityes.containsKey(asset.getItemID())) {
			System.err.println("!!!!!!!!!!!!!!!!!!!!!!!!!!! cacheQuantityes collision !!!!!!!!!!!!!!!!!!!!!!!!");
			System.exit(-1);
		}
		// Calculate cacheQuantityes
		cacheQuantityes.put(asset.getItemID(), asset.getQuantity());
		if(asset.getContainedAssets()!=null){
			scanAssets(asset.getContainedAssets(),characterID);
		}
		return currAsset;
	}
	
	public Asset putAssetFromOrder(IMarketOrder order,long characterID) throws IOException{
		if(order.getBid()!=1)return null;
		if(!assets.containsKey(order.getTypeID())) assets.put(order.getTypeID(),new Wrapper());
		Asset currAsset=Asset.cloneIMarketOrder(order);
		assets.get(order.getTypeID()).assets.add(currAsset);
		assets.get(order.getTypeID()).characterIDs.add(characterID);		
		// Calculate cacheQuantityes
		cacheQuantityes.put(currAsset.getItemID(), currAsset.getQuantity());
		return currAsset;
	}

	public Asset putAssetFromJob(IIndustryJob job,long characterID) throws IOException{
		if(job.getProductTypeID()<1) return null;
		if(!assets.containsKey(job.getProductTypeID())) assets.put((int)job.getProductTypeID(),new Wrapper());
		Asset currAsset=Asset.cloneIProductionJob(job);
		assets.get((int)job.getProductTypeID()).assets.add(currAsset);
		assets.get((int)job.getProductTypeID()).characterIDs.add(characterID);		
		// Calculate cacheQuantityes
		cacheQuantityes.put(currAsset.getItemID(), currAsset.getQuantity());
		return currAsset;
	}
//	public Asset putAssetFromJob(IIndustryJob job,long characterID) throws IOException{
//		IBlueprint bp=null;
//		long keyID=0;
//		ICharacterAPI characterAPI=null;
//		if(job.getProductTypeID()<1) return null;
//		for(ICharacterAPI ic:charAPIHandles.values())
//			if(ic.requestCharacterSheet().getCharacterID()==characterID)
//				{characterAPI=ic;break;}
//		for(IBlueprint b:characterAPI.requestBlueprints())
//			if(b.getItemID()==job.getBlueprintID())bp=b;
//		if(!assets.containsKey(bp.getTypeID())) assets.put((int)bp.getTypeID(),new Wrapper());
//		Asset currAsset=Asset.cloneIProductionJob(job,bp);
//		assets.get(bp.getTypeID()).assets.add(currAsset);
//		assets.get(bp.getTypeID()).characterIDs.add(characterID);		
//		// Calculate cacheQuantityes
//		cacheQuantityes.put(currAsset.getItemID(), currAsset.getQuantity());
//		return currAsset;
//	}
	
	public void recalculateCacheQuantity(){
		cacheQuantityes.clear();
		for(Wrapper w: assets.values())
			for(Asset a:w.assets){
				cacheQuantityes.put(a.getItemID(), a.getQuantity());
			}
	}
	
	public long generateRandomizeItemID(){
		Random r=new Random();
		long id=r.nextLong();
		while(assets.containsKey(id)) id=r.nextLong();
		return id;
	}
	
	public int getAssetTypesNumbers(){
		return assets.size();
	}

	public Credential getCredential(int num){
		Credential result=null;
		try{
		Iterator<Credential> iterator=credentials.iterator(); 
		for(int i=0;i<num;i++)iterator.next();
		result= iterator.next();
		}catch(Exception e){}
		return result;
	}
	

	public String location2SolarSystem(long locationID){
    	String sys="";
    	if(locationID<61000000){
    		sys=getSolarSystem(getStation(locationID).solarSystemID);
    	}
    	else { 
    		sys=getSolarSystem((int)getConquerableStation(locationID).solarSystemID);
    	}
    	return sys;
	}

	public int minusRest(String name,int needed) {
		int result=needed;
		if(!cacheTypeNames.containsKey(name)) return needed;
		Wrapper wrapper = assets.get(cacheTypeNames.get(name));
		for(Asset a:wrapper.assets){
				// Must check location !!!!!!
				if(hubs.contains(location2SolarSystem(a.getLocationID())) ){
					if(cacheQuantityes.get(a.getItemID())>0){
						if(result>=cacheQuantityes.get(a.getItemID())) {
							result-=cacheQuantityes.get(a.getItemID());
							cacheQuantityes.put(a.getItemID(),0);
						}else{
							cacheQuantityes.put(a.getItemID(),cacheQuantityes.get(a.getItemID())-result);
							result=0;
							return result;
						}
					}
				}
		}
		return result;
	}

	
}
