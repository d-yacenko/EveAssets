package ru.itx.EveAssets.production;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

import ru.itx.EveAssets.Data;

public abstract class Item {
	public int volume;
	public boolean isElementary;
	
	public String getName(){
		return getClass().getSimpleName();
	}
	
	public int getVolume(){
		return volume;
	}
	
	@Override
	public String toString() {
		return String.format("%1$20d %2$s",	volume,getName());
	}

	public ArrayList<Item> make() {return null;}
	public ArrayList<Item> makeFromRest() {return null;}

	public ArrayList<Item> make(int run) {return null;}
	public ArrayList<Item> makeFromRest(int run) {return null;}

	public static Item duplicate(Item item,int num){
		Class classItem=item.getClass();
		Item tmpItem=null;
		try{
		Constructor<?> constructorItem=classItem.getConstructor(int.class);
		tmpItem=(Item)constructorItem.newInstance(num);
		}catch(Exception e){System.out.println(e);}
		return tmpItem;
	}
	public static ArrayList<Item> comress(ArrayList<Item> list){
		ArrayList<Item> ret=new ArrayList<Item>();
		Item[] items= (Item[])list.toArray(new Item[list.size()]);
		for(int i=0;i<items.length-1;i++){
			if(items[i]==null) continue;
			Item current=items[i];
			items[i]=null;
			for(int j=i+1;j<items.length;j++){
				if(items[j]==null)continue;
				if(current.getClass()==items[j].getClass()){
					current=duplicate(current, current.volume+items[j].volume);
					items[j]=null;
				}
			}
			ret.add(current);
		}
		return ret;
	}
	public static void print(ArrayList<Item> list){
		for(Item item: list){
			System.out.println(item);
		}
	}
	
	protected int minus(String name,int needed){
		return Data.getInstance().minusRest(name,needed);
	}
}
