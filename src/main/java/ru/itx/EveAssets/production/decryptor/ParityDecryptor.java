package ru.itx.EveAssets.production.decryptor;


public class ParityDecryptor extends Decryptor {
	public ParityDecryptor(int volume) {
		modProbability=50;
		modRuns=3;
		modME=1;
		modTE=-2;
		this.volume = volume;
		isElementary = true;
	}

	@Override
	public String getName() {
		return "Parity Decryptor";
	}	

}
