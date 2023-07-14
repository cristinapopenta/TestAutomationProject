package Homework.Homework05;

import Homework.Homework05.Dog;
import java.util.*;

public class PetHotel {
    private HashMap<Integer, Dog> dogHashMap = new HashMap<>();

    public static void main(String[] args) {

        PetHotel petHotel = new PetHotel();

        Dog dog1 = new Dog("Tecky", "Terrier", "male", 1);
        Dog dog2 = new Dog("Toto", "Dalmatian", "male", 3);
        Dog dog3 = new Dog("Lord", "Golden Retriever", "male", 7);
        Dog dog4 = new Dog("Laica", "Dalmatian", "female", 5);


        System.out.println("------------------------------------");
        System.out.println("Adding dogs to the pet hotel:");
        System.out.println("------------------------------------");

        petHotel.addDogToRoom(101, dog1);
        petHotel.addDogToRoom(102, dog2);
        petHotel.addDogToRoom(103, dog3);

        System.out.println("------------------------------------");
        System.out.println("Initial list of dogs: ");
        petHotel.dogsList();

        System.out.println("------------------------------------");
        System.out.println("Trying to add a dog to an occupied room: ");
        petHotel.addDogToRoom(103, dog4);

        System.out.println("------------------------------------");
        System.out.println("Remove a dog from a given room: ");
        petHotel.removeDogFromRoom(102);
        System.out.println("------------------------------------");
        System.out.println("Current ist of dogs: ");
        petHotel.dogsList();

        System.out.println("------------------------------------");
        System.out.println("Remove a dog from an unoccupied or inexisting room: ");
        petHotel.removeDogFromRoom(107);
        System.out.println("------------------------------------");
        System.out.println("List of dogs: ");
        petHotel.dogsList();

        System.out.println("------------------------------------");
        System.out.println("Add a new dog: ");
        petHotel.addDogToRoom(104, dog4);

        System.out.println("------------------------------------");
        System.out.println("Trying to add the same dog to a different room: ");
        petHotel.addDogToRoom(110, dog4);

        System.out.println("------------------------------------");
        System.out.println("Current list of dogs: ");
        petHotel.dogsList();
    }

    public void addDogToRoom(Integer room, Dog dog) {
        if (dogHashMap.containsValue(dog)) {
            System.out.println(dog.toString() + " is already into another room no. ");
            return;
        }
        if (dogHashMap.containsKey(room)) {
            System.out.println("Room no. " + room + " is already occupied by " + dogHashMap.get(room));
            return;
        }
        dogHashMap.put(room, dog);
        System.out.println(dog.toString() + " was added to room no. " + room);
    }

    public void removeDogFromRoom(Integer room) {
        if (dogHashMap.containsKey(room)) {
            Dog dog = dogHashMap.get(room);
            dogHashMap.remove(room);
            System.out.println(dog.toString() + " left the room no. " + room);
            return;
        } else {
            System.out.println("Room no. " + room + " was not ocuppied by a dog or room does not exist");
        }
    }

    public void dogsList() {
        for (Integer room : dogHashMap.keySet()) {
            System.out.println("Room " + room + ": " + dogHashMap.get(room));
        }
    }
}


