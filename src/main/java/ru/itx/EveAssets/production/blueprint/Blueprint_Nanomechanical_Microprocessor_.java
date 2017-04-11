package ru.itx.EveAssets.production.blueprint;


public class Blueprint_Nanomechanical_Microprocessor_ extends BlueprintI {

	public Blueprint_Nanomechanical_Microprocessor_(int volume) {
		this.volume=volume;
		runs=10;
		isElementary=true;
	}
	
	@Override
	public String getName() {
		return "Nanomechanical Microprocessor Blueprint";
	}	
}
