package ru.itx.EveAssets;

import enterprises.orbital.evexmlapi.shared.IAsset;
import enterprises.orbital.evexmlapi.shared.IIndustryJob;
import enterprises.orbital.evexmlapi.shared.IMarketOrder;

public class Asset implements Comparable<Asset>{
	  private long                       itemID;
	  private long                       locationID;
	  private int                        typeID;
	  private int                        quantity;
	  private int                        flag;
	  private int                        rawQuantity;
	 
	  public Asset() {
		// TODO Auto-generated constructor stub
	}
	  
	  public Asset(long itemID,long locationID,int typeID,int quantity,int flag,int rawQuantity ) {
		  this.itemID=itemID;
		  this.locationID=locationID;
		  this.typeID=typeID;
		  this.quantity=quantity;
		  this.flag=flag;
		  this.rawQuantity=rawQuantity;
	}
	  public static Asset cloneIAsset(IAsset ia){
		  return new Asset(ia.getItemID(), ia.getLocationID(), ia.getTypeID(), ia.getQuantity(), ia.getFlag(), ia.getRawQuantity());		
	  }

		public static Asset cloneIMarketOrder(IMarketOrder ord) {			
			return new Asset(Data.getInstance().generateRandomizeItemID(), ord.getStationID(), ord.getTypeID(), ord.getVolRemaining(), 0, 0);
		}

		public static Asset cloneIMarketJob(IIndustryJob job) {
			return null;
//			return new Asset(Data.getInstance().generateRandomizeItemID(), job.getStationID(), job.getProductTypeID(), ord.getVolRemaining(), 0, 0);
		}
	  
	  @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + flag;
		result = prime * result + (int) (itemID ^ (itemID >>> 32));
		result = prime * result + (int) (locationID ^ (locationID >>> 32));
		result = prime * result + quantity;
		result = prime * result + rawQuantity;
		result = prime * result + typeID;
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
		Asset other = (Asset) obj;
		if (flag != other.flag)
			return false;
		if (itemID != other.itemID)
			return false;
		if (locationID != other.locationID)
			return false;
		if (quantity != other.quantity)
			return false;
		if (rawQuantity != other.rawQuantity)
			return false;
		if (typeID != other.typeID)
			return false;
		return true;
	}
	public long getItemID() {
		return itemID;
	}
	public void setItemID(long itemID) {
		this.itemID = itemID;
	}
	public long getLocationID() {
		return locationID;
	}
	public void setLocationID(long locationID) {
		this.locationID = locationID;
	}
	public int getTypeID() {
		return typeID;
	}
	public void setTypeID(int typeID) {
		this.typeID = typeID;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public int getRawQuantity() {
		return rawQuantity;
	}
	public void setRawQuantity(int rawQuantity) {
		this.rawQuantity = rawQuantity;
	}
	public int compareTo(Asset o) {
		// TODO Auto-generated method stub
		return (int)(itemID-o.itemID);
	}


}
