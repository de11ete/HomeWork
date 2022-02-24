/**
 * Java 1.Home Work #5
 *
 * @author Ivan
 * @version 24.02.2022
 */
class HomeWorkFive {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
            persArray[0] = new Person("Rusakov Sergey", "Engineer", "rsergey@gmail.com", "89765432100", 30000, 30);
            persArray[1] = new Person("Ribalko Alexey", "Lead Engineer", "ribaser@gmail.com", "89765432100", 35000, 34);
            persArray[2] = new Person("Sherbakov Alexey", "Electrician", "shalex@gmail.com", "89765432100", 30000, 32);
            persArray[3] = new Person("Prihodko Mihail", "Headmaster", "prmiha@gmail.com", "89765432100", 80000, 44);
            persArray[4] = new Person("Piskunov Dmitriy", "Accountant", "psdmitriy@gmail.com", "89765432100", 30000, 36);
        for (Person Person : persArray)
            if (Person.getAge() > 40)
            System.out.println(Person);
    }
}
 
class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;
    
    public Person(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age;
    }
}
