package ru.itx.EveAssets.production.material;

public class SylramicFibers extends Material {
	public SylramicFibers(int volume) {
		this.volume = volume;
		isElementary = true;
	}
	
	@Override
	public String getName() {
		return "Sylramic Fibers";
	}	

}
