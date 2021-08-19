package codeChallenge12;

import java.util.ArrayList;

public class AnimalShelter {
    ArrayList<Animal> animalList = new ArrayList<Animal>();

    //enqueue that accepts Dog object
    public void enqueue(Dog d){
        addAnimal(d);
    }

    //enqueue that accepts Cat object
    public void enqueue(Cat c){
        addAnimal(c);
    }

    //dequeue that retrieves preference
    public Animal dequeue(String pref) {
        Animal resultAnimal = new Animal();

        //searching for preference
        for(Animal a:animalList){
            if (a.type.equals(pref)) {
                resultAnimal = a;
                animalList.remove(a);
                break;
            }
        }

        //if preference is not found, select the first item in arrayList
        if (resultAnimal.type.equals("")) {
            resultAnimal = animalList.get(0);
            animalList.remove(animalList.get(0));
        }

        return resultAnimal;

    }

    //adds animal to ArrayList
    private void  addAnimal(Animal a){
        animalList.add(a);
    }

    //display of all animals in Shelter
    public void displayAnimalList(){
        System.out.println("SHELTER LIST:");
        System.out.println("ID:TYPE");
        for(Animal a:animalList) {
            System.out.println(a.id+":"+a.type);
        }
    }
}
