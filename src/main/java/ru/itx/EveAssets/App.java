package ru.itx.EveAssets;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.security.KeyStore.LoadStoreParameter;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import javax.xml.bind.JAXBException;

import ru.itx.EveAssets.production.Item;
import ru.itx.EveAssets.production.product._800mm_Repeating_Cannon_II_;
import ru.itx.EveAssets.production.product._800mm_Repeating_Cannon_I_;
import ru.itx.EveAssets.production.product._Fernite_Carbide_Composite_Armor_Plate_;
import ru.itx.EveAssets.production.product._Mega_Pulse_Laser_II_;
import ru.itx.EveAssets.production.product._Mega_Pulse_Laser_I_;
import ru.itx.EveAssets.production.product._Nanomechanical_Microprocessor_;
import ru.itx.EveAssets.production.product._Neutron_Blaster_Cannon_II_;
import ru.itx.EveAssets.production.product._Neutron_Blaster_Cannon_I_;
import ru.itx.EveAssets.production.product._RAM_Weapon_Tech_;
import ru.itx.EveAssets.production.product._Scimitar_;
import ru.itx.EveAssets.production.product._Scythe_;
import ru.itx.EveAssets.production.product._Slasher_;
import ru.itx.EveAssets.production.product._Stiletto_;
import enterprises.orbital.evexmlapi.EveXmlApiAdapter;
import enterprises.orbital.evexmlapi.IEveXmlApi;
import enterprises.orbital.evexmlapi.chr.ICharacterAPI;
import enterprises.orbital.evexmlapi.chr.ICharacterSheet;
import enterprises.orbital.evexmlapi.eve.IConquerableStation;
import enterprises.orbital.evexmlapi.eve.IEveAPI;
import enterprises.orbital.evexmlapi.eve.IRefType;
import enterprises.orbital.evexmlapi.eve.ITypeName;
import enterprises.orbital.evexmlapi.map.IMapAPI;
import enterprises.orbital.evexmlapi.map.ISovereignty;
import enterprises.orbital.evexmlapi.map.ISystemSovereignty;
import enterprises.orbital.evexmlapi.shared.IAsset;
import enterprises.orbital.evexmlapi.shared.IIndustryJob;
import enterprises.orbital.evexmlapi.shared.ILocation;
import enterprises.orbital.evexmlapi.shared.IMarketOrder;
import enterprises.orbital.evexmlapi.svr.IServerAPI;
import enterprises.orbital.evexmlapi.svr.IServerStatus;
import enterprises.orbital.impl.evexmlapi.shared.ApiLocation;

/**
 * Hello world!
 *
 */
public class App 
{
	ArrayList<Item> items,result;
	public static ArrayList<Credential> _credentials;
	
	public App() {
		items=new ArrayList<Item>();
		result=new ArrayList<Item>();
		_credentials=new ArrayList<>();
	}
	
	public void loadSolarSystem() throws IOException{
	    //==============================================
	    // All solar system
	    for(ISystemSovereignty s:Data.getInstance().apiHandle.getMapAPIService().requestSovereignty().getSystemSovereignty()){
	    	Data.getInstance().putSolarSystem(s);
	    }
	}
	
	public void loadConquerableStation() throws IOException{
   	    // Claim stations
	    for(IConquerableStation station: Data.getInstance().iEveAPI.requestConquerableStations()){
	    	Data.getInstance().putConquerableStation(station);
	    }
	}
	

	public void loadStations() throws FileNotFoundException {
		Data.getInstance().loadStations();
	}

	public void loadAssets() throws IOException{
	    // All assets 
		System.out.println("load ASSETS");
		for(ICharacterAPI ic:Data.getInstance().charAPIHandles.values()){
			long characterID=ic.requestCharacterSheet().getCharacterID();
			System.out.println("+++"+ic.requestCharacterSheet().getName()+"+++");
			Set<IAsset> assets=(Set<IAsset>) ic.requestAssets();
			Data.getInstance().scanAssets(assets,characterID);
		}		
		System.out.println();
	}

	public void loadOrders() throws IOException{
	    // All assets 
		System.out.println("load ORDERS");
		for(ICharacterAPI ic:Data.getInstance().charAPIHandles.values()){
			long characterID=ic.requestCharacterSheet().getCharacterID();
			System.out.println("+++"+ic.requestCharacterSheet().getName()+"+++");
			Collection<IMarketOrder> orders=(Collection<IMarketOrder>) ic.requestMarketOrders();
			Data.getInstance().scanOrders(orders,characterID);
		}	
		System.out.println();
	}

	public void LoadJobs() throws IOException{
	    // All assets 
		System.out.println("load JOBS");
		for(ICharacterAPI ic:Data.getInstance().charAPIHandles.values()){
			long characterID=ic.requestCharacterSheet().getCharacterID();
			System.out.println("+++"+ic.requestCharacterSheet().getName()+"+++");
			Collection<IIndustryJob> jobs=(Collection<IIndustryJob>) ic.requestIndustryJobs();
			Data.getInstance().scanJobs(jobs,characterID);
		}		
		System.out.println();
	}
	
