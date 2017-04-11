package ru.itx.EveAssets.production.datacore;


public class Datacore_Nanite_Engineering extends Datacore {
	public Datacore_Nanite_Engineering(int volume) {
		this.volume = volume;
		isElementary = true;
	}
	
	@Override
	public String getName() {
		return "Datacore - Nanite Engineering";
	}	
}
