package ru.itx.EveAssets.production.product;

import java.util.ArrayList;

import ru.itx.EveAssets.production.Item;
import ru.itx.EveAssets.production.blueprint.Blueprint_Deflection_Shield_Emitter_;
import ru.itx.EveAssets.production.blueprint.Blueprint_Ladar_Sensor_Cluster_;
import ru.itx.EveAssets.production.blueprint.Blueprint_Particle_Acellerator_Unit_;
import ru.itx.EveAssets.production.blueprint.Blueprint_Plasma_Thruster_;
import ru.itx.EveAssets.production.material.CrystallineCarbonide;
import ru.itx.EveAssets.production.material.FerniteCarbide;
import ru.itx.EveAssets.production.material.Ferrogel;
import ru.itx.EveAssets.production.material.Fullerides;
import ru.itx.EveAssets.production.material.HypersynapticFibers;
import ru.itx.EveAssets.production.material.Nanotransistors;
import ru.itx.EveAssets.production.material.PhenolicComposites;
import ru.itx.EveAssets.production.material.SylramicFibers;

public class _Deflection_Shield_Emitter_ extends Prototype {
	public _Deflection_Shield_Emitter_(int volume) {
		this.volume = volume;
		materials=new ArrayList<Item>();
		materials.add(new FerniteCarbide(20));
		materials.add(new Ferrogel(1));
		materials.add(new SylramicFibers(9));
		blueprint = new Blueprint_Deflection_Shield_Emitter_(1);
		isElementary = false;
	}
	
	@Override
	public String getName() {
		return "Deflection Shield Emitter";
	}	
}
