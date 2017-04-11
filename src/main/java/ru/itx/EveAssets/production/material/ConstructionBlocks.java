package ru.itx.EveAssets.production.material;

public class ConstructionBlocks extends Material {
	public ConstructionBlocks(int volume) {
		this.volume = volume;
		isElementary = true;
	}
	
	@Override
	public String getName() {
		return "Construction Blocks";
	}	

}
