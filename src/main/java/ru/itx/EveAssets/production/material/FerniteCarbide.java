package ru.itx.EveAssets.production.material;

public class FerniteCarbide extends Material {
	public FerniteCarbide(int volume) {
		this.volume = volume;
		isElementary = true;
	}
	
	@Override
	public String getName() {
		return "Fernite Carbide";
	}	

}
