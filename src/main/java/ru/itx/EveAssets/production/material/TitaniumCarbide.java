package ru.itx.EveAssets.production.material;

public class TitaniumCarbide extends Material {
	public TitaniumCarbide(int volume) {
		this.volume = volume;
		isElementary = true;
	}
	
	@Override
	public String getName() {
		return "Titanium Carbide";
	}	

}
