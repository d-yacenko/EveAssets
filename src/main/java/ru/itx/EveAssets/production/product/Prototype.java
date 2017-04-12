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
	public ArrayList<Item> make(double run) {
		ArrayList<Item> items = new ArrayList<Item>();
		double me=1.-blueprint.me/100.;
		if (blueprint.isElementary) {
			Item tmpItem=Item.duplicate(blueprint, (int)Math.ceil(me*volume*run/blueprint.runs));
			items.add(tmpItem);
		} else{
			items.addAll(blueprint.make((int)Math.ceil(me*run*volume)));
		}
		for (Item item : materials)
			if (item.isElementary) {
				Item tmpItem;
				if(me*item.volume<1)
					tmpItem=Item.duplicate(item, (int)(Math.ceil(me*item.volume)*volume*run));
				else
					tmpItem=Item.duplicate(item, (int)(Math.ceil(me*item.volume*volume*run)));
				items.add(tmpItem);
			} else{
				if(item.isMetaMaterials) 
					items.addAll(item.make(me*volume*run));
				else items.addAll(item.make(run*volume));
			}
		return items;
	}
	
	
	@Override
	public ArrayList<Item> makeFromRest(double run) {
		ArrayList<Item> items = new ArrayList<Item>();
		double me=1.-blueprint.me/100.;
		if (blueprint.isElementary) {
			Item tmpItem=Item.duplicate(blueprint, minus(blueprint.getName(), (int)Math.ceil(me*volume*run/(1.0*blueprint.runs))));
			items.add(tmpItem);
		} else{
			items.addAll(blueprint.makeFromRest(minus(blueprint.getName(),(int)Math.ceil(me*run*volume))));
		}
		for (Item item : materials)
			if (item.isElementary) {
				Item tmpItem;
				if(me*item.volume<1)
					tmpItem=Item.duplicate(item, minus(item.getName(),(int)(Math.ceil(me*item.volume)*volume*run)));
				else 
					tmpItem=Item.duplicate(item, minus(item.getName(),(int)(Math.ceil(me*item.volume*volume*run))));
				items.add(tmpItem);
			} else{
				if(item.isMetaMaterials){
					double allNeededWithME=me*run*volume*item.volume;
					allNeededWithME=minus(item.getName(),(int)allNeededWithME);
					allNeededWithME/=item.volume;
					items.addAll(item.makeFromRest(allNeededWithME));
				}
				else {
					double allNeeded=run*volume*item.volume;
					allNeeded=minus(item.getName(),(int)allNeeded);
					allNeeded/=item.volume;
					items.addAll(item.makeFromRest(allNeeded));
				}
			}
		return items;
	}
}
