package by.itAcademy.training;

import java.util.Objects;

public abstract class Venicle {
	private int avrSpeed;
	private int maxSpeed;
	private String producer;
	private int price;
	private String movingEnviroment; // air, water, ground, underground
	private String mover;
	private String powerSource; // fuel, electricity, contactNetwork
	private String engeneType; // тип двигателя
	private int engeneCapacity; //internal combustion, electric motor, steam, jet, turbine
	private String appointment; // cargo, passenger
	private int length;
	private int hight;
	private int width;
	private int weight;
	private int curbWeight; // снаряженная масса
	
	
	
	public int getAvrSpeed() {
		return avrSpeed;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public String getProducer() {
		return producer;
	}
	public int getPrice() {
		return price;
	}
	public String getMovingEnviroment() {
		return movingEnviroment;
	}
	public String getMover() {
		return mover;
	}
	public String getPowerSource() {
		return powerSource;
	}
	public String getEngeneType() {
		return engeneType;
	}
	public int getEngeneCapacity() {
		return engeneCapacity;
	}
	public String getAppointment() {
		return appointment;
	}
	public int getLength() {
		return length;
	}
	public int getHight() {
		return hight;
	}
	public int getWidth() {
		return width;
	}
	public int getWeight() {
		return weight;
	}
	public int getCurbWeight() {
		return curbWeight;
	}
	public void setAvrSpeed(int avrSpeed) {
		this.avrSpeed = avrSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setMovingEnviroment(String movingEnviroment) {
		this.movingEnviroment = movingEnviroment;
	}
	public void setMover(String mover) {
		this.mover = mover;
	}
	public void setPowerSource(String powerSource) {
		this.powerSource = powerSource;
	}
	public void setEngeneType(String engeneType) {
		this.engeneType = engeneType;
	}
	public void setEngeneCapacity(int engeneCapacity) {
		this.engeneCapacity = engeneCapacity;
	}
	public void setAppointment(String appointment) {
		this.appointment = appointment;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setCurbWeight(int curbWeight) {
		this.curbWeight = curbWeight;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(appointment, avrSpeed, curbWeight, engeneCapacity, engeneType, hight, length, maxSpeed,
				mover, movingEnviroment, powerSource, price, producer, weight, width);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venicle other = (Venicle) obj;
		return Objects.equals(appointment, other.appointment) && avrSpeed == other.avrSpeed
				&& curbWeight == other.curbWeight && engeneCapacity == other.engeneCapacity
				&& Objects.equals(engeneType, other.engeneType) && hight == other.hight && length == other.length
				&& maxSpeed == other.maxSpeed && Objects.equals(mover, other.mover)
				&& Objects.equals(movingEnviroment, other.movingEnviroment)
				&& Objects.equals(powerSource, other.powerSource) && price == other.price
				&& Objects.equals(producer, other.producer) && weight == other.weight && width == other.width;
	}
	public abstract void consumeEnergy ();
	public abstract void gas ();
	public abstract void move ();
	public abstract void brake ();
	
	
	

}
