package ru.itx.EveAssets.production.datacore;


public class Datacore_Minmatar_Starship_Engineering extends Datacore {
	public Datacore_Minmatar_Starship_Engineering(int volume) {
		this.volume = volume;
		isElementary = true;
	}
	
	@Override
	public String getName() {
		return "Datacore - Minmatar Starship Engineering";
	}	
}
