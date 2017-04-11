package ru.itx.EveAssets.production.datacore;


public class Datacore_Laser_Physics extends Datacore {
	public Datacore_Laser_Physics(int volume) {
		this.volume = volume;
		isElementary = true;
	}
	@Override
	public String getName() {
		return "Datacore - Laser Physics";
	}	

}
