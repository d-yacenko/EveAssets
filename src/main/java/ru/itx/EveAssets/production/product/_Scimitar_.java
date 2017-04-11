package ru.itx.EveAssets.production.product;

import java.util.ArrayList;

import ru.itx.EveAssets.production.Item;
import ru.itx.EveAssets.production.blueprintII.Blueprint_800mm_Repeating_Cannon_II_;
import ru.itx.EveAssets.production.blueprintII.Blueprint_Scimitar_;
import ru.itx.EveAssets.production.blueprintII.Blueprint_Stiletto_;
import ru.itx.EveAssets.production.material.ConstructionBlocks;
import ru.itx.EveAssets.production.material.Morphite;
import ru.itx.EveAssets.production.material.Robotics;

public class _Scimitar_ extends Prototype {

	
	public _Scimitar_(int volume) {
		this.volume=volume;
		materials=new ArrayList<Item>();
		materials.add(new _Scythe_(1));
		materials.add(new _RAM_Starship_Tech_(12));
		materials.add(new _Plasma_Thruster_(73));
		materials.add(new _Fernite_Carbide_Composite_Armor_Plate_(2183));
		materials.add(new _Ladar_Sensor_Cluster_(256));
		materials.add(new _Nanomechanical_Microprocessor_(1746));
		materials.add(new _Deflection_Shield_Emitter_(146));
		materials.add(new _Nuclear_Reactor_Unit_(23));
		materials.add(new _Electrolytic_Capacitor_Unit_(728));
		materials.add(new Morphite(88));
		materials.add(new ConstructionBlocks(73));
		blueprint=new Blueprint_Scimitar_(1);
		isElementary=false;
	}
	@Override
	public String getName() {
		return "Scimitar";
	}
}
