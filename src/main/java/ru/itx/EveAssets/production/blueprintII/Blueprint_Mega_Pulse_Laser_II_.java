package ru.itx.EveAssets.production.blueprintII;

import ru.itx.EveAssets.production.blueprint.Blueprint_Mega_Pulse_Laser_I_;
import ru.itx.EveAssets.production.blueprint.Blueprint_Neutron_Blaster_Cannon_I_;
import ru.itx.EveAssets.production.datacore.Datacore_High_Energy_Physics;
import ru.itx.EveAssets.production.datacore.Datacore_Laser_Physics;
import ru.itx.EveAssets.production.datacore.Datacore_Plasma_Physics;
import ru.itx.EveAssets.production.datacore.Datacore_Quantum_Physics;
import ru.itx.EveAssets.production.decryptor.ParityDecryptor;

public class Blueprint_Mega_Pulse_Laser_II_ extends BlueprintII {

	public Blueprint_Mega_Pulse_Laser_II_(int volume) {
		this.volume=volume;
		datacore1=new Datacore_High_Energy_Physics(3);
		datacore2=new Datacore_Laser_Physics(3);
		decryptor=new ParityDecryptor(1);
		blueprint=new Blueprint_Mega_Pulse_Laser_I_(1);
		isElementary=false;
	}
	@Override
	public String getName() {
		return "Mega Pulse Laser II Blueprint";
	}	

}
