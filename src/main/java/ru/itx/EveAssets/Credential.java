package ru.itx.EveAssets;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class Credential implements Comparable<Credential>  {
	private int keyID;
	private String vCode;
	private long characterID;
	private String name;
	public Credential() {
		// TODO Auto-generated constructor stub
	}
	public Credential(int keyID,String vCode,long characterID,String name) {
		this.keyID=keyID;
		this.vCode=vCode;
		this.characterID=characterID;
		this.name=name;
	}
	public int getKeyID() {
		return keyID;
	}
	public String getvCode() {
		return vCode;
	}
	public long getCharacterID() {
		return characterID;
	}
	public String getName() {
		return name;
	}
	public int compareTo(Credential o) {
		return keyID-o.keyID;
	}
}
