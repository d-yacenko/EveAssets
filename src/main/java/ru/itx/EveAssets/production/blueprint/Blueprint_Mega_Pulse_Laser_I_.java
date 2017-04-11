package ru.itx.EveAssets.production.blueprint;


public class Blueprint_Mega_Pulse_Laser_I_ extends BlueprintI {

	public Blueprint_Mega_Pulse_Laser_I_(int volume) {
		this.volume=volume;
		probability=39;
		isElementary=true;
	}
	
	@Override
	public String getName() {
		return "Mega Pulse Laser I Blueprint";
	}	
}
