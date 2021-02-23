package AnimalAndEdible.animal;

import AnimalAndEdible.edible.Edible;

public class Chicken extends AnimalAndEdible.animal.Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
