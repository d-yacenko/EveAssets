package ru.itx.EveAssets.production.product;

import java.util.ArrayList;

import ru.itx.EveAssets.production.Item;
import ru.itx.EveAssets.production.blueprintII.Blueprint_800mm_Repeating_Cannon_II_;
import ru.itx.EveAssets.production.blueprintII.Blueprint_Torpedo_Launcher_II_;
import ru.itx.EveAssets.production.material.Morphite;
import ru.itx.EveAssets.production.material.Robotics;

public class _Torpedo_Launcher_II_ extends Prototype {

	
	public _Torpedo_Launcher_II_(int volume) {
		this.volume=volume;
		materials=new ArrayList<Item>();
		materials.add(new _Torpedo_Launcher_I_(1));
		materials.add(new _RAM_Weapon_Tech_(1));
		materials.add(new _Quantum_Microprocessor_(24));
		materials.add(new Morphite(24));
		materials.add(new Robotics(24));
		blueprint=new Blueprint_Torpedo_Launcher_II_(1);
		isElementary=false;
	}

	@Override
	public String getName() {
		return "Torpedo Launcher II";
	}	
}
