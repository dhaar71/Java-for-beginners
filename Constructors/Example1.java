package Constructors;

public class Example1 {
    public static class Student {
        int rollnumber;
        String name;
        float marks;

        // Default Constructor
        public Student() {
            rollnumber = 281;
            name = "Dharmi";
            marks = 90.0f;
        }

        // Parameterized Constructor
        public Student(int rollnumber, String name, float marks) {
            this.rollnumber = rollnumber;
            this.name = name;
            this.marks = marks;
        }
    }

    public static void main(String args[]) {
        Student Dhar = new Student();

        // You can access the properties of the created object
        System.out.println("Roll Number: " + Dhar.rollnumber);
        System.out.println("Name: " + Dhar.name);
        System.out.println("Marks: " + Dhar.marks);

        Student s1 = new Student(200, "Alex", 95.0f);
        System.out.println("Roll Number: " + s1.rollnumber);
        System.out.println("Name: " + s1.name);
        System.out.println("Marks: " + s1.marks);
    }
}
