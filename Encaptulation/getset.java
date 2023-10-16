package Encaptulation;

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid Age");
        }
    }
}

class getset {
    public static void main(String[] args) {
        // Person obj
        Person person = new Person();

        // setter method
        person.setName("Dharmi");
        person.setAge(19);

        // getter method
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
