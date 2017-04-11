package ru.itx.EveAssets.production.blueprint;


public class Blueprint_Particle_Acellerator_Unit_ extends BlueprintI {
	
	public Blueprint_Particle_Acellerator_Unit_(int volume) {
		this.volume=volume;
		isElementary=true;
	}
	
	@Override
	public String getName() {
		return "Particle Acellerator Unit Blueprint";
	}

}
