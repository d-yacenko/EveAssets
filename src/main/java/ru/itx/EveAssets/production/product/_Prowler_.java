package ru.itx.EveAssets.production.product;

import java.util.ArrayList;

import ru.itx.EveAssets.production.Item;
import ru.itx.EveAssets.production.blueprintII.Blueprint_800mm_Repeating_Cannon_II_;
import ru.itx.EveAssets.production.blueprintII.Blueprint_Prowler_;
import ru.itx.EveAssets.production.blueprintII.Blueprint_Stiletto_;
import ru.itx.EveAssets.production.material.ConstructionBlocks;
import ru.itx.EveAssets.production.material.Morphite;
import ru.itx.EveAssets.production.material.Robotics;

public class _Prowler_ extends Prototype {

	
	public _Prowler_(int volume) {
		this.volume=volume;
		materials=new ArrayList<Item>();
		materials.add(new _Wreathe_(1));
		materials.add(new _RAM_Starship_Tech_(11));
		materials.add(new _Plasma_Thruster_(113));
		materials.add(new _Fernite_Carbide_Composite_Armor_Plate_(3000));
		materials.add(new _Ladar_Sensor_Cluster_(90));
		materials.add(new _Nanomechanical_Microprocessor_(1200));
		materials.add(new _Deflection_Shield_Emitter_(150));
		materials.add(new _Nuclear_Reactor_Unit_(38));
		materials.add(new _Electrolytic_Capacitor_Unit_(225));
		materials.add(new Morphite(60));
		materials.add(new ConstructionBlocks(113));
		blueprint=new Blueprint_Prowler_(1);
		isElementary=false;
	}
	@Override
	public String getName() {
		return "Prowler";
	}
}
