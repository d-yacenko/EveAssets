package ru.itx.EveAssets.production.blueprintII;

import ru.itx.EveAssets.production.blueprint.Blueprint_800mm_Repeating_Cannon_I_;
import ru.itx.EveAssets.production.blueprint.Blueprint_Slasher_;
import ru.itx.EveAssets.production.blueprint.Blueprint_Wreathe_;
import ru.itx.EveAssets.production.datacore.Datacore_High_Energy_Physics;
import ru.itx.EveAssets.production.datacore.Datacore_Mechanical_Engineering;
import ru.itx.EveAssets.production.datacore.Datacore_Minmatar_Starship_Engineering;
import ru.itx.EveAssets.production.datacore.Datacore_Nuclear_Physics;
import ru.itx.EveAssets.production.decryptor.ParityDecryptor;

public class Blueprint_Prowler_ extends BlueprintII {

	public Blueprint_Prowler_(int volume) {
		this.volume=volume;
		datacore1=new Datacore_High_Energy_Physics(8);
		datacore2=new Datacore_Minmatar_Starship_Engineering(8);
		decryptor=new ParityDecryptor(1);
		blueprint=new Blueprint_Wreathe_(1);
		isElementary=false;
		recalculateEfficiency();
	}
	@Override
	public String getName() {
		return "Prowler Blueprint";
	}	

}
