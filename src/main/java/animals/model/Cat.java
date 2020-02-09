package animals.model;

public class Cat extends Animal implements DomesticAnimal{

    public void miau() {
        System.out.println("Miau");
    }

    @Override
    public void soundOfStrokedAnimal() {
        System.out.println("happy cat is meowing");
    }
}
