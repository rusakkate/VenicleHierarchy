package by.itAcademy.training;

import java.util.Objects;

public abstract class Train extends LimitedEnergyVenicle {
	private int trackWidth; // ширина колеи
	private String driveType; // тип привода
	private int powerPlant; // мощность силовой установки
	
	
	
	public int getTrackWidth() {
		return trackWidth;
	}

	public String getDriveType() {
		return driveType;
	}

	public int getPowerPlant() {
		return powerPlant;
	}

	public void setTrackWidth(int trackWidth) {
		this.trackWidth = trackWidth;
	}

	public void setDriveType(String driveType) {
		this.driveType = driveType;
	}

	public void setPowerPlant(int powerPlant) {
		this.powerPlant = powerPlant;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(driveType, powerPlant, trackWidth);
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
		Train other = (Train) obj;
		return Objects.equals(driveType, other.driveType) && powerPlant == other.powerPlant
				&& trackWidth == other.trackWidth;
	}

	public void buzz () {
		
	}
	
	public void hitchWagon () {
		
	}

}
