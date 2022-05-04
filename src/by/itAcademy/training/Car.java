package by.itAcademy.training;

import java.util.Objects;

public class Car extends Automobile {
	private String bodyType;
	private String model;
	private int numberDoors;
	
	public Car () {
		
	}
	
	public Car (String produser, String model, String gearboxType, int price) {
		this.setProducer(produser);
		this.model = model;
		this.setGearboxType(gearboxType);
		this.setPrice(price);
		
	}
	
	
	
	public String getBodyType() {
		return bodyType;
	}

	public String getModel() {
		return model;
	}

	public int getNumberDoors() {
		return numberDoors;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setNumberDoors(int numberDoors) {
		this.numberDoors = numberDoors;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(bodyType, model, numberDoors);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(bodyType, other.bodyType) && Objects.equals(model, other.model)
				&& numberDoors == other.numberDoors;
	}

	@Override
	public void maneuver() {
		// TODO Auto-generated method stub	
	}
	@Override
	public void consumeEnergy() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void gas() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void move() {
		System.out.println("Car move");
		
	}
	@Override
	public void brake() {
		// TODO Auto-generated method stub
		
	}
	
	public void drift() {
		
		
	}
	

}
