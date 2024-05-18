package myPackage;

public class P1Taller1_JeffersonMejia {

	public static void main(String[] args) {
		Dog milaneso = new Dog("Milaneso", "Mamifero", 5, 5.20, 5.6, "Pastor aleman");
		Seal seal = new Seal("Seal", "Mamifero", 5, 5.20, 5.6);

		milaneso.describe();// POLIMORFISMO
		milaneso.playSound();// POLIMORFISMO
		milaneso.walk();
		seal.describe();// POLIMORFISMO
		seal.playSound();// POLIMORFISMO
	}

}
