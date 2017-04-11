package ru.itx.EveAssets.production.product;

import java.util.ArrayList;

import ru.itx.EveAssets.production.Item;
import ru.itx.EveAssets.production.blueprint.Blueprint_Fernite_Carbide_Composite_Armor_Plate_;
import ru.itx.EveAssets.production.blueprint.Blueprint_Thermonuclear_Trigger_Unit_;
import ru.itx.EveAssets.production.material.FerniteCarbide;
import ru.itx.EveAssets.production.material.Fullerides;
import ru.itx.EveAssets.production.material.HypersynapticFibers;
import ru.itx.EveAssets.production.material.SylramicFibers;

public class _Fernite_Carbide_Composite_Armor_Plate_ extends Prototype {
	public _Fernite_Carbide_Composite_Armor_Plate_(int volume) {
		this.volume = volume;
		materials=new ArrayList<Item>();
		materials.add(new FerniteCarbide(40));
		materials.add(new SylramicFibers(10));
		blueprint = new Blueprint_Fernite_Carbide_Composite_Armor_Plate_(1);
		isElementary = false;
	}
	

	@Override
	public String getName() {
		return "Fernite Carbide Composite Armor Plate";
	}	
}
