package ru.itx.EveAssets.production.blueprint;


public class Blueprint_Torpedo_Launcher_I_ extends BlueprintI {

	public Blueprint_Torpedo_Launcher_I_(int volume) {
		this.volume=volume;
		probability=39;
		isElementary=true;
	}
	
	@Override
	public String getName() {
		return "Torpedo Launcher I Blueprint";
	}	
}
