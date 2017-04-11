package ru.itx.EveAssets.production.blueprint;


public class Blueprint_Scythe_ extends BlueprintI {

	public Blueprint_Scythe_(int volume) {
		this.volume=volume;
		probability=30;
		runs=10;
		isElementary=true;
	}
	
	@Override
	public String getName() {
		return "Scythe Blueprint";
	}	
}
