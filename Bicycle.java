import java.util.*;

public class Bicycle extends Vehicle
{
	public String handleBars;
	public int pedals;

	public Bicycle(int setID, String startBrandName, int startWheel, 
				String startBody, String startEngine,
				String startHandleBars, int startPedals)
	{
		super(setID, startBrandName, startWheel, startBody, startEngine);
		handleBars = startHandleBars;
		pedals = startPedals;
	}

	public void setHandleBars(String h)
	{
		handleBars = h;
	}

	public void setPedals(int p)
	{
		pedals = p;
	}

	public String toString()
	{
		return super.toString() + "\nNumber of Handlebars: " + handleBars + "\nNumber Of Pedals: " + pedals;
	}
}