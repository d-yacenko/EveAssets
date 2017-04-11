package ru.itx.EveAssets.production.decryptor;


public class AccelerantDecryptor extends Decryptor {
	public AccelerantDecryptor(int volume) {
		modProbability=20;
		modRuns=1;
		modME=2;
		modTE=10;
		this.volume = volume;
		isElementary = true;
	}

	@Override
	public String getName() {
		return "Accelerant Decryptor";
	}	

}
