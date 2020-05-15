package s05_abstract_and_interface.tutorial.animal_and_interface.animal;

import s05_abstract_and_interface.tutorial.animal_and_interface.ediable.Ediable;

public class Chicken extends Animal implements Ediable {

  @Override
  public String makeSound() {
    return "Chicken: cluck-cluck!";
  }

  @Override
  public String howToEat() {
    return "could be fried";
  }

}
