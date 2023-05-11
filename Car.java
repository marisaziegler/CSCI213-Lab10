public class Car extends Vehicle {
	private int numDoors;
	private int passengers;
	
	public Car (String theMake, String theModel, String thePlate, int theDoors,
		int thePassengers) {
		super(theMake, theModel, thePlate);
		this.numDoors =  theDoors;
		this.passengers = thePassengers;
		}
	
	
	public int getDoors(){
		return this.numDoors;
	}
	
	public int getPassengers(){
		return this.passengers;
	}
	
	//@Override
	public String toString(){
		String result = String.format("%d-door %s %s with license %s", 
			this.numDoors, this.getMake(), this.getModel(), this.getPlate());
		return result;
	}
	
	//@Override
	public boolean equals(Object other){
		if(!(other instanceof Car)){
			return false; 
		}
		
		Car obj = (Car) other;
		
		
		if (this.numDoors == obj.getDoors()){
			if (this.passengers == obj.getPassengers()){
					return super.equals(obj);
			}
		}
		return false;
	}
	
	//@Overrride
	public Car copy(){
		int theDoors = this.getDoors();
		int thePass = this.getPassengers();
		String theMake = this.getMake();
		String theModel = this.getModel();
		String thePlate = this.getPlate();
		
		Car theCopy = new Car(theMake, theModel, thePlate, theDoors, thePass);
		
		return theCopy;
		
	}
	
}