package ru.itx.EveAssets.production.material;

public class PhenolicComposites extends Material {
	public PhenolicComposites(int volume) {
		this.volume = volume;
		isElementary = true;
	}
	
	@Override
	public String getName() {
		return "Phenolic Composites";
	}	

}
