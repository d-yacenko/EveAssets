package ru.itx.EveAssets.production.blueprint;


public class Blueprint_Plasma_Thruster_ extends BlueprintI {

	public Blueprint_Plasma_Thruster_(int volume) {
		this.volume=volume;
		runs=10;
		isElementary=true;
	}
	
	@Override
	public String getName() {
		return "Plasma Thruster Blueprint";
	}	
}
