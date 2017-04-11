package ru.itx.EveAssets.production.blueprint;


public class Blueprint_Laser_Focusing_Crystals_ extends BlueprintI {
	
	public Blueprint_Laser_Focusing_Crystals_(int volume) {
		this.volume=volume;
		isElementary=true;
	}
	
	@Override
	public String getName() {
		return "Laser Focusing Crystals Blueprint";
	}

}
