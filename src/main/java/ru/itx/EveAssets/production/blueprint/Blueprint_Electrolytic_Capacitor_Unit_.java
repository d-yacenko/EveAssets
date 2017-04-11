package ru.itx.EveAssets.production.blueprint;


public class Blueprint_Electrolytic_Capacitor_Unit_ extends BlueprintI {

	public Blueprint_Electrolytic_Capacitor_Unit_(int volume) {
		this.volume=volume;
		isElementary=true;
	}
	
	@Override
	public String getName() {
		return "Electrolytic Capacitor Unit Blueprint";
	}	
}
