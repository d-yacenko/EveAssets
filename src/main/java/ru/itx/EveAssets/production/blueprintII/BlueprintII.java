package ru.itx.EveAssets.production.blueprintII;

import java.util.ArrayList;

import ru.itx.EveAssets.production.Blueprint;
import ru.itx.EveAssets.production.Item;
import ru.itx.EveAssets.production.blueprint.BlueprintI;
import ru.itx.EveAssets.production.datacore.Datacore;
import ru.itx.EveAssets.production.decryptor.Decryptor;

public abstract class BlueprintII extends Blueprint {

	
	public static int DEFAULT_ME=10;
	public static int DEFAULT_TE=20;
	public static int DEFAULT_RUNS=1;
	public static int DEFAULT_PROBABILTY=0;
	

	
	Datacore datacore1;
	Datacore datacore2;
	Decryptor decryptor;
	BlueprintI blueprint;
	
	@Override
	public ArrayList<Item> make() {
		return make(1);
	}
	@Override
	public ArrayList<Item> makeFromRest() {
		return makeFromRest(1);
	}
	
	public BlueprintII() {
		me=DEFAULT_ME;
		te=DEFAULT_TE;
		runs=DEFAULT_RUNS;
	}
	
	public void recalculateEfficiency(){
		runs+=decryptor.modRuns;
		me+=decryptor.modME;
		te+=decryptor.modTE;
	}
	
	
	@Override
	public ArrayList<Item> make(double run) {

//		double r=100.*run/((1.*blueprint.probability+blueprint.probability*decryptor.modProbability/100.)*(blueprint.runs+decryptor.modRuns));
		double probab=1.*blueprint.probability+blueprint.probability*decryptor.modProbability/100.;
		double r= probab*(1+decryptor.modRuns)/100;
		run=(int)Math.ceil(1.0*run/r);
		ArrayList<Item> items=new ArrayList<Item>();
		Item tmpItem=Item.duplicate(decryptor, volume*(int)run*decryptor.volume);
		if(tmpItem!=null)items.add(tmpItem);
		tmpItem=Item.duplicate(datacore1, volume*(int)run*datacore1.volume);
		if(tmpItem!=null)items.add(tmpItem);
		tmpItem=Item.duplicate(datacore2, volume*(int)run*datacore2.volume);
		if(tmpItem!=null)items.add(tmpItem);
		tmpItem=Item.duplicate(blueprint, volume*(int)run*blueprint.volume);
		if(tmpItem!=null)items.add(tmpItem);
		return items;
	}
	@Override
	public ArrayList<Item> makeFromRest(double run) {
		double probab=1.*blueprint.probability+blueprint.probability*decryptor.modProbability/100.;
		double r= probab*(1+decryptor.modRuns)/100;
		run=(int)Math.ceil(1.0*run/r);
		ArrayList<Item> items=new ArrayList<Item>();
		Item tmpItem=Item.duplicate(decryptor, minus(decryptor.getName(),volume*(int)run*decryptor.volume));
		if(tmpItem!=null)items.add(tmpItem);
		tmpItem=Item.duplicate(datacore1, minus(datacore1.getName(), volume*(int)run*datacore1.volume));
		if(tmpItem!=null)items.add(tmpItem);
		tmpItem=Item.duplicate(datacore2, minus(datacore2.getName(), volume*(int)run*datacore2.volume));
		if(tmpItem!=null)items.add(tmpItem);
		tmpItem=Item.duplicate(blueprint, minus(blueprint.getName(), volume*(int)run*blueprint.volume));
		if(tmpItem!=null)items.add(tmpItem);
		return items;
	}
}
