package ru.itx.EveAssets.production.product;

import java.util.ArrayList;

import ru.itx.EveAssets.production.Item;
import ru.itx.EveAssets.production.blueprintII.Blueprint_Neutron_Blaster_Cannon_II_;
import ru.itx.EveAssets.production.material.Morphite;
import ru.itx.EveAssets.production.material.Robotics;

public class _Neutron_Blaster_Cannon_II_ extends Prototype {

	
	public _Neutron_Blaster_Cannon_II_(int volume) {
		this.volume=volume;
		materials=new ArrayList<Item>();
		materials.add(new _Neutron_Blaster_Cannon_I_(1));
		materials.add(new _RAM_Weapon_Tech_(1));
		materials.add(new _Particle_Acellerator_Unit_(34));
		materials.add(new Morphite(14));
		materials.add(new Robotics(15));
		blueprint=new Blueprint_Neutron_Blaster_Cannon_II_(1);
		isElementary=false;
	}

	@Override
	public String getName() {
		return "Neutron Blaster Cannon II";
	}	

}
