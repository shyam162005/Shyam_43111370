package sample;

class Animal{
	String name;
	
	Animal(String name) {
		this.name = name;
		System.out.println("Constructor for "+ name);
	}
	void sound() {
		System.out.println(name + "makes a sound");
	}
	void animalinfo() {
		System.out.println("Animal = " + name);
	}
}

class dog extends Animal{
	dog(String name){
		super(name);
		System.out.println("dog constructor");
	}
	void sound() {
		System.out.println(name + "barks");
	}
}

public class constructor {
	public static void main(String[] args) {
		dog d = new dog("sheero");
		d.sound();
		d.animalinfo();
	}
}
