package ru.itx.EveAssets.production.product;

import java.util.ArrayList;

import ru.itx.EveAssets.production.Item;
import ru.itx.EveAssets.production.blueprint.Blueprint_Electrolytic_Capacitor_Unit_;
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
import ru.itx.EveAssets.production.material.PlasmonicMetamaterials;

public class _Electrolytic_Capacitor_Unit_ extends Prototype {
	public _Electrolytic_Capacitor_Unit_(int volume) {
		this.volume = volume;
		materials=new ArrayList<Item>();
		materials.add(new FerniteCarbide(25));
		materials.add(new Nanotransistors(1));
		materials.add(new PlasmonicMetamaterials(2));
		materials.add(new Fullerides(10));
		blueprint = new Blueprint_Electrolytic_Capacitor_Unit_(1);
		isElementary = false;
	}
	
	@Override
	public String getName() {
		return "Electrolytic Capacitor Unit";
	}	
}
