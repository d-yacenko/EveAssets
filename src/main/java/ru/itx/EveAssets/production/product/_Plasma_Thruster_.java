package ru.itx.EveAssets.production.product;

import java.util.ArrayList;

import ru.itx.EveAssets.production.Item;
import ru.itx.EveAssets.production.blueprint.Blueprint_Particle_Acellerator_Unit_;
import ru.itx.EveAssets.production.blueprint.Blueprint_Plasma_Thruster_;
import ru.itx.EveAssets.production.material.CrystallineCarbonide;
import ru.itx.EveAssets.production.material.FerniteCarbide;
import ru.itx.EveAssets.production.material.Ferrogel;
import ru.itx.EveAssets.production.material.Fullerides;
import ru.itx.EveAssets.production.material.HypersynapticFibers;
import ru.itx.EveAssets.production.material.PhenolicComposites;

public class _Plasma_Thruster_ extends Prototype {
	public _Plasma_Thruster_(int volume) {
		this.volume = volume;
		materials=new ArrayList<Item>();
		materials.add(new PhenolicComposites(3));
		materials.add(new FerniteCarbide(13));
		materials.add(new Ferrogel(1));
		blueprint = new Blueprint_Plasma_Thruster_(1);
		isMetaMaterials=true;
		isElementary = false;
	}
	
	@Override
	public String getName() {
		return "Plasma Thruster";
	}	
}
