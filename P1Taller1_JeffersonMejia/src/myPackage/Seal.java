package myPackage;

public class Seal extends Animal {
/*
	public Seal(String name, String specie, int age, double weight, double height) {
		super(name, specie, age, weight, height);

	}

	@Override
	public void playSound() {
		System.out.println("---------------------------");
		System.out.println("Arf, arf, arf");
	}

	@Override
	public void describe() {

		System.out.println("Nombre: " + this.getName());
		System.out.println("Especie: " + this.getSpecie());
		System.out.println("Edad: " + this.getAge());
		System.out.println("Peso: " + this.getWeight());
		System.out.println("Altura: " + this.getHeight());
	}

	public void swim() {
		System.out.println("---------------------------");
		System.out.println(this.getName() + " esta nadando");
	}*/



	public Seal(String name, String specie, int age, float weight, float height) {
		super(name, specie, age, weight, height);

	}

	@Override
	public String playSound() {
		return "---------------------------\n"+
				"Arf, arf, arf\n"+
				"---------------------------\n"+
				GetName() + " esta nadando";
	};

	
	@Override
	public String describe() {
		return "Nombre: "+GetName()+
				"\nEspecie: "+GetSpecie()+
				"\nEdad: "+GetAge()+
				"\nPeso: "+GetWeight()+
				"\nAltura: "+GetHeight();
	};
	
}
