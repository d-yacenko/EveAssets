package ru.itx.EveAssets.production.material;

public class PlasmonicMetamaterials extends Material {
	public PlasmonicMetamaterials(int volume) {
		this.volume = volume;
		isElementary = true;
	}
	
	@Override
	public String getName() { 
		return "Plasmonic Metamaterials";
	}	

}
