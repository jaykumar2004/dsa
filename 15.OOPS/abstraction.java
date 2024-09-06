public class abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        System.out.println(h.color);
        System.out.println(c.color);

        Mustang myHorse = new Mustang();
        //Animal -> Horse -> Mustang
    }
}

abstract class Animal{

    String color;
    Animal(){
        System.out.println("animal constructor calls");
        // color = "brown";
    }
    void eat(){ //non abstract method
        System.out.println("animal eats");
    }
    
    abstract void walk(); //abstract method
}

//sub classes:
class Horse extends Animal{
    Horse(){
        System.out.println("horse constructor calls");
    }
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color = "yellow";
    }

    void walk(){
        System.out.println("walks on 2 legs");
    }
}

