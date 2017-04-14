package ru.itx.EveAssets.production.product;

import java.util.ArrayList;

import ru.itx.EveAssets.production.Item;
import ru.itx.EveAssets.production.blueprint.Blueprint_Laser_Focusing_Crystals_;
import ru.itx.EveAssets.production.blueprint.Blueprint_Particle_Accelerator_Unit_;
import ru.itx.EveAssets.production.material.CrystallineCarbonide;
import ru.itx.EveAssets.production.material.Fullerides;
import ru.itx.EveAssets.production.material.HypersynapticFibers;
import ru.itx.EveAssets.production.material.TungstenCarbide;

public class _Laser_Focusing_Crystals_ extends Prototype {
	public _Laser_Focusing_Crystals_(int volume) {
		this.volume = volume;
		materials=new ArrayList<Item>();
		materials.add(new TungstenCarbide(31));
		materials.add(new HypersynapticFibers(1));
		materials.add(new Fullerides(11));
		blueprint = new Blueprint_Laser_Focusing_Crystals_(1);
		isMetaMaterials=true;
		isElementary = false;
	}
	
	@Override
	public String getName() {
		return "Laser Focusing Crystals";
	}	
}
