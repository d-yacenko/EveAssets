package ru.itx.EveAssets;

public class Station implements Comparable<Station>{
	@Override
	public String toString() {
		return "Station [constellationID=" + constellationID
				+ ", corporationID=" + corporationID
				+ ", dockingCostPerVolume=" + dockingCostPerVolume
				+ ", maxShipVolumeDockable=" + maxShipVolumeDockable
				+ ", officeRentalCost=" + officeRentalCost + ", operationID="
				+ operationID + ", regionID=" + regionID
				+ ", reprocessingEfficiency=" + reprocessingEfficiency
				+ ", reprocessingHangarFlag=" + reprocessingHangarFlag
				+ ", reprocessingStationsTake=" + reprocessingStationsTake
				+ ", security=" + security + ", solarSystemID=" + solarSystemID
				+ ", stationID=" + stationID + ", stationName=" + stationName
				+ ", stationTypeID=" + stationTypeID + ", x=" + x + ", y=" + y
				+ ", z=" + z + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + constellationID;
		result = prime * result + corporationID;
		result = prime * result + dockingCostPerVolume;
		result = prime * result + maxShipVolumeDockable;
		result = prime * result + officeRentalCost;
		result = prime * result + operationID;
		result = prime * result + regionID;
		long temp;
		temp = Double.doubleToLongBits(reprocessingEfficiency);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + reprocessingHangarFlag;
		temp = Double.doubleToLongBits(reprocessingStationsTake);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(security);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + solarSystemID;
		result = prime * result + (int) (stationID ^ (stationID >>> 32));
		result = prime * result
				+ ((stationName == null) ? 0 : stationName.hashCode());
		result = prime * result + stationTypeID;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(z);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Station other = (Station) obj;
		if (constellationID != other.constellationID)
			return false;
		if (corporationID != other.corporationID)
			return false;
		if (dockingCostPerVolume != other.dockingCostPerVolume)
			return false;
		if (maxShipVolumeDockable != other.maxShipVolumeDockable)
			return false;
		if (officeRentalCost != other.officeRentalCost)
			return false;
		if (operationID != other.operationID)
			return false;
		if (regionID != other.regionID)
			return false;
		if (Double.doubleToLongBits(reprocessingEfficiency) != Double
				.doubleToLongBits(other.reprocessingEfficiency))
			return false;
		if (reprocessingHangarFlag != other.reprocessingHangarFlag)
			return false;
		if (Double.doubleToLongBits(reprocessingStationsTake) != Double
				.doubleToLongBits(other.reprocessingStationsTake))
			return false;
		if (Double.doubleToLongBits(security) != Double
				.doubleToLongBits(other.security))
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
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		if (Double.doubleToLongBits(z) != Double.doubleToLongBits(other.z))
			return false;
		return true;
	}

	public int constellationID;
	public int corporationID;
	public int dockingCostPerVolume;
	public int maxShipVolumeDockable;
	public int officeRentalCost;
	public int operationID;
	public int regionID;
    public double reprocessingEfficiency;
    public int reprocessingHangarFlag;
    public double reprocessingStationsTake;
    public double security;
    public int solarSystemID;
    public long stationID;
    public String stationName;
    public int stationTypeID;
    public double x;
    public double y;
    public double z;
    
	public int compareTo(Station o) {
		return (int)(stationID-o.stationID);
	}
	public Station(){
		
	}
	
	public Station(int constellationID,int corporationID,int dockingCostPerVolume,int maxShipVolumeDockable,int officeRentalCost,int operationID,int regionID,double reprocessingEfficiency,
    int reprocessingHangarFlag,double reprocessingStationsTake,double security,int solarSystemID,int stationID,String stationName,int stationTypeID,double x,double y,double z) {
		this.constellationID=constellationID;
		this.corporationID=corporationID;
		this.dockingCostPerVolume=dockingCostPerVolume;
		this.maxShipVolumeDockable=maxShipVolumeDockable;
		this.officeRentalCost=officeRentalCost;
		this.operationID=operationID;
		this.regionID=regionID;
		this.reprocessingEfficiency=reprocessingEfficiency;
		this.reprocessingHangarFlag=reprocessingHangarFlag;
		this.reprocessingStationsTake=reprocessingStationsTake;
		this.security=security;
		this.solarSystemID=solarSystemID;
		this.stationID=stationID;
		this.stationName=stationName;
		this.stationTypeID=stationTypeID;
		this.x=x;
		this.y=y;
	    this.z=z;
	}
}
