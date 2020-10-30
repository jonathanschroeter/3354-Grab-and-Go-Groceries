/*
 * Name: Isaac Blackwood
 * Date: 10/26/2020
 * Class: SE 3354.004
 * Project: Grab and Go Groceries
 * Description: Test class designed for testing the inStock method
 */

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class StoreTest 
{
	@Test
	public void inStockTest()
	{
		//This should test three possible cases for finding whether or not an item is in stock
		//Create an empty list
		ArrayList<Item> itemList = new ArrayList<>();
		Store store = new Store(itemList);
		
		//the store does not contain the item looked up
		assertEquals(false, store.inStock("Banana"));
		
		//the store contains the item and the item is in stock
		itemList.add(new Item("Banana", 10));
		assertEquals(true, store.inStock("Banana"));

		//the store contains the item but the item is out of stock
		itemList.add(new Item("Cucumber", 0));
		assertEquals(false, store.inStock("Cucumber"));
	}
}
