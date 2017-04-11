package ru.itx.EveAssets.production.datacore;


public class Datacore_Nuclear_Physics extends Datacore {
	public Datacore_Nuclear_Physics(int volume) {
		this.volume = volume;
		isElementary = true;
	}
	@Override
	public String getName() {
		return "Datacore - Nuclear Physics";
	}	

}
