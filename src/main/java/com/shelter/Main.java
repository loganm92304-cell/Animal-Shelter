package main.java.com.shelter;

public class Main {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        shelter.enqueue(new Dog("Buddy"));
        shelter.enqueue(new Cat("Whiskers"));
        shelter.enqueue(new Dog("Max"));
        shelter.enqueue(new Cat("Luna"));

        System.out.println("--- Adoption Simulation ---");

        Animal firstAdopted = shelter.dequeueAny();
        System.out.println("Adopted any: " + firstAdopted.getName() + " (" + firstAdopted.getClass().getSimpleName() + ")");

        Cat catAdopted = shelter.dequeueCats();
        System.out.println("Adopted cat: " + catAdopted.getName());

        Dog dogAdopted = shelter.dequeueDogs();
        System.out.println("Adopted dog: " + dogAdopted.getName());
    }
}