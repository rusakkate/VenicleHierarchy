package by.itAcademy.training;

import java.util.Objects;

public abstract class FlyingVenicle extends LimitedEnergyVenicle {
	private int climbRate; // скороподъемность
	private int maxFlightAltitude; // максимальная высота полета
	private int takeOffWeight; // взлетный вес
	private int cruisingSpeed; // крейсерская скорость
	private int chassisTrack; // длина колеи шасси
	
	
	
	public int getClimbRate() {
		return climbRate;
	}
	public int getMaxFlightAltitude() {
		return maxFlightAltitude;
	}
	public int getTakeOffWeight() {
		return takeOffWeight;
	}
	public int getCruisingSpeed() {
		return cruisingSpeed;
	}
	public int getChassisTrack() {
		return chassisTrack;
	}
	public void setClimbRate(int climbRate) {
		this.climbRate = climbRate;
	}
	public void setMaxFlightAltitude(int maxFlightAltitude) {
		this.maxFlightAltitude = maxFlightAltitude;
	}
	public void setTakeOffWeight(int takeOffWeight) {
		this.takeOffWeight = takeOffWeight;
	}
	public void setCruisingSpeed(int cruisingSpeed) {
		this.cruisingSpeed = cruisingSpeed;
	}
	public void setChassisTrack(int chassisTrack) {
		this.chassisTrack = chassisTrack;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(chassisTrack, climbRate, cruisingSpeed, maxFlightAltitude, takeOffWeight);
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
		FlyingVenicle other = (FlyingVenicle) obj;
		return chassisTrack == other.chassisTrack && climbRate == other.climbRate
				&& cruisingSpeed == other.cruisingSpeed && maxFlightAltitude == other.maxFlightAltitude
				&& takeOffWeight == other.takeOffWeight;
	}
	public abstract void takeOff ();
	public abstract void land ();

}
