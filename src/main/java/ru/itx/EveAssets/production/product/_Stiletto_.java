package ru.itx.EveAssets.production.product;

import java.util.ArrayList;

import ru.itx.EveAssets.production.Item;
import ru.itx.EveAssets.production.blueprintII.Blueprint_800mm_Repeating_Cannon_II_;
import ru.itx.EveAssets.production.blueprintII.Blueprint_Stiletto_;
import ru.itx.EveAssets.production.material.ConstructionBlocks;
import ru.itx.EveAssets.production.material.Morphite;
import ru.itx.EveAssets.production.material.Robotics;

public class _Stiletto_ extends Prototype {

	
	public _Stiletto_(int volume) {
		this.volume=volume;
		materials=new ArrayList<Item>();
		materials.add(new _Slasher_(1));
		materials.add(new _RAM_Starship_Tech_(1));
		materials.add(new _Plasma_Thruster_(45));
		materials.add(new _Fernite_Carbide_Composite_Armor_Plate_(446));
		materials.add(new _Ladar_Sensor_Cluster_(30));
		materials.add(new _Nanomechanical_Microprocessor_(119));
		materials.add(new _Deflection_Shield_Emitter_(23));
		materials.add(new _Nuclear_Reactor_Unit_(5));
		materials.add(new _Electrolytic_Capacitor_Unit_(75));
		materials.add(new Morphite(8));
		materials.add(new ConstructionBlocks(15));
		blueprint=new Blueprint_Stiletto_(1);
		isElementary=false;
	}
	@Override
	public String getName() {
		return "Stiletto";
	}
}
