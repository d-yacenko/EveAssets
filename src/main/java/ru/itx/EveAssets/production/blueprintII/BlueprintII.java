package ru.itx.EveAssets.production.blueprintII;

import java.util.ArrayList;

import ru.itx.EveAssets.production.Blueprint;
import ru.itx.EveAssets.production.Item;
import ru.itx.EveAssets.production.blueprint.BlueprintI;
import ru.itx.EveAssets.production.datacore.Datacore;
import ru.itx.EveAssets.production.decryptor.Decryptor;

public abstract class BlueprintII extends Blueprint {
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
		me=3;te=2;
	}
	
	@Override
	public ArrayList<Item> make(int run) {
		double r=100.*run/((blueprint.probability+blueprint.probability*decryptor.probability/100)*(blueprint.runs+decryptor.runs));
		run=(int)Math.ceil(r);
		ArrayList<Item> items=new ArrayList<Item>();
		Item tmpItem=Item.duplicate(decryptor, volume*run*decryptor.volume);
		if(tmpItem!=null)items.add(tmpItem);
		tmpItem=Item.duplicate(datacore1, volume*run*datacore1.volume);
		if(tmpItem!=null)items.add(tmpItem);
		tmpItem=Item.duplicate(datacore2, volume*run*datacore2.volume);
		if(tmpItem!=null)items.add(tmpItem);
		tmpItem=Item.duplicate(blueprint, volume*run*blueprint.volume);
		if(tmpItem!=null)items.add(tmpItem);
		return items;
	}
	@Override
	public ArrayList<Item> makeFromRest(int run) {
		double r=100.*run/((blueprint.probability+blueprint.probability*decryptor.probability/100)*(blueprint.runs+decryptor.runs));
		run=(int)Math.ceil(r);
		ArrayList<Item> items=new ArrayList<Item>();
		Item tmpItem=Item.duplicate(decryptor, minus(decryptor.getName(),volume*run*decryptor.volume));
		if(tmpItem!=null)items.add(tmpItem);
		tmpItem=Item.duplicate(datacore1, minus(datacore1.getName(), volume*run*datacore1.volume));
		if(tmpItem!=null)items.add(tmpItem);
		tmpItem=Item.duplicate(datacore2, minus(datacore2.getName(), volume*run*datacore2.volume));
		if(tmpItem!=null)items.add(tmpItem);
		tmpItem=Item.duplicate(blueprint, minus(blueprint.getName(), volume*run*blueprint.volume));
		if(tmpItem!=null)items.add(tmpItem);
		return items;
	}
}
