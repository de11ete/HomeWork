/**
 * Java 1.Home Work #6
 *
 * @author Ivan
 * @version 01.03.2022
 */
class HomeWorkSix {   
    public static void main(String[] args) {
        Cat cat = new Cat(200);
        Dog dog = new Dog(500, 10);
        
        IAnimal[] animals = {cat, dog};
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(180));
            System.out.println(animal.swim(15));
        }
    }
}

class Dog extends Animal {
    Dog(int runLimit, int swimLimit) {
        super(runLimit, swimLimit);
    }
}

class Cat extends Animal {
    Cat(int runLimit) {
        super(runLimit, 0);
    }
    
    @Override
    public String swim(int distance) {
        return getClassName() + "cats don't swim ";
    }
}

abstract class Animal implements IAnimal {
    protected int runLimit;
    protected int swimLimit;
    protected String className;
    
    Animal(int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        className = getClass().getSimpleName();
    }
    
    public String getClassName() {
        return className;
    }
    
    @Override
    public String swim(int distance) {
        if (distance > swimLimit) {
            return className + " won't swim " + distance;
        } else {
            return className + " will be able to swim " + distance;
        }
    }
    
    @Override
    public String run(int distance) {
        if (distance > runLimit) {
            return className + " won't run " + distance;
        } else {
            return className + " will be able to run " + distance;
        }
    }
    
    @Override
    public String toString() {
        return className + ": runLimit: " + runLimit + "; swimLimit: " + swimLimit;
    }
}

interface IAnimal {
    String run(int distance);
    String swim(int distance);
}
