package ru.itx.EveAssets.production.product;

import java.util.ArrayList;

import ru.itx.EveAssets.production.Item;
import ru.itx.EveAssets.production.blueprint.Blueprint_RAM_Weapon_Tech_;
import ru.itx.EveAssets.production.material.Isogen;
import ru.itx.EveAssets.production.material.Mexallon;
import ru.itx.EveAssets.production.material.Nocxium;
import ru.itx.EveAssets.production.material.Pyerite;
import ru.itx.EveAssets.production.material.Tritanium;

public class _RAM_Weapon_Tech_ extends Prototype {
	public _RAM_Weapon_Tech_(int volume) {
		this.volume = volume;
		materials=new ArrayList<Item>();
		materials.add(new Tritanium(556));
		materials.add(new Pyerite(444));
		materials.add(new Mexallon(222));
		materials.add(new Isogen(82));
		materials.add(new Nocxium(36));
		blueprint = new Blueprint_RAM_Weapon_Tech_(1);
		isElementary = false;
	}
	
	@Override
	public String getName() {
		return "R.A.M.- Weapon Tech";
	}	
}
