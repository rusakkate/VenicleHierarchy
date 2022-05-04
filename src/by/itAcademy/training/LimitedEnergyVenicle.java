package by.itAcademy.training;

import java.util.Objects;

public abstract class LimitedEnergyVenicle extends Venicle {
	private String energyType;
	private int energyCapacity;
	private int energyConsumption;
	
	
	
	public String getEnergyType() {
		return energyType;
	}



	public int getEnergyCapacity() {
		return energyCapacity;
	}



	public int getEnergyConsumption() {
		return energyConsumption;
	}



	public void setEnergyType(String energyType) {
		this.energyType = energyType;
	}



	public void setEnergyCapacity(int energyCapacity) {
		this.energyCapacity = energyCapacity;
	}



	public void setEnergyConsumption(int energyConsumption) {
		this.energyConsumption = energyConsumption;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(energyCapacity, energyConsumption, energyType);
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
		LimitedEnergyVenicle other = (LimitedEnergyVenicle) obj;
		return energyCapacity == other.energyCapacity && energyConsumption == other.energyConsumption
				&& Objects.equals(energyType, other.energyType);
	}



	public double maxDistanse () {
		double maxDistanse;
		maxDistanse = energyCapacity / energyConsumption;
		return maxDistanse;
	}
	
	public abstract void maneuver ();

}
