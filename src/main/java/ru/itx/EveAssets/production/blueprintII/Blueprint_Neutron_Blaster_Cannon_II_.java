package ru.itx.EveAssets.production.blueprintII;

import ru.itx.EveAssets.production.blueprint.Blueprint_Neutron_Blaster_Cannon_I_;
import ru.itx.EveAssets.production.datacore.Datacore_Plasma_Physics;
import ru.itx.EveAssets.production.datacore.Datacore_Quantum_Physics;
import ru.itx.EveAssets.production.decryptor.ParityDecryptor;

public class Blueprint_Neutron_Blaster_Cannon_II_ extends BlueprintII {

	public Blueprint_Neutron_Blaster_Cannon_II_(int volume) {
		this.volume=volume;
		datacore1=new Datacore_Quantum_Physics(3);
		datacore2=new Datacore_Plasma_Physics(3);
		decryptor=new ParityDecryptor(1);
		blueprint=new Blueprint_Neutron_Blaster_Cannon_I_(1);
		isElementary=false;
		recalculateEfficiency();
	}
	@Override
	public String getName() {
		return "Neutron Blaster Cannon II Blueprint";
	}	

}
