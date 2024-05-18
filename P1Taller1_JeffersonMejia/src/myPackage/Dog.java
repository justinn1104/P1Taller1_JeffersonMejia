package myPackage;

public class Dog extends Animal {
	/*
	private String breed;

	public Dog(String name, String specie, int age, double weight, double height, String breed) {
		super(name, specie, age, weight, height);
		this.breed = breed;

	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void walk() {
		System.out.println("---------------------------");
		System.out.println(this.getName() + " esta caminando");
	}

	@Override
	public void playSound() {
		System.out.println("---------------------------");
		System.out.println("Wuf, wuf, wuf");
	}

	@Override
	public void describe() {

		System.out.println("Nombre: " + this.getName());
		System.out.println("Especie: " + this.getSpecie());
		System.out.println("Edad: " + this.getAge());
		System.out.println("Peso: " + this.getWeight());
		System.out.println("Altura: " + this.getHeight());
		System.out.println("Raza: " + this.getBreed());
	}*/

	protected String breed;

	public Dog(String name, String specie, int age, float weight, float height, String breed) {
		super(name, specie, age, weight, height);
		this.breed = breed;

	}

	public String GetBreed() {
		return breed;
	}

	public void SetBreed(String breed) {
		this.breed = breed;
	}

	public void walk() {
		System.out.println("---------------------------");
		System.out.println(this.GetName() + " esta caminando");
	}

	@Override
	
	public String playSound() {
		return "---------------------------\n"+
				"Wuf, wuf, wuf\n";
	};
	@Override
	public String describe() {
		return "Nombre: "+GetName()+
				"\nEspecie: "+GetSpecie()+
				"\nEdad: "+GetAge()+
				"\nPeso: "+GetWeight()+
				"\nAltura: "+GetHeight()+
				"\nRaza: " + GetBreed();
	};


	
}
