class Person {
    String name;
    Person(String name) {
        this.name = name;
    }

    void changeName(String newName) {
        name = newName;
    }

    @Override
    public String toString() {
        return "Person [Name: " + name + "]";
    }
}

public class MethodVariationExample {
    public static void modifyValue(int value) {
        value = 20; 
    }

    public static void modifyObjectReference(Person person) {
        person.changeName("Alice"); 
    }

    public static int returnModifiedValue(int value) {
        return value * 2;
    }

    public static Person createNewPerson(String name) {
        return new Person(name);
    }

    public static void main(String[] args) {
        int x = 10;
        System.out.println("Original value of x: " + x);
        modifyValue(x);
        System.out.println("Value of x after modifyValue: " + x);

        Person person = new Person("Bob");
        System.out.println("Original person: " + person);
        modifyObjectReference(person);
        System.out.println("Person after modifyObjectReference: " + person);

        int y = 5;
        int result = returnModifiedValue(y);
        System.out.println("Original value of y: " + y);
        System.out.println("Result of returnModifiedValue: " + result);

        Person newPerson = createNewPerson("Charlie");
        System.out.println("New person created: " + newPerson);
    }
}

