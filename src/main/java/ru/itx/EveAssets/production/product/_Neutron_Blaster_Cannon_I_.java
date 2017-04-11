package ru.itx.EveAssets.production.product;

import java.util.ArrayList;

import ru.itx.EveAssets.production.Item;
import ru.itx.EveAssets.production.blueprint.Blueprint_Neutron_Blaster_Cannon_I_;
import ru.itx.EveAssets.production.material.Isogen;
import ru.itx.EveAssets.production.material.Megacyte;
import ru.itx.EveAssets.production.material.Mexallon;
import ru.itx.EveAssets.production.material.Nocxium;
import ru.itx.EveAssets.production.material.Pyerite;
import ru.itx.EveAssets.production.material.Tritanium;
import ru.itx.EveAssets.production.material.Zydrine;

public class _Neutron_Blaster_Cannon_I_ extends Prototype {

	
	public _Neutron_Blaster_Cannon_I_(int volume) {
		this.volume=volume;
		materials=new ArrayList<Item>();
		materials.add(new Tritanium(82871));
		materials.add(new Pyerite(21410));
		materials.add(new Mexallon(7838));
		materials.add(new Isogen(2088));
		materials.add(new Nocxium(295));
		materials.add(new Zydrine(17));
		materials.add(new Megacyte(48));
		blueprint=new Blueprint_Neutron_Blaster_Cannon_I_(1);
		isElementary=false;
	}
	
	@Override
	public String getName() {
		return "Neutron Blaster Cannon I";
	}	

}
