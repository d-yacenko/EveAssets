package ru.itx.EveAssets.production.blueprint;


public class Blueprint_Slasher_ extends BlueprintI {

	public Blueprint_Slasher_(int volume) {
		this.volume=volume;
		probability=38;
		runs=10;
		isElementary=true;
	}
	
	@Override
	public String getName() {
		return "Slasher Blueprint";
	}	
}
