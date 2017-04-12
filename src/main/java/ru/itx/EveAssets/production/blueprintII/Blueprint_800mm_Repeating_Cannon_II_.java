package ru.itx.EveAssets.production.blueprintII;

import ru.itx.EveAssets.production.blueprint.Blueprint_800mm_Repeating_Cannon_I_;
import ru.itx.EveAssets.production.datacore.Datacore_Mechanical_Engineering;
import ru.itx.EveAssets.production.datacore.Datacore_Nuclear_Physics;
import ru.itx.EveAssets.production.decryptor.ParityDecryptor;

public class Blueprint_800mm_Repeating_Cannon_II_ extends BlueprintII {

	public Blueprint_800mm_Repeating_Cannon_II_(int volume) {
		this.volume=volume;
		datacore1=new Datacore_Nuclear_Physics(3);
		datacore2=new Datacore_Mechanical_Engineering(3);
		decryptor=new ParityDecryptor(1);
		blueprint=new Blueprint_800mm_Repeating_Cannon_I_(1);
		isElementary=false;
		recalculateEfficiency();
	}
	@Override
	public String getName() {
		return "800mm Repeating Cannon II Blueprint";
	}	

}
