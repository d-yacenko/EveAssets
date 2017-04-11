package ru.itx.EveAssets.production.blueprint;


public class Blueprint_Ladar_Sensor_Cluster_ extends BlueprintI {

	public Blueprint_Ladar_Sensor_Cluster_(int volume) {
		this.volume=volume;
		runs=10;
		isElementary=true;
	}
	
	@Override
	public String getName() {
		return "Ladar Sensor Cluster Blueprint";
	}	
}
