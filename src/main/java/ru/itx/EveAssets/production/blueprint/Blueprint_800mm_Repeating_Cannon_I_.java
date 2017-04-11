package ru.itx.EveAssets.production.blueprint;


public class Blueprint_800mm_Repeating_Cannon_I_ extends BlueprintI {

	public Blueprint_800mm_Repeating_Cannon_I_(int volume) {
		this.volume=volume;
		probability=39;
		runs=10;
		isElementary=true;
	}
	
	@Override
	public String getName() {
		return "800mm Repeating Cannon I Blueprint";
	}	
}
