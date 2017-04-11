package ru.itx.EveAssets.production.product;

import java.util.ArrayList;

import ru.itx.EveAssets.production.Item;
import ru.itx.EveAssets.production.blueprint.Blueprint_800mm_Repeating_Cannon_I_;
import ru.itx.EveAssets.production.material.Isogen;
import ru.itx.EveAssets.production.material.Megacyte;
import ru.itx.EveAssets.production.material.Mexallon;
import ru.itx.EveAssets.production.material.Nocxium;
import ru.itx.EveAssets.production.material.Pyerite;
import ru.itx.EveAssets.production.material.Tritanium;
import ru.itx.EveAssets.production.material.Zydrine;

public class _800mm_Repeating_Cannon_I_ extends Prototype {

	
	public _800mm_Repeating_Cannon_I_(int volume) {
		this.volume=volume;
		materials=new ArrayList<Item>();
		materials.add(new Tritanium(62843));
		materials.add(new Pyerite(16412));
		materials.add(new Mexallon(6622));
		materials.add(new Isogen(1795));
		materials.add(new Nocxium(216));
		materials.add(new Zydrine(12));
		materials.add(new Megacyte(24));
		blueprint=new Blueprint_800mm_Repeating_Cannon_I_(1);
		isElementary=false;
	}

	@Override
	public String getName() {
		return "800mm Repeating Cannon I";
	}	
}
