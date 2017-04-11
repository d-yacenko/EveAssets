package ru.itx.EveAssets.production.product;

import java.util.ArrayList;

import ru.itx.EveAssets.production.Item;
import ru.itx.EveAssets.production.blueprint.Blueprint_Thermonuclear_Trigger_Unit_;
import ru.itx.EveAssets.production.material.FerniteCarbide;
import ru.itx.EveAssets.production.material.Fullerides;
import ru.itx.EveAssets.production.material.HypersynapticFibers;

public class _Thermonuclear_Trigger_Unit_ extends Prototype {
	public _Thermonuclear_Trigger_Unit_(int volume) {
		this.volume = volume;
		materials=new ArrayList<Item>();
		materials.add(new FerniteCarbide(31));
		materials.add(new HypersynapticFibers(1));
		materials.add(new Fullerides(11));
		blueprint = new Blueprint_Thermonuclear_Trigger_Unit_(1);
		isMetaMaterials=true;
		isElementary = false;
	}
	

	@Override
	public String getName() {
		return "Thermonuclear Trigger Unit";
	}	
}
