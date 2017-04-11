package ru.itx.EveAssets.production.blueprint;


public class Blueprint_Nuclear_Reactor_Unit_ extends BlueprintI {

	public Blueprint_Nuclear_Reactor_Unit_(int volume) {
		this.volume=volume;
		isElementary=true;
	}
	
	@Override
	public String getName() {
		return "Nuclear Reactor Unit Blueprint";
	}	
}
