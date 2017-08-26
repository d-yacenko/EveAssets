package ru.itx.EveAssets.production.product;

import java.util.ArrayList;

import ru.itx.EveAssets.production.Item;
import ru.itx.EveAssets.production.blueprintII.Blueprint_1400mm_Howitzer_Artillery_II_;
import ru.itx.EveAssets.production.blueprintII.Blueprint_800mm_Repeating_Cannon_II_;
import ru.itx.EveAssets.production.material.Morphite;
import ru.itx.EveAssets.production.material.Robotics;

public class _1400mm_Howitzer_Artillery_II_ extends Prototype {

	
	public _1400mm_Howitzer_Artillery_II_(int volume) {
		this.volume=volume;
		materials=new ArrayList<Item>();
		materials.add(new _1400mm_Howitzer_Artillery_I_(1));
		materials.add(new _RAM_Weapon_Tech_(1));
		materials.add(new _Thermonuclear_Trigger_Unit_(36));
		materials.add(new Morphite(38));
		materials.add(new Robotics(14));
		blueprint=new Blueprint_1400mm_Howitzer_Artillery_II_(1);
		isElementary=false;
	}

	@Override
	public String getName() {
		return "1400mm Howitzer Artillery II";
	}	
}
