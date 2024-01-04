package Basics;

public class Car {

	public static void main(String[] args) {
		Carapp c1 = new Carapp();
		Carapp c2 = new Carapp();
		c1.brand = "Tata";
		c2.brand = "Mahindra";
		c1.price = 25.5f;
		c1.model = "Harrier";
		c2.model = "Scorpio";
		c2.price = 22.5f;

		c1.info();
		c2.info();

	}

}
