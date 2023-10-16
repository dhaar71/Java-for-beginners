

import static_keyword.human;

public class static_demo {
    public static void main(String args[]){
        human h1=new human(12,"dharmi", 900000);
        human h2=new human(15,"abc",10000);
        human h3= new human(18,"xyz",90878);
        System.out.println(human.population);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
    }

    
}
