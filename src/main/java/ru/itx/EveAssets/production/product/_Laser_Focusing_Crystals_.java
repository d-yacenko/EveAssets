package ru.itx.EveAssets.production.product;

import java.util.ArrayList;

import ru.itx.EveAssets.production.Item;
import ru.itx.EveAssets.production.blueprint.Blueprint_Laser_Focusing_Crystals_;
import ru.itx.EveAssets.production.blueprint.Blueprint_Particle_Acellerator_Unit_;
import ru.itx.EveAssets.production.material.CrystallineCarbonide;
import ru.itx.EveAssets.production.material.Fullerides;
import ru.itx.EveAssets.production.material.HypersynapticFibers;
import ru.itx.EveAssets.production.material.TungstenCarbide;

public class _Laser_Focusing_Crystals_ extends Prototype {
	public _Laser_Focusing_Crystals_(int volume) {
		this.volume = volume;
		materials=new ArrayList<Item>();
		materials.add(new TungstenCarbide(28));
		materials.add(new Fullerides(10));
		materials.add(new HypersynapticFibers(1));
		blueprint = new Blueprint_Laser_Focusing_Crystals_(1);
		isElementary = false;
	}
	
	@Override
	public String getName() {
		return "Laser Focusing Crystals";
	}	
}
