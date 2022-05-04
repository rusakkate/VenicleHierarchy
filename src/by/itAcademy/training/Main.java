package by.itAcademy.training;

public class Main {

	public static void main(String[] args) {
		Car car1 = new Car ("Toyota", "Yaris", "Mechanical", 7000);
		Car car2 = new Car ("Toyota", "Yaris", "Mechanical", 7000);
		car1.move();
		System.out.println( car1.equals(car2) );
		
		

	}

}
