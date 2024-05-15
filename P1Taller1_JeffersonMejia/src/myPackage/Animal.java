package myPackage;

public abstract class Animal {
	private String name, specie;
	private int age;
	private double weight, height;

	public Animal(String name, String specie, int age, double weight, double height) {
		super();
		this.name = name;
		this.specie = specie;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecie() {
		return specie;
	}

	public void setSpecie(String specie) {
		this.specie = specie;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public abstract void playSound();

	public abstract void describe();

	public void grettings() {
		System.out.println("Hola mi nombre es " + this.name);
	}
}
