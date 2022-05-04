package by.itAcademy.training;

import java.util.Objects;

public abstract class WaterVenicle extends LimitedEnergyVenicle {
	private int displacement; // водоизмещение
	private int propulsion; // ходкость
	private int inertiaReleaseTime; // время погашения инерции
	
	
	
	
	public int getDisplacement() {
		return displacement;
	}
	public int getPropulsion() {
		return propulsion;
	}
	public int getInertiaReleaseTime() {
		return inertiaReleaseTime;
	}
	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
	public void setPropulsion(int propulsion) {
		this.propulsion = propulsion;
	}
	public void setInertiaReleaseTime(int inertiaReleaseTime) {
		this.inertiaReleaseTime = inertiaReleaseTime;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(displacement, inertiaReleaseTime, propulsion);
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
		WaterVenicle other = (WaterVenicle) obj;
		return displacement == other.displacement && inertiaReleaseTime == other.inertiaReleaseTime
				&& propulsion == other.propulsion;
	}
	
	
	public abstract void moor (); // причаливать
	public abstract void moveOff (); // отчаливать
	

}
