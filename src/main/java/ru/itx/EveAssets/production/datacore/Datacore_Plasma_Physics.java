package ru.itx.EveAssets.production.datacore;


public class Datacore_Plasma_Physics extends Datacore {
	public Datacore_Plasma_Physics(int volume) {
		this.volume = volume;
		isElementary = true;
	}
	@Override
	public String getName() {
		return "Datacore - Plasma Physics";
	}	

}
