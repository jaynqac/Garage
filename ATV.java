import java.util.*;

public class ATV extends Vehicle
{
	public String brakes;
	public String tyres;

	public ATV(int setID, String startBrandName, int startWheel,
			String startBody, String startEngine,
			String startBrakes, String startTyres) 
	{
		super(setID, startBrandName, startWheel, startBody, startEngine);
		brakes = startBrakes;
		tyres = startTyres;
	}

	public void setBrakes(String b)
	{
		brakes = b;
	}

	public void setTyres(String t)
	{
		tyres = t;
	}

	public String toString()
	{
		return super.toString() + "\nBrakes: " + brakes + "\nType of tyres: " + tyres;
	}

}