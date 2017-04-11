package ru.itx.EveAssets.production.decryptor;


public class ParityDecryptor extends Decryptor {
	public ParityDecryptor(int volume) {
		probability=50;
		runs=3;
		this.volume = volume;
		isElementary = true;
	}

	@Override
	public String getName() {
		return "Parity Decryptor";
	}	

}
