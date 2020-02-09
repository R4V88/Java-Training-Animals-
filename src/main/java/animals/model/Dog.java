package animals.model;

public class Dog extends Animal implements DomesticAnimal{
    public void hau() {
        System.out.println("Hau");
    }

    @Override
    public void soundOfStrokedAnimal() {
        System.out.println("happy dog is barking");
    }
}
