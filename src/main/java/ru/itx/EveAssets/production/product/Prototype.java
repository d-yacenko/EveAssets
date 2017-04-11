package ru.itx.EveAssets.production.product;

import java.util.ArrayList;

import ru.itx.EveAssets.Data;
import ru.itx.EveAssets.production.Blueprint;
import ru.itx.EveAssets.production.Item;

public abstract class Prototype extends Item {
	ArrayList<Item> materials;
	Blueprint blueprint;

	@Override
	public ArrayList<Item> make() {
		return make(1);
	}
	@Override
	public ArrayList<Item> makeFromRest() {
		return makeFromRest(1);
	}

	@Override
	public ArrayList<Item> make(int run) {
		double me=1.-blueprint.me/100;
		ArrayList<Item> items = new ArrayList<Item>();
		for (Item item : materials)
			if (item.isElementary) {
				Item tmpItem=Item.duplicate(item, (int)(me*volume*run*item.volume));
				if(tmpItem!=null)items.add(tmpItem);
			} else{
				items.addAll(item.make((int)(me*run*volume)));
			}
		if (blueprint.isElementary) {
			Item tmpItem=null;
			if(blueprint.runs!=0)
				tmpItem=Item.duplicate(blueprint, (int)Math.ceil(1.0*volume*run*blueprint.volume/blueprint.runs));
			else tmpItem=Item.duplicate(blueprint, volume*run*blueprint.volume);
			if(tmpItem!=null)items.add(tmpItem);

		} else
			items.addAll(blueprint.make(run*volume));
		return items;
	}
	@Override
	public ArrayList<Item> makeFromRest(int run) {
		double me=1.-blueprint.me/100;
		ArrayList<Item> items = new ArrayList<Item>();
		for (Item item : materials)
			if (item.isElementary) {
				Item tmpItem=Item.duplicate(item, minus(item.getName(),(int)(me*volume*run*item.volume)));
				if(tmpItem!=null)items.add(tmpItem);
			} else{
				items.addAll(item.makeFromRest((int)(minus(item.getName(),(int)(me*run*volume*item.volume))/(me*item.volume))));
			}
		if (blueprint.isElementary) {
			Item tmpItem=null;
			if(blueprint.runs!=0){
				tmpItem=Item.duplicate(blueprint, minus(blueprint.getName(),(int)Math.ceil(1.0*volume*run*blueprint.volume/blueprint.runs)));
			}
			else { 
				tmpItem=Item.duplicate(blueprint,minus(blueprint.getName(),volume*run*blueprint.volume));
			}
			if(tmpItem!=null)items.add(tmpItem);

		} else{
			items.addAll(blueprint.makeFromRest(minus(blueprint.getName(),run*volume*blueprint.volume)/blueprint.volume));
		}
		return items;
	}
}
