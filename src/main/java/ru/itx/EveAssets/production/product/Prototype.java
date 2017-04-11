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
		ArrayList<Item> items = new ArrayList<Item>();
		double me=1.-blueprint.me/100.;
		if (blueprint.isElementary) {
			Item tmpItem=Item.duplicate(blueprint, (int)Math.ceil(me*volume*run/(1.0*blueprint.runs)));
			items.add(tmpItem);
		} else{
			items.addAll(blueprint.make((int)Math.ceil(me*run*volume)));
		}
		for (Item item : materials)
			if (item.isElementary) {
				Item tmpItem=Item.duplicate(item, item.calcWithME(volume*run,me));
				items.add(tmpItem);
			} else{
				if(item.isMetaMaterials)items.addAll(item.make(calcWithME(volume*run, me)/item.volume));
				else items.addAll(item.make(run*volume));
			}
		return items;
	}
	@Override
	public ArrayList<Item> makeFromRest(int run) {
		ArrayList<Item> items = new ArrayList<Item>();
		double me=1.-blueprint.me/100.;
		if (blueprint.isElementary) {
			Item tmpItem=Item.duplicate(blueprint, minus(blueprint.getName(),(int)Math.ceil(me*volume*run/(1.0*blueprint.runs))));
			items.add(tmpItem);
		} else{
			items.addAll(blueprint.makeFromRest(minus(blueprint.getName(),(int)Math.ceil(me*run*volume))));
		}
		for (Item item : materials)
			if (item.isElementary) {
				Item tmpItem=Item.duplicate(item, minus(item.getName(),(int)Math.ceil(me*item.volume)*volume*run));
				items.add(tmpItem);
			} else{
				if(item.isMetaMaterials)items.addAll(item.makeFromRest((int)(minus(item.getName(),(int)Math.ceil(me*run*volume*item.volume))/(me*item.volume))));
				else items.addAll(item.makeFromRest((int)(minus(item.getName(),run*volume*item.volume)/(item.volume))));
			}
		return items;
	}
}
