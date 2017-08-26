package ru.itx.EveAssets.production.datacore;


public class Datacore_Rocket_Science extends Datacore {
	public Datacore_Rocket_Science(int volume) {
		this.volume = volume;
		isElementary = true;
	}
	
	@Override
	public String getName() {
		return "Datacore - Rocket Science";
	}	
}
