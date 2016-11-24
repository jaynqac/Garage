import java.util.*;

public class Vehicle
{	
	// Vehicle class has 4 common fields
	public int vehcID;
	public int wheel;
	public String body;
	public String engine;
	public String brandName;

	// Vehicle class has one constructor
	public Vehicle (int setID, String startBrandName, int startWheel, String startBody, String startEngine)
	{
		vehcID = setID;
		brandName = startBrandName;
		wheel = startWheel;
		body = startBody;
		engine = startEngine;
	}

	// Vehicle class has 5 methods
	public void setID(int i)
	{
		vehcID = i;
	}

	public void setBrandName(String bn)
	{
		brandName = bn;
	}

	public void setWheel(int n)
	{
		wheel = n;
	}

	public void setBody(String s)
	{
		body = s;
	}

	public void setEngineType(String eT)
	{
		engine = eT;
	}

	public String toString()
	{
		return "\nVehicle ID: " + vehcID + "\nBrand Name: " + brandName + "\nNumber of Wheels: " + wheel + "\nBody Type: " + body + "\nEngine: " + engine;
	}

	public int getID()
	{
		return vehcID;
	}

}