package ru.itx.EveAssets.production.datacore;


public class Datacore_Mechanical_Engineering extends Datacore {
	public Datacore_Mechanical_Engineering(int volume) {
		this.volume = volume;
		isElementary = true;
	}
	
	@Override
	public String getName() {
		return "Datacore - Mechanical Engineering";
	}	
}
