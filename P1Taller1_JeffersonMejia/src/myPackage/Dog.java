package myPackage;

public class Dog extends Animal {
	private String breed;

	public Dog(String name, String specie, int age, double weight, double height, String breed) {
		super(name, specie, age, weight, height);
		this.breed = breed;

	}

	public String GetBreed() {//Buenas Prcticas  Usasr para los metodos la  nomenclatura CamelCase @justinn1104
		return breed;
	}

	public void SetBreed(String breed) {//Buenas Prcticas  Usasr para los metodos la  nomenclatura CamelCase @justinn1104
		this.breed = breed;
	}

	public void Walk() {//Buenas Prcticas  Usasr para los metodos la  nomenclatura CamelCase @justinn1104
		System.out.println("---------------------------");
		System.out.println(this.getName() + " esta caminando");
	}

	@Override
	public void PlaySound() {//Buenas Prcticas  Usasr para los metodos la  nomenclatura CamelCase @justinn1104
		System.out.println("---------------------------");
		System.out.println("Wuf, wuf, wuf");
	}

	@Override
	public void Describe() {//Buenas Prcticas  Usasr para los metodos la  nomenclatura CamelCase @justinn1104

		System.out.println("Nombre: " + this.getName());
		System.out.println("Especie: " + this.getSpecie());
		System.out.println("Edad: " + this.getAge());
		System.out.println("Peso: " + this.getWeight());
		System.out.println("Altura: " + this.getHeight());
		System.out.println("Raza: " + this.getBreed());
	}
}
