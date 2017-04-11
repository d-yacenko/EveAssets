package ru.itx.EveAssets.production.product;

import java.util.ArrayList;

import ru.itx.EveAssets.production.Item;
import ru.itx.EveAssets.production.blueprintII.Blueprint_Mega_Pulse_Laser_II_;
import ru.itx.EveAssets.production.blueprintII.Blueprint_Neutron_Blaster_Cannon_II_;
import ru.itx.EveAssets.production.material.Morphite;
import ru.itx.EveAssets.production.material.Robotics;

public class _Mega_Pulse_Laser_II_ extends Prototype {

	
	public _Mega_Pulse_Laser_II_(int volume) {
		this.volume=volume;
		materials=new ArrayList<Item>();
		materials.add(new _Mega_Pulse_Laser_I_(1));
		materials.add(new _RAM_Weapon_Tech_(1));
		materials.add(new _Laser_Focusing_Crystals_(33));
		materials.add(new Morphite(34));
		materials.add(new Robotics(14));
		blueprint=new Blueprint_Mega_Pulse_Laser_II_(1);
		isElementary=false;
	}

	@Override
	public String getName() {
		return "Mega Pulse Laser II";
	}	

}
