package ru.itx.EveAssets;

import java.util.HashMap;
import java.util.LinkedList;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import enterprises.orbital.evexmlapi.shared.IAsset;

@Root
class Wrapper{
	@ElementList
	public LinkedList<Asset> assets;
	@ElementList
	public LinkedList<Long> characterIDs;
	
	public Wrapper() {
		assets=new LinkedList<Asset>();
		characterIDs=new LinkedList<Long>();
	}
	
}