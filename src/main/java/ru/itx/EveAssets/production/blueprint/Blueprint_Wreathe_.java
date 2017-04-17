package ru.itx.EveAssets.production.blueprint;


public class Blueprint_Wreathe_ extends BlueprintI {

	public Blueprint_Wreathe_(int volume) {
		this.volume=volume;
		isElementary=true;
	}
	
	@Override
	public String getName() {
		return "Wreathe Blueprint";
	}	
}
