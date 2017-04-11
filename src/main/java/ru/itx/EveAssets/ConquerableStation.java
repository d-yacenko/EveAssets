package ru.itx.EveAssets;

import enterprises.orbital.evexmlapi.eve.IConquerableStation;

public class ConquerableStation implements Comparable<ConquerableStation> {
	 public int corporationID;
	  public String corporationName;
	  public long solarSystemID;
	  public long stationID;
	  public String stationName;
	  public int stationTypeID;
	  public long x;
	  public long y;
	  public long z;
	  
	  public ConquerableStation() {
	}
	  
	  public ConquerableStation(int corporationID, String corporationName,long solarSystemID,long stationID,String stationName,int stationTypeID,long x,long y,long z) {
		  this.corporationID=corporationID;
		  this.corporationName=corporationName;
		  this.solarSystemID=solarSystemID;
		  this.stationID=stationID;
		  this.stationName=stationName;
		  this.stationTypeID=stationTypeID;
		  this.x=x;
		  this.y=y;
		  this.z=z;
		}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + corporationID;
		result = prime * result
				+ ((corporationName == null) ? 0 : corporationName.hashCode());
		result = prime * result
				+ (int) (solarSystemID ^ (solarSystemID >>> 32));
		result = prime * result + (int) (stationID ^ (stationID >>> 32));
		result = prime * result
				+ ((stationName == null) ? 0 : stationName.hashCode());
		result = prime * result + stationTypeID;
		result = prime * result + (int) (x ^ (x >>> 32));
		result = prime * result + (int) (y ^ (y >>> 32));
		result = prime * result + (int) (z ^ (z >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConquerableStation other = (ConquerableStation) obj;
		if (corporationID != other.corporationID)
			return false;
		if (corporationName == null) {
			if (other.corporationName != null)
				return false;
		} else if (!corporationName.equals(other.corporationName))
			return false;
		if (solarSystemID != other.solarSystemID)
			return false;
		if (stationID != other.stationID)
			return false;
		if (stationName == null) {
			if (other.stationName != null)
				return false;
		} else if (!stationName.equals(other.stationName))
			return false;
		if (stationTypeID != other.stationTypeID)
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		if (z != other.z)
			return false;
		return true;
	}

	@Override
	public int compareTo(ConquerableStation o) {
		// TODO Auto-generated method stub
		return (int)(stationID-o.stationID);
	} 
	
	 public static ConquerableStation cloneIConquerableStation(IConquerableStation ic){
		  return new ConquerableStation(ic.getCorporationID(), ic.getCorporationName(),ic.getSolarSystemID(),ic.getStationID(),ic.getStationName(),
				  ic.getStationTypeID(),ic.getX(),ic.getY(),ic.getZ());		
	  }
	
}
