package ru.itx.EveAssets;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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

	public void LoadAssets() throws IOException{
	    // All assets 
		for(ICharacterAPI ic:Data.getInstance().charAPIHandles.values()){
			long characterID=ic.requestCharacterSheet().getCharacterID();
			System.out.println(ic.requestCharacterSheet().getName());
			System.out.println("+++++++++++++++");
			Set<IAsset> assets=(Set<IAsset>) ic.requestAssets();
			Data.getInstance().scanAssets(assets,characterID);
		}		
	}

	public void LoadOders() throws IOException{
	    // All assets 
		for(ICharacterAPI ic:Data.getInstance().charAPIHandles.values()){
			long characterID=ic.requestCharacterSheet().getCharacterID();
			System.out.println(ic.requestCharacterSheet().getName());
			System.out.println("+++++++++++++++");
			Collection<IMarketOrder> orders=(Collection<IMarketOrder>) ic.requestMarketOrders();
			Data.getInstance().scanOrders(orders,characterID);
		}		
	}
	
    public static void main( String[] args ) throws Exception
    {
    	Scanner sc=new Scanner(System.in);
		//==================================
		// calculate !!!!
		//==================================
		System.out.println("===================================================================");
		System.out.println("=======================Must production=============================");
		ArrayList<Item> items=new ArrayList<Item>();
		ArrayList<Item> result=new ArrayList<Item>();
//		items.add(new _Nanomechanical_Microprocessor_(2757));
//		items.add(new _Slasher_(200));
		items.add(new _Stiletto_(77));
//		items.add(new _Scythe_(115));
//		items.add(new _Scimitar_(10));
//		items.add(new _Mega_Pulse_Laser_I_(200));
//		items.add(new _Mega_Pulse_Laser_II_(200));
//		items.add(new _800mm_Repeating_Cannon_II_(115));
//		items.add(new _RAM_Weapon_Tech_(115));
//		items.add(new _800mm_Repeating_Cannon_I_(115));
//		items.add(new _Neutron_Blaster_Cannon_I_(200));
//		items.add(new _Neutron_Blaster_Cannon_II_(200));
		Item.print(items);
		System.out.println("===================================================================");
		System.out.println("==========================Receips==============================");
		for(Item item:items){
			result.addAll(item.make());
		}
		result=Item.comress(result);
		Item.print(result);
		System.out.println("===================================================================");
		System.out.print("  Continue (y/n)?");
		if(!sc.next().equals("y")) System.exit(0);
		System.out.println("===================================================================");
		System.out.println("=============================Money=================================");
        //==================================
        // Get Ware
        //==================================

		System.out.print("  Load from File or Eve (f/e)?");
		String answer=sc.next();
    	App app=new App();
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
    					System.out.printf("%1$10s:  %2$s\n","Name",Data.getInstance().getSolarSystem((int)sheet.getHomeStationID()));
    				}
    				System.out.println("====================");
    		    	app.loadStations();
    				app.loadSolarSystem();
    				app.loadConquerableStation();
    				app.LoadAssets();
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
		result=new ArrayList<Item>();
		for(Item item:items){
			result.addAll(item.makeFromRest());
		}
		result=Item.comress(result);
		Item.print(result);
    }
}
