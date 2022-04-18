/* Q.1603 Design Parking System
 * Design a parking system for a parking lot. T
 * he parking lot has three kinds of parking spaces: 
 * big, medium, and small, with a fixed number of slots 
 * for each size.

Implement the ParkingSystem class:

ParkingSystem(int big, int medium, int small) Initializes 
object of the ParkingSystem class. The number of slots 
for each parking space are given as part of the constructor.
bool addCar(int carType) Checks whether there is a parking 
space of carType for the car that wants to get into the 
parking lot. 
carType can be of three kinds: big, medium, or small, 
which are represented by 1, 2, and 3 respectively. 
A car can only park in a parking space of its carType. 
If there is no space available, return false, 
else park the car in that size space and return true.
 * */

public class DesignParkingSystem {
	private int big;
	private int medium;
	private int small;
	
	public DesignParkingSystem(int big, int medium, int small) {
		this.big = big;
		this.medium = medium;
		this.small = small;
	}
	
	public boolean addCar(int carType) {
		if(carType == 1) {
			if(big >= 1) {
				big--;
				return true;
			}
			return false;
		}
		if(carType == 2) {
			if(medium >= 1) {
				medium--;
				return true;
			}
			return false;
		}
		if(small == 1) {
			small--;
			return true;
		}
		return false;
	}

    public static void main(String[] args) {
    	DesignParkingSystem obj = new DesignParkingSystem(1,1,0);
    	boolean param_1 = obj.addCar(1); 
    	// return true because there is 1 available slot for a big car
    	boolean param_2 = obj.addCar(2);
    	// return true because there is 1 available slot for a medium car
    	boolean param_3 = obj.addCar(3);
    	// return false because there is no available slot for a small car
    	boolean param_4 = obj.addCar(1);
    	// return false because there is no available slot for a big car. 
    	//It is already occupied.
		System.out.println(param_1);
		System.out.println(param_2);
		System.out.println(param_3);
		System.out.println(param_4);
		
	}
}
