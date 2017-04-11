package ru.itx.EveAssets.production.product;

import java.util.ArrayList;

import ru.itx.EveAssets.production.Item;
import ru.itx.EveAssets.production.blueprint.Blueprint_800mm_Repeating_Cannon_I_;
import ru.itx.EveAssets.production.blueprint.Blueprint_Slasher_;
import ru.itx.EveAssets.production.material.Isogen;
import ru.itx.EveAssets.production.material.Megacyte;
import ru.itx.EveAssets.production.material.Mexallon;
import ru.itx.EveAssets.production.material.Nocxium;
import ru.itx.EveAssets.production.material.Pyerite;
import ru.itx.EveAssets.production.material.Tritanium;
import ru.itx.EveAssets.production.material.Zydrine;

public class _Slasher_ extends Prototype {

	
	public _Slasher_(int volume) {
		this.volume=volume;
		materials=new ArrayList<Item>();
		materials.add(new Tritanium(21111));
		materials.add(new Pyerite(5000));
		materials.add(new Mexallon(1667));
		materials.add(new Isogen(111));
		materials.add(new Nocxium(100));
		materials.add(new Megacyte(6));
		blueprint=new Blueprint_Slasher_(1);
		isElementary=false;
	}
@Override
public String getName() {
	// TODO Auto-generated method stub
	return "Slasher";
}
}
