package ru.itx.EveAssets.production.product;

import java.util.ArrayList;

import ru.itx.EveAssets.production.Item;
import ru.itx.EveAssets.production.blueprint.Blueprint_Nanomechanical_Microprocessor_;
import ru.itx.EveAssets.production.blueprint.Blueprint_Particle_Acellerator_Unit_;
import ru.itx.EveAssets.production.material.CrystallineCarbonide;
import ru.itx.EveAssets.production.material.FerniteCarbide;
import ru.itx.EveAssets.production.material.Fullerides;
import ru.itx.EveAssets.production.material.HypersynapticFibers;
import ru.itx.EveAssets.production.material.Nanotransistors;
import ru.itx.EveAssets.production.material.PhenolicComposites;
import ru.itx.EveAssets.production.material.PlasmonicMetamaterials;

public class _Nanomechanical_Microprocessor_ extends Prototype {
	public _Nanomechanical_Microprocessor_(int volume) {
		this.volume = volume;
		materials=new ArrayList<Item>();
		materials.add(new PhenolicComposites(6));
		materials.add(new FerniteCarbide(16));
		materials.add(new PlasmonicMetamaterials(2));
		materials.add(new Nanotransistors(2));
		blueprint = new Blueprint_Nanomechanical_Microprocessor_(1);
		isElementary = false;
	}
	
	@Override
	public String getName() {
		return "Nanomechanical Microprocessor";
	}	
}
