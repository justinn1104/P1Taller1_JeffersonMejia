package myPackage;

public class P1Taller1_JeffersonMejia {

	public static void main(String[] args) {
		/* Dog milaneso = new Dog("Milaneso", "Mamifero", 5, 5.20, 5.6, "Pastor aleman");
		Seal seal = new Seal("Seal", "Mamifero", 5, 5.20, 5.6);
		milaneso.describe();// POLIMORFISMO
		milaneso.playSound();// POLIMORFISMO
		milaneso.walk();
		seal.describe();// POLIMORFISMO
		seal.playSound();// POLIMORFISMO*///POLIMORFISMO NO ADECUADO 
		
		
		//UN OBJETO DE LA CLASE MADRE ACCEDE A LOS OBJETOS DE LAS CLASES HIJAS CON SUS ATRIBUTOS PROPIOS POLIMORFISMO
		Animal animalsMejia[] = new Animal[3];
		animalsMejia[0]= new Animal("Jefferson", "humano", 45, 100.20f, 1.55f);
		animalsMejia[1]= new Dog("Milaneso", "Mamifero", 5, 5.20f, 5.6f, "Pastor aleman");
		animalsMejia[2]= new Seal("Seal", "Mamifero", 5, 5.20f, 5.6f);
		

		for(Animal animals: animalsMejia) {
			System.out.println(animals.playSound());
			System.out.println(" ");
			System.out.println(animals.describe());
			System.out.println(" ");
			
		}
	}

}
