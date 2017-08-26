package ru.itx.EveAssets.production.blueprint;


public class Blueprint_Quantum_Microprocessor_ extends BlueprintI {
	
	public Blueprint_Quantum_Microprocessor_(int volume) {
		this.volume=volume;
		isElementary=true;
	}
	
	@Override
	public String getName() {
		return "Quantum Microprocessor Blueprint";
	}

}
