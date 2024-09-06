public class method_overriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

class Animal{  //parent class
    void eat(){
        System.out.println("eats anything");
    }
}

class Deer{ //child class
    void eat(){
        System.out.println("eats grass");
    }
}