public class oops_intro {
    public static void main(String[] args) {
        // Creating an object of the class
        Pen p1 = new Pen(); //created a pen object called p1
        p1.setColor("Blue");
        System.out.println("Pen Color is: " + p1.color);
        p1.setTip(5);
        System.out.println("pen tip is: " + p1.tip);
        p1.color = "Yellow";
        System.out.println("New Color: " + p1.color);


        Student s1 = new Student();
        s1.calPercentage(90, 70, 90);
        System.out.println("Percentage: " + s1.percentage);

    }
}

class BankAccount{
}

class Pen{
    //property + functions
    String color;
    int tip;

    void setColor(String newcolor){
        color = newcolor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage; //cgpa

    void calPercentage(int phy, int math, int chem){
        percentage = (phy+chem+math) / 3;
    }
}
