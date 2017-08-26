package ru.itx.EveAssets.production.material;

public class NonlinearMetamaterials extends Material {
	public NonlinearMetamaterials(int volume) {
		this.volume = volume;
		isElementary = true;
	}
	
	@Override
	public String getName() { 
		return "Nonlinear Metamaterials";
	}	

}
