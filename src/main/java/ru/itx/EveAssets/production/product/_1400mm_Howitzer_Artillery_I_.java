package ru.itx.EveAssets.production.product;

import java.util.ArrayList;

import ru.itx.EveAssets.production.Item;
import ru.itx.EveAssets.production.blueprint.Blueprint_1400mm_Howitzer_Artillery_I_;
import ru.itx.EveAssets.production.blueprint.Blueprint_800mm_Repeating_Cannon_I_;
import ru.itx.EveAssets.production.material.Isogen;
import ru.itx.EveAssets.production.material.Megacyte;
import ru.itx.EveAssets.production.material.Mexallon;
import ru.itx.EveAssets.production.material.Nocxium;
import ru.itx.EveAssets.production.material.Pyerite;
import ru.itx.EveAssets.production.material.Tritanium;
import ru.itx.EveAssets.production.material.Zydrine;

public class _1400mm_Howitzer_Artillery_I_ extends Prototype {

	
	public _1400mm_Howitzer_Artillery_I_(int volume) {
		this.volume=volume;
		materials=new ArrayList<Item>();
		materials.add(new Tritanium(113880));
		materials.add(new Pyerite(29214));
		materials.add(new Mexallon(9747));
		materials.add(new Isogen(2650));
		materials.add(new Nocxium(411));
		materials.add(new Zydrine(42));
		materials.add(new Megacyte(74));
		blueprint=new Blueprint_1400mm_Howitzer_Artillery_I_(1);
		isElementary=false;
	}

	@Override
	public String getName() {
		return "1400mm Howitzer Artillery I";
	}	
}
