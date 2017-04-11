package ru.itx.EveAssets.production.material;

public class FermionicCondensates extends Material {
	public FermionicCondensates(int volume) {
		this.volume = volume;
		isElementary = true;
	}
	
	@Override
	public String getName() {
		return "Fermionic Condensates";
	}	

}
