package ru.itx.EveAssets.production.blueprintII;

import ru.itx.EveAssets.production.blueprint.Blueprint_Torpedo_Launcher_I_;
import ru.itx.EveAssets.production.datacore.Datacore_Nuclear_Physics;
import ru.itx.EveAssets.production.datacore.Datacore_Rocket_Science;
import ru.itx.EveAssets.production.decryptor.ParityDecryptor;

public class Blueprint_Torpedo_Launcher_II_ extends BlueprintII {

	public Blueprint_Torpedo_Launcher_II_(int volume) {
		this.volume=volume;
		datacore1=new Datacore_Nuclear_Physics(3);
		datacore2=new Datacore_Rocket_Science(3);
		decryptor=new ParityDecryptor(1);
		blueprint=new Blueprint_Torpedo_Launcher_I_(1);
		isElementary=false;
		recalculateEfficiency();
	}
	@Override
	public String getName() {
		return "Torpedo Launcher II Blueprint";
	}	

}
