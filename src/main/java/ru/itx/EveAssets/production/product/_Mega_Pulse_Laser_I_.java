package ru.itx.EveAssets.production.product;

import java.util.ArrayList;

import ru.itx.EveAssets.production.Item;
import ru.itx.EveAssets.production.blueprint.Blueprint_Mega_Pulse_Laser_I_;
import ru.itx.EveAssets.production.blueprint.Blueprint_Neutron_Blaster_Cannon_I_;
import ru.itx.EveAssets.production.material.Isogen;
import ru.itx.EveAssets.production.material.Megacyte;
import ru.itx.EveAssets.production.material.Mexallon;
import ru.itx.EveAssets.production.material.Nocxium;
import ru.itx.EveAssets.production.material.Pyerite;
import ru.itx.EveAssets.production.material.Tritanium;
import ru.itx.EveAssets.production.material.Zydrine;

public class _Mega_Pulse_Laser_I_ extends Prototype {

	
	public _Mega_Pulse_Laser_I_(int volume) {
		this.volume=volume;
		materials=new ArrayList<Item>();
		materials.add(new Tritanium(68307));
		materials.add(new Pyerite(17839));
		materials.add(new Mexallon(7197));
		materials.add(new Isogen(1951));
		materials.add(new Nocxium(234));
		materials.add(new Zydrine(12));
		materials.add(new Megacyte(26));
		blueprint=new Blueprint_Mega_Pulse_Laser_I_(1);
		isElementary=false;
	}
	
	@Override
	public String getName() {
		return "Mega Pulse Laser I";
	}	

}
