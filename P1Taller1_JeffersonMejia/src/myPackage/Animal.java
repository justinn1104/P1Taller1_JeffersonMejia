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

	public String GetName() {//By justinn1104
		return name;
	}

	public void SetName(String name) {//By justinn1104
		this.name = name;
	}

	public String GetSpecie() {//By justinn1104
		return specie;
	}

	public void SetSpecie(String specie) {//By justinn1104
		this.specie = specie;
	}

	public int GetAge() {//By justinn1104
		return age;
	}

	public void SetAge(int age) {//By justinn1104
		this.age = age;
	}

	public double GetWeight() {//By justinn1104
		return weight;
	}

	public void SetWeight(double weight) {//By justinn1104
		this.weight = weight;
	}

	public double GetHeight() {//By justinn1104
		return height;
	}

	public void SetHeight(double height) {//By justinn1104
		this.height = height;
	}

	public abstract void PlaySound();//By justinn1104

	public abstract void Describe();

	public void Grettings() {//By justinn1104
		System.out.println("Hola mi nombre es " + this.name);
	}
}
