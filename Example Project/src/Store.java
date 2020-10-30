/*
 * Name: Isaac Blackwood
 * Date: 10/26/2020
 * Class: SE 3354.004
 * Project: Grab and Go Groceries
 * Description: Dummy class designed for testing the inStock method
 */
import java.util.ArrayList;

public class Store 
{
	private ArrayList<Item> itemList;
	
	public Store(ArrayList<Item> itemList)
	{
		this.itemList = itemList;
	}
	
	//code to be tested
	public boolean inStock(String itemName)
	{
		Item item = new Item(itemName,0);
		if(!itemList.contains(item))
		{
			//item is not in store
			return false;
		}
		Item temp = itemList.get(itemList.indexOf(item));
		if (temp.count > 0)
		{
			return true;
		}
		return false;
	}
}
