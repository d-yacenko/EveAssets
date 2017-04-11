package ru.itx.EveAssets.production.blueprint;


public class Blueprint_RAM_Weapon_Tech_ extends BlueprintI {
	
	public Blueprint_RAM_Weapon_Tech_(int volume) {
		this.volume=volume;
		isElementary=true;
	}
	
	@Override
	public String getName() {
		return "R.A.M.- Weapon Tech Blueprint";
	}

}
