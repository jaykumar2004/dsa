public class inheritance {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();

        Dog doggy = new Dog();
        doggy.eat();
        doggy.legs = 4;
        System.out.println(doggy.legs);
    }
}

//Base Class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

//Derived class or sub class
// class Fish extends Animal{ //animal class ki property fish class extend ker rehi he
//     int fins;

//     void swims(){
//         System.out.println("Swims in water");
//     }
// }

class Mammals extends Animal{
    // int legs;
    void walk(){
        System.out.println("Walks");
    }
}

class Fish extends Animal{
    // int legs;
    void swim(){
        System.out.println("Swims");
    }
}

class Bird extends Animal{
    // int legs;
    void fly(){
        System.out.println("fly");
    }
}


// class Dog extends Mammals{
//     String breed;   
// }