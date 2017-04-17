package ru.itx.EveAssets.production.product;

import java.util.ArrayList;

import ru.itx.EveAssets.production.Item;
import ru.itx.EveAssets.production.blueprint.Blueprint_800mm_Repeating_Cannon_I_;
import ru.itx.EveAssets.production.blueprint.Blueprint_Slasher_;
import ru.itx.EveAssets.production.blueprint.Blueprint_Wreathe_;
import ru.itx.EveAssets.production.material.Isogen;
import ru.itx.EveAssets.production.material.Megacyte;
import ru.itx.EveAssets.production.material.Mexallon;
import ru.itx.EveAssets.production.material.Nocxium;
import ru.itx.EveAssets.production.material.Pyerite;
import ru.itx.EveAssets.production.material.Tritanium;
import ru.itx.EveAssets.production.material.Zydrine;

public class _Wreathe_ extends Prototype {

	
	public _Wreathe_(int volume) {
		this.volume=volume;
		materials=new ArrayList<Item>();
		materials.add(new Tritanium(82222));
		materials.add(new Pyerite(9333));
		materials.add(new Mexallon(3889));
		materials.add(new Isogen(667));
		materials.add(new Nocxium(133));
		materials.add(new Zydrine(88));
		materials.add(new Megacyte(12));
		blueprint=new Blueprint_Wreathe_(1);
		isElementary=false;
	}
@Override
public String getName() {
	// TODO Auto-generated method stub
	return "Wreathe";
}
}
