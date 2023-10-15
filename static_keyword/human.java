package static_keyword;

public class human {
    int age;
    String name;
    int salary;
    public static long population;

    public human(int age, String name, int salary){
        this.age=age;
        this.name=name;
        this.salary=salary;
        human.population+=1;
    }
    
}