	public static void interceptErrOn(){
		// Start capturing
		ByteArrayOutputStream buffer = new ByteArrayOutputStream();
		System.setErr(new PrintStream(buffer));
	}
	public static void interceptErrOff(){
		// Stop capturing
		System.setErr(new PrintStream(new FileOutputStream(FileDescriptor.err)));
	}
	public void inputFromStdin() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		System.out.println("Input caclulated assets here in following format");
		System.out.println("<number assets as integer number>,<desired asset name>");
		System.out.println("end");
		System.out.println("for ex: ");
		System.out.println("77, Stiletto");
		System.out.println("200, 800mm Repeating Cannon II");
		System.out.println("546782,xydfgDFgVhfjdfgnjOkoHsdfgDaa6tuKXw7NBDFGTViVKnln1tv6q2qtcWN5m8bn,91546643,Direktus Cactus");
		System.out.println("543682,df4tdfggVhfjdfxfgsdofgffgdfghtdfhw7fghFdfgh546lrghf6dr6t75ghm453,34645257,Dfg Cactus");
		System.out.println("246745,dfsg4tsdgtwt43rgq4tygesrfgaw4tw456yuwrhbw5ytw45gw45twgwdegfw4442,65345435,Ort Cactus");
		System.out.println("end");
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextLine()){
			String str=sc.nextLine();
			String[] tokens = str.split(",");
			if(tokens.length==0)continue;
			if(tokens.length==1)break;
			if(tokens.length==2){
				int num=Integer.valueOf(tokens[0]).intValue();
				String name="_"+tokens[1].trim().replace(' ', '_')+"_";
				Class itemClass=Class.forName("ru.itx.EveAssets.production.product."+name);
				Item item=(Item)(itemClass.getDeclaredConstructor(int.class).newInstance(num));
				items.add(item);
			}
			if(tokens.length==4){
				//vKeyID,vCode,charID,CharName
				_credentials.add(new Credential(Integer.valueOf(tokens[0]).intValue(), tokens[1],Integer.valueOf(tokens[2]).intValue(), tokens[3]));		
			}
		}
		
	}
	
	
    public static void main( String[] args ) throws Exception
    {
    	interceptErrOn();
    	App app=new App();
		//==================================
		// calculate !!!!
		//==================================
		System.out.println("===================================================================");
		System.out.println("=======================Must production=============================");
		app.inputFromStdin();

		Item.print(app.items);
		System.out.println("===================================================================");
		System.out.println("==========================Receips==============================");
		for(Item item:app.items){
			app.result.addAll(item.make());
		}
		app.result=Item.comress(app.result);
		Item.print(app.result);
		System.out.println("===================================================================");
		System.out.print("  Continue (y/n)?");
		Scanner sc=new Scanner(System.in);
		if(!sc.next().equals("y")) System.exit(0);
		System.out.println("===================================================================");
		System.out.println("=============================Money=================================");
        //==================================
        // Get Ware
        //==================================

		System.out.print("  Load from File or Eve (f/e)?");
		String answer=sc.next();
    	if(answer.equals("e")){
    		IServerStatus status = Data.getInstance().serverAPIHandle.requestServerStatus();
    		if (!Data.getInstance().serverAPIHandle.isError()) {
    			if (status.isServerOpen()) {
    				System.out.println("EVE is online with " + status.getOnlinePlayers() + " players.");
    				System.out.println("====================");
    				for(ICharacterAPI ic:Data.getInstance().charAPIHandles.values()){
    					ICharacterSheet sheet = ic.requestCharacterSheet();
    					System.out.printf("%1$10s:  %2$s\n","Name",sheet.getName());
    					System.out.printf("%1$10s:  %2$s\n","Z",NumberFormat.getCurrencyInstance().format(sheet.getBalance()));
    					System.out.printf("%1$10s:  %2$s\n","Home",sheet.getHomeStationID());
    				}
    				System.out.println("====================");
    		    	app.loadStations();
    				app.loadSolarSystem();
    				app.loadConquerableStation();
    				System.out.print("Load assets(y/n)?");
    				if(sc.next().equals("y"))app.loadAssets();
    				System.out.print("Load orders(y/n)?");
    				if(sc.next().equals("y"))app.loadOrders();
    				System.out.print("Load jobs(y/n)?");
    				if(sc.next().equals("y"))app.LoadJobs();
    				// Save to File here
    				Data.getInstance().saveDataToFile();
    			} else {
    				System.out.println("EVE is offline.");
    			}
    		}
    	}else{
    		//Load from File here
    		Data.loadDataFromFile();
	    	app.loadStations();
    		Data.getInstance().recalculateCacheQuantity();
    	}
		System.out.println("\n===================================================================");
		System.out.println("=========================Need to bye===============================");
		app.result=new ArrayList<Item>();
		for(Item item:app.items){
			app.result.addAll(item.makeFromRest());
		}
		app.result=Item.comress(app.result);
		Item.print(app.result);
    	interceptErrOff();
    }
}
