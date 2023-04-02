package week1.day2;

public class Car {
	
	public void printCarBrand() {
		System.out.println("Car Brand is Hundai");
	}

	public int getRegNumber() {
		return 1234;
	}

	public void isPuncture(boolean carStatus) {
		
		if (carStatus ==false)
		{
			System.out.println("Car is punctured");
		} 
		else {
			System.out.println("Car is NOT punctured");
		}
	}

	public void getCarModel() {
		String carModel = "i10";
		System.out.println("Model of the car is "+carModel);
	}

	public int multiple(int a, int b, int c) {
		return a * b * c;
	}

	public static void main(String[] args) {
		Car objectCar = new Car();
		objectCar.printCarBrand();
		int regNumber = objectCar.getRegNumber();
		System.out.println("Reg Number is " + regNumber);
		objectCar.isPuncture(false);
		int multipleValue = objectCar.multiple(2, 2, 2);
		System.out.println("Multiple of 3 numbers is " + multipleValue);
		objectCar.getCarModel();
	}
}
