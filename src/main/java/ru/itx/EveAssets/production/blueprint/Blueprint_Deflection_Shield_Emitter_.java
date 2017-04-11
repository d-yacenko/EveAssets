package ru.itx.EveAssets.production.blueprint;


public class Blueprint_Deflection_Shield_Emitter_ extends BlueprintI {

	public Blueprint_Deflection_Shield_Emitter_(int volume) {
		this.volume=volume;
		runs=10;
		isElementary=true;
	}
	
	@Override
	public String getName() {
		return "Deflection Shield Emitter Blueprint";
	}	
}
