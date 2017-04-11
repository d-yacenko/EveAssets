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
		materials.add(new Tritanium(61477));
		materials.add(new Pyerite(16056));
		materials.add(new Mexallon(6478));
		materials.add(new Isogen(1756));
		materials.add(new Nocxium(211));
		materials.add(new Zydrine(11));
		materials.add(new Megacyte(24));
		blueprint=new Blueprint_Mega_Pulse_Laser_I_(1);
		isElementary=false;
	}
	
	@Override
	public String getName() {
		return "Mega Pulse Laser I";
	}	

}
