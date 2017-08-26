package ru.itx.EveAssets.production.product;

import java.util.ArrayList;

import ru.itx.EveAssets.production.Item;
import ru.itx.EveAssets.production.blueprint.Blueprint_Torpedo_Launcher_I_;
import ru.itx.EveAssets.production.material.Megacyte;
import ru.itx.EveAssets.production.material.Nocxium;
import ru.itx.EveAssets.production.material.Pyerite;
import ru.itx.EveAssets.production.material.Tritanium;
import ru.itx.EveAssets.production.material.Zydrine;

public class _Torpedo_Launcher_I_ extends Prototype {

	
	public _Torpedo_Launcher_I_(int volume) {
		this.volume=volume;
		materials=new ArrayList<Item>();
		materials.add(new Tritanium(122));
		materials.add(new Pyerite(1342));
		materials.add(new Nocxium(9));
		materials.add(new Zydrine(4));
		materials.add(new Megacyte(22));
		blueprint=new Blueprint_Torpedo_Launcher_I_(1);
		isElementary=false;
	}

	@Override
	public String getName() {
		return "Torpedo Launcher I";
	}	
}
