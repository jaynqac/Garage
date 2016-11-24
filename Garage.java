import java.util.*;


public class Garage
{
	private double baseCost = 50.00;
	public static List<Vehicle> garageList = new ArrayList<Vehicle>();

	public Garage()
	{
	
	}

	public static void main(String[] args)
	{
		Garage g = new Garage();

		Vehicle myVehicle = new Car(1, "Audi", 4, "Coupe", "Motor", 2.0, 4, 'y');
		Vehicle myVehicle1 = new Car(2, "BMW", 4, "Coupe", "Motor", 3.0, 4, 'y');
		Vehicle myVehicle2 = new Bicycle(3, "Grant", 2, "Frame", "Legs", "Straight", 2);
		Vehicle myVehicle3 = new Bicycle(4, "Ridge", 2, "Frame", "Legs", "Mountain", 2);
		Vehicle myVehicle4 = new ATV(5, "Honda", 4, "Shell", "Motor", "Yes", "Snow");
		Vehicle myVehicle5 = new ATV(6, "Yamaha", 4, "Shell", "Motor", "Yes", "Dirt");

		g.addToGarage(myVehicle);
		g.addToGarage(myVehicle1);
		g.addToGarage(myVehicle2);
		g.addToGarage(myVehicle3);
		g.addToGarage(myVehicle4);
		g.addToGarage(myVehicle5);

		for (Vehicle temp : garageList)
		{
			System.out.println(temp.toString());
		} 

		g.removeFromGarage(myVehicle2);

		for (Vehicle temp : garageList)
		{
			System.out.println(temp.toString());
		} 

		Vehicle temp;
		temp = g.getVehicle(2);
		System.out.println(g.fixVehicle(temp));

		g.emptyGarage();

		for (Vehicle temp2 : garageList)
		{
			System.out.println(temp2.toString());
			System.out.println("Garage is empty");
		} 

	}

	public void addToGarage(Vehicle mVehc)
	{
		garageList.add(mVehc);
	}

	public void removeFromGarage(Vehicle mVehc)
	{
		garageList.remove(mVehc);
	}

	public Vehicle getVehicle(int vehID)
	{
		for (Vehicle temp : garageList)
		{
			if (temp.getID() == vehID)
			{
				return temp;
			}
			
		} return null;

	}

	public String fixVehicle(Vehicle veh)
	{
		double cost=0;
		//search for vehicle
		
		getVehicle(veh.getID());
		// call correct cost method
		if (veh instanceof Car) { cost = carCost(baseCost); }
		else if (veh instanceof Bicycle) { cost = bicycleCost(baseCost); }
		else if (veh instanceof ATV) { cost = atvCost(baseCost); }

		return ("\nThe price to fix this vehicle is: " + cost);
	}

	public void emptyGarage()
	{
		garageList.clear();
	}

	public double carCost(double baseCost)
	{
		return baseCost = baseCost + 150;
	}

	public double bicycleCost(double baseCost)
	{
		return baseCost = baseCost + 30;
	}

	public double atvCost(double baseCost)
	{
		return baseCost = baseCost + 80;
	}

}