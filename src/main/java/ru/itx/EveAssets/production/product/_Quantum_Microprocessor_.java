package ru.itx.EveAssets.production.product;

import java.util.ArrayList;

import ru.itx.EveAssets.production.Item;
import ru.itx.EveAssets.production.blueprint.Blueprint_Quantum_Microprocessor_;
import ru.itx.EveAssets.production.blueprint.Blueprint_Thermonuclear_Trigger_Unit_;
import ru.itx.EveAssets.production.material.FerniteCarbide;
import ru.itx.EveAssets.production.material.Fullerides;
import ru.itx.EveAssets.production.material.HypersynapticFibers;
import ru.itx.EveAssets.production.material.Nanotransistors;
import ru.itx.EveAssets.production.material.NonlinearMetamaterials;
import ru.itx.EveAssets.production.material.PhenolicComposites;
import ru.itx.EveAssets.production.material.TitaniumCarbide;

public class _Quantum_Microprocessor_ extends Prototype {
	public _Quantum_Microprocessor_(int volume) {
		this.volume = volume;
		materials=new ArrayList<Item>();
		materials.add(new TitaniumCarbide(17));
		materials.add(new PhenolicComposites(6));
		materials.add(new Nanotransistors(2));
		materials.add(new NonlinearMetamaterials(2));
		blueprint = new Blueprint_Quantum_Microprocessor_(1);
		isMetaMaterials=true;
		isElementary = false;
	}
	

	@Override
	public String getName() {
		return "Quantum Microprocessor";
	}	
}
