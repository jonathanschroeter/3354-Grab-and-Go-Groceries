/*
 * Name: Isaac Blackwood
 * Date: 10/26/2020
 * Class: SE 3354.004
 * Project: Grab and Go Groceries
 * Description:  Dummy class designed for testing the inStock method
 */
public class Item 
{
	public String name;
	public int count;
	
	public Item(String name, int count)
	{
		this.name = name;
		this.count = count;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Item)
		{
			Item temp = (Item) o;
			if (this.name.equals(temp.name))
			{
				return true;
			}
		}
		return false;
	}
}
