package s05_abstract_and_interface.tutorial.animal_and_interface;

import s05_abstract_and_interface.tutorial.animal_and_interface.animal.Animal;
import s05_abstract_and_interface.tutorial.animal_and_interface.animal.Chicken;
import s05_abstract_and_interface.tutorial.animal_and_interface.animal.Tiger;
import s05_abstract_and_interface.tutorial.animal_and_interface.ediable.Eatable;
import s05_abstract_and_interface.tutorial.animal_and_interface.fruit.Apple;
import s05_abstract_and_interface.tutorial.animal_and_interface.fruit.Fruit;
import s05_abstract_and_interface.tutorial.animal_and_interface.fruit.Orange;

public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Eatable eatable = (Eatable) animal;
                System.out.println("Eatable: " + eatable.howToEat());
            }
            System.out.println();
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
            System.out.println();
        }
    }
}
