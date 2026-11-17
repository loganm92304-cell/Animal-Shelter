package main.java.com.shelter;

import java.util.LinkedList;

public class AnimalShelter {
    private final LinkedList<Dog> dogs = new LinkedList<>();
    private final LinkedList<Cat> cats = new LinkedList<>();
    private int order = 0; // Timestamp tracker

    public void enqueue(Animal animal) {
        animal.setOrder(order++);

        if (animal instanceof Dog) {
            dogs.addLast((Dog) animal);
        } else if (animal instanceof Cat) {
            cats.addLast((Cat) animal);
        }
    }

    public Animal dequeueAny() {
        if (dogs.isEmpty()) {
            return dequeueCats();
        } else if (cats.isEmpty()) {
            return dequeueDogs();
        }

        Dog oldestDog = dogs.peek();
        Cat oldestCat = cats.peek();

        if (oldestDog.isOlderThan(oldestCat)) {
            return dogs.poll();
        } else {
            return cats.poll();
        }
    }

    public Dog dequeueDogs() {
        if (dogs.isEmpty()) {
            return null;
        }
        return dogs.poll();
    }

    public Cat dequeueCats() {
        if (cats.isEmpty()) {
            return null;
        }
        return cats.poll();
    }
}