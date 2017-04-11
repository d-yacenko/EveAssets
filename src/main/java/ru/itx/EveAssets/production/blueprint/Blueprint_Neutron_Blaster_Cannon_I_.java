package ru.itx.EveAssets.production.blueprint;


public class Blueprint_Neutron_Blaster_Cannon_I_ extends BlueprintI {

	public Blueprint_Neutron_Blaster_Cannon_I_(int volume) {
		this.volume=volume;
		probability=39;
		isElementary=true;
	}
	
	@Override
	public String getName() {
		return "Neutron Blaster Cannon I Blueprint";
	}	
}
