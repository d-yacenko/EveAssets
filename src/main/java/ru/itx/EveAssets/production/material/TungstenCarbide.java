package ru.itx.EveAssets.production.material;

public class TungstenCarbide extends Material {
	public TungstenCarbide(int volume) {
		this.volume = volume;
		isElementary = true;
	}
	
	@Override
	public String getName() {
		return "Tungsten Carbide";
	}	

}
