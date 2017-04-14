package ru.itx.EveAssets.production.blueprint;


public class Blueprint_Particle_Accelerator_Unit_ extends BlueprintI {
	
	public Blueprint_Particle_Accelerator_Unit_(int volume) {
		this.volume=volume;
		isElementary=true;
	}
	
	@Override
	public String getName() {
		return "Particle Accelerator Unit Blueprint";
	}

}
