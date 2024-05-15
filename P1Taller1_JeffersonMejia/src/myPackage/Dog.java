package myPackage;

public class Dog extends Animal {
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

}
