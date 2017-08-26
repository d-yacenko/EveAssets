package ru.itx.EveAssets.production.blueprint;


public class Blueprint_1400mm_Howitzer_Artillery_I_ extends BlueprintI {

	public Blueprint_1400mm_Howitzer_Artillery_I_(int volume) {
		this.volume=volume;
		probability=39;
		isElementary=true;
	}
	
	@Override
	public String getName() {
		return "1400mm Howitzer Artillery I Blueprint";
	}	
}
