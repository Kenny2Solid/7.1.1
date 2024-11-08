class Animal {
    protected String species;

    public Animal() {
        this.species = "Animal";
    }

    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}



class Mammal extends Animal {
    public Mammal() {
        this.species = "Mammal";
    }

    @Override
    public void makeSound() {
        System.out.println("Some mammal sound");
    }
}

class Dog extends Mammal {
    public Dog() {
        this.species = "Dog";
    }

    @Override
    public void makeSound() {
        System.out.println("Woof woof");
    }
}



