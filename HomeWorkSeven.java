/**
 * Java 1.Home Work #7
 *
 * @author Ivan
 * @version 04.03.2022
 */
class HomeWorkSeven {   
    public static void main(String[] args) {
        Cat[] cats = { new Cat("Glutton", 10), new Cat("Slim", 8)};
        Plate plate = new Plate(20, 20);
        System.out.println(plate);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }
        
        System.out.println(plate);
        plate.add(13);
        System.out.println(plate);
    
        for (Cat cat : cats) {
            cat.setfull(false);
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean full;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        full = false;
    }
    
    void setfull(boolean status) {
        full = status;
    }

    void eat(Plate plate) {
        if (!full) {
            full = plate.decreaseFood(appetite);
        }
    }

    @Override
    public String toString() {
        return "name=" + name + ", appetite=" + appetite + ", full=" + full;
    }
}

class Plate {
    private int food;
    private int maxСapacity;

    Plate(int food, int maxСapacity) {
        this.food = food;
        this.maxСapacity = maxСapacity;
    }
    
    boolean decreaseFood(int portion) {
        if (food < portion) {
            return false;
        }
        food -= portion;
        return true;
    }


    void add(int food) {
        if (this.food + food <= maxСapacity) {
            this.food += food;
        }
    }

    @Override
    public String toString() {
        return "Plate: " + food;
    }
}
