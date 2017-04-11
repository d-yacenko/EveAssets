package ru.itx.EveAssets.production.datacore;


public class Datacore_High_Energy_Physics extends Datacore {
	public Datacore_High_Energy_Physics(int volume) {
		this.volume = volume;
		isElementary = true;
	}
	@Override
	public String getName() {
		return "Datacore - High Energy Physics";
	}	

}
