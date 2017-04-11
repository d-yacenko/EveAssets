package ru.itx.EveAssets.production.datacore;


public class Datacore_Quantum_Physics extends Datacore {
	public Datacore_Quantum_Physics(int volume) {
		this.volume = volume;
		isElementary = true;
	}
	@Override
	public String getName() {
		return "Datacore - Quantum Physics";
	}	

}
