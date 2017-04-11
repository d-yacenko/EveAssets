package ru.itx.EveAssets.production.blueprint;


public class Blueprint_Fernite_Carbide_Composite_Armor_Plate_ extends BlueprintI {

	public Blueprint_Fernite_Carbide_Composite_Armor_Plate_(int volume) {
		this.volume=volume;
		isElementary=true;
	}
	
	@Override
	public String getName() {
		return "Fernite Carbide Composite Armor Plate Blueprint";
	}	
}
