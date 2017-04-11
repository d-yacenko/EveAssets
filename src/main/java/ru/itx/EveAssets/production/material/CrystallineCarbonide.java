package ru.itx.EveAssets.production.material;

public class CrystallineCarbonide extends Material {
	public CrystallineCarbonide(int volume) {
		this.volume = volume;
		isElementary = true;
	}
	
	@Override
	public String getName() {
		return "Crystalline Carbonide";
	}	

}
