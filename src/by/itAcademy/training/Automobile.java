package by.itAcademy.training;

import java.util.Objects;

public abstract class Automobile extends LimitedEnergyVenicle {
	private String gearboxType;
	private int accelerationTime;
	private String driveUnitType; // тип привода
	private String brakeType;

	public String getGearboxType() {
		return gearboxType;
	}



	public int getAccelerationTime() {
		return accelerationTime;
	}



	public String getDriveUnitType() {
		return driveUnitType;
	}



	public String getBrakeType() {
		return brakeType;
	}



	public void setGearboxType(String gearboxType) {
		this.gearboxType = gearboxType;
	}



	public void setAccelerationTime(int accelerationTime) {
		this.accelerationTime = accelerationTime;
	}



	public void setDriveUnitType(String driveUnitType) {
		this.driveUnitType = driveUnitType;
	}



	public void setBrakeType(String brakeType) {
		this.brakeType = brakeType;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(accelerationTime, brakeType, driveUnitType, gearboxType);
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
		Automobile other = (Automobile) obj;
		return accelerationTime == other.accelerationTime && Objects.equals(brakeType, other.brakeType)
				&& Objects.equals(driveUnitType, other.driveUnitType) && Objects.equals(gearboxType, other.gearboxType);
	}


}
