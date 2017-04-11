package ru.itx.EveAssets.production.blueprint;


public class Blueprint_Thermonuclear_Trigger_Unit_ extends BlueprintI {
	
	public Blueprint_Thermonuclear_Trigger_Unit_(int volume) {
		this.volume=volume;
		isElementary=true;
	}
	
	@Override
	public String getName() {
		return "Thermonuclear Trigger Unit Blueprint";
	}

}
