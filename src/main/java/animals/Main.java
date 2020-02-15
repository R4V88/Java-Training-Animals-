package animals;

import animals.model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int wybor;
        Animal[] animals = new Animal[3];
        int j = 1;

        for (int i = 0; i < animals.length; i++) {
//            do {
            System.out.println("Jakie zwierze chcesz dodac?");
            System.out.println("Wybierz numer: \n1: Pies \n2: Kot \n3: Wilk \n4: Hiena \n5: Puma \n6: Wyjscie");
            wybor = Integer.parseInt(scanner.nextLine());
            String imie;
            int wiek;
            int pozycja;

            switch (wybor) {
                case 1: {
                    Animal animal = new Dog();
                    System.out.println("Podaj miejsce zwierzaka w tabeli: od 0 do " + (animals.length - 1));
                    pozycja = Integer.parseInt(scanner.nextLine());
                    System.out.println("Podaj imie zwierzaka: ");
                    imie = scanner.nextLine();
                    System.out.println("Podaj wiek zwierzaka: ");
                    wiek = Integer.parseInt(scanner.nextLine());
                    animal.setName(imie);
                    animal.setAge(wiek);
                    animals[pozycja] = animal;
                    break;
                }
                case 2: {
                    Animal animal = new Cat();
                    System.out.println("Podaj miejsce zwierzaka w tabeli: od 0 do " + (animals.length - 1));
                    pozycja = Integer.parseInt(scanner.nextLine());
                    System.out.println("Podaj imie zwierzaka: ");
                    imie = scanner.nextLine();
                    System.out.println("Podaj wiek zwierzaka: ");
                    wiek = Integer.parseInt(scanner.nextLine());
                    animal.setName(imie);
                    animal.setAge(wiek);
                    animals[pozycja] = animal;
                    break;
                }
                case 3: {
                    Animal animal = new Wolf();
                    System.out.println("Podaj miejsce zwierzaka w tabeli: od 0 do " + (animals.length - 1));
                    pozycja = Integer.parseInt(scanner.nextLine());
                    System.out.println("Podaj imie zwierzaka: ");
                    imie = scanner.nextLine();
                    System.out.println("Podaj wiek zwierzaka: ");
                    wiek = Integer.parseInt(scanner.nextLine());
                    animal.setName(imie);
                    animal.setAge(wiek);
                    animals[pozycja] = animal;
                    break;
                }
                case 4: {
                    Animal animal = new Hiena();
                    System.out.println("Podaj miejsce zwierzaka w tabeli: od 0 do " + (animals.length - 1));
                    pozycja = Integer.parseInt(scanner.nextLine());
                    System.out.println("Podaj imie zwierzaka: ");
                    imie = scanner.nextLine();
                    System.out.println("Podaj wiek zwierzaka: ");
                    wiek = Integer.parseInt(scanner.nextLine());
                    animal.setName(imie);
                    animal.setAge(wiek);
                    animals[pozycja] = animal;
                    break;
                }
                case 5: {
                    Animal animal = new Puma();
                    System.out.println("Podaj miejsce zwierzaka w tabeli: od 0 do " + (animals.length - 1));
                    pozycja = Integer.parseInt(scanner.nextLine());
                    System.out.println("Podaj imie zwierzaka: ");
                    imie = scanner.nextLine();
                    System.out.println("Podaj wiek zwierzaka: ");
                    wiek = Integer.parseInt(scanner.nextLine());
                    animal.setName(imie);
                    animal.setAge(wiek);
                    animals[pozycja] = animal;
                    break;
                }
                default: {
                    System.out.println("Wyjście...");
                }
            }
//            } while (j < animals.length);
        }

        //Printing all animals in the animals Array.
        printAllAnimalsInArray(animals);

        //Printing one selected animal by user.
        System.out.println("Podaj numer w tabeli zwierzaka ktorego chcesz wypisac: ");
        int numerZwierzakaWTabeli = Integer.parseInt(scanner.nextLine());
        printAnAnimal(animals, numerZwierzakaWTabeli);

        //Odpytuje wszystkie zwierzatka
        odpytajZwierzatko(animals);

        //Glaska zwierzatka
        poglaskajZwierzatko(animals);
    }

    /*
        To print all animals.
     */
    public static void printAllAnimalsInArray(Animal[] animals) {
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }

    /*
        To print selected animal.
     */
    public static void printAnAnimal(Animal[] animals, int i) {
        System.out.println(animals[i].toString());
    }

    /*
        Do odpytywania wszystkich zwierzatek
     */
    public static void odpytajZwierzatko(Animal[] animals) {
        for (Animal animal : animals) {
            switch (animal.getClass().getSimpleName()) {
                case ("Dog"): {
                    ((Dog) animal).hau();
                }
                case ("Cat"): {
                    ((Cat) animal).miau();
                }
                case ("Wolf"): {
                    ((Wolf) animal).woof();
                }
                case ("Hiena"): {
                    ((Dog) animal).hau();
                }
                case ("Puma"): {
                    ((Cat) animal).miau();
                }
            }
        }
    }

    /*
        Do glaskania domowego zwierzaka
     */
    public static void poglaskajZwierzatko(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal instanceof DomesticAnimal) {
                ((DomesticAnimal) animal).soundOfStrokedAnimal();
            }
        }
    }
}

