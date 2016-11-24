import java.util.*;

public class Car extends Vehicle
{
	// Car subclass adds 3 fields
	public double motorSize;
	public int numOfWindows;
	public char exhaust;

	// Cat subclass has one constructor
	public Car(int setID, String startBrandName, int startWheel, 
			String startBody, String startEngine, 
			double startMotorSize, int startNumOfWheels, 
			char startExhaust)
	{
		super(setID, startBrandName, startWheel, startBody, startEngine);
		motorSize = startMotorSize;
		numOfWindows = startNumOfWheels;
		exhaust = startExhaust;
	}

	public void setMotorSize(int m)
	{
		motorSize = m;
	}

	public void setNumOfWindows(int w)
	{
		numOfWindows = w;
	}

	public void exhaustExists(char c)
	{
		exhaust = c;
	}

	public String toString()
	{
		return super.toString() + "\nMotor Size: " + motorSize + "\nNumber Of Windows: " + numOfWindows + "\nExhaust: " + exhaust;
	}
}