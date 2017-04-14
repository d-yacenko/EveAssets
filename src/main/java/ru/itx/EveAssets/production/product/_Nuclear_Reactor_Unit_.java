package ru.itx.EveAssets.production.product;

import java.util.ArrayList;

import ru.itx.EveAssets.production.Item;
import ru.itx.EveAssets.production.blueprint.Blueprint_Ladar_Sensor_Cluster_;
import ru.itx.EveAssets.production.blueprint.Blueprint_Nuclear_Reactor_Unit_;
import ru.itx.EveAssets.production.blueprint.Blueprint_Particle_Accelerator_Unit_;
import ru.itx.EveAssets.production.blueprint.Blueprint_Plasma_Thruster_;
import ru.itx.EveAssets.production.material.CrystallineCarbonide;
import ru.itx.EveAssets.production.material.FermionicCondensates;
import ru.itx.EveAssets.production.material.FerniteCarbide;
import ru.itx.EveAssets.production.material.Ferrogel;
import ru.itx.EveAssets.production.material.Fullerides;
import ru.itx.EveAssets.production.material.HypersynapticFibers;
import ru.itx.EveAssets.production.material.Nanotransistors;
import ru.itx.EveAssets.production.material.PhenolicComposites;

public class _Nuclear_Reactor_Unit_ extends Prototype {
	public _Nuclear_Reactor_Unit_(int volume) {
		this.volume = volume;
		materials=new ArrayList<Item>();
		materials.add(new FerniteCarbide(9));
		materials.add(new FermionicCondensates(2));
		blueprint = new Blueprint_Nuclear_Reactor_Unit_(1);
		isMetaMaterials=true;
		isElementary = false;
	}
	
	@Override
	public String getName() {
		return "Nuclear Reactor Unit";
	}	
}
