package ru.itx.EveAssets.production.material;

public class HypersynapticFibers extends Material {
	public HypersynapticFibers(int volume) {
		this.volume = volume;
		isElementary = true;
	}

	@Override
	public String getName() {
		return "Hypersynaptic Fibers";
	}	

}
