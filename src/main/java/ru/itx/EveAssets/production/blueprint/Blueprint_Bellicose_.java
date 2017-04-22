package ru.itx.EveAssets.production.blueprint;


public class Blueprint_Bellicose_ extends BlueprintI {

	public Blueprint_Bellicose_(int volume) {
		this.volume=volume;
		isElementary=true;
		probability=38;
	}
	
	@Override
	public String getName() {
		return "Bellicose Blueprint";
	}	
}
