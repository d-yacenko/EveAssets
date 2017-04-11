package ru.itx.EveAssets.production.product;

import java.util.ArrayList;

import ru.itx.EveAssets.production.Item;
import ru.itx.EveAssets.production.blueprint.Blueprint_Particle_Acellerator_Unit_;
import ru.itx.EveAssets.production.material.CrystallineCarbonide;
import ru.itx.EveAssets.production.material.Fullerides;
import ru.itx.EveAssets.production.material.HypersynapticFibers;

public class _Particle_Acellerator_Unit_ extends Prototype {
	public _Particle_Acellerator_Unit_(int volume) {
		this.volume = volume;
		materials.add(new HypersynapticFibers(1));
		materials=new ArrayList<Item>();
		materials.add(new CrystallineCarbonide(31));
		materials.add(new Fullerides(11));
		blueprint = new Blueprint_Particle_Acellerator_Unit_(1);
		isMetaMaterials=true;
		isElementary = false;
	}
	
	@Override
	public String getName() {
		return "Particle Acellerator Unit";
	}	
}
