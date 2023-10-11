package Classes_and_objects;
public class Example1 {
    public static class Student {
        int rollnumber;
        String name;
        float marks;
    }

    public static void main(String[] args) {
        // Creating object
        Student s1 = new Student();
        s1.rollnumber = 281;
        s1.name = "Dharmi";
        s1.marks = 90f;
        
        // Print the student's information
        System.out.println("Roll Number: " + s1.rollnumber);
        System.out.println("Name: " + s1.name);
        System.out.println("Marks: " + s1.marks);
    }
}
