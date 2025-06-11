//non-parametrized and parametrized constructor

public class types_of_constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Jay Kumar");
        Student s3 = new Student(123);
    }
}

class Student{
    String name;
    int roll;


    Student(){ //this is a non parametrized constructor, in which we didnt take any parameter
        System.out.println("constructor is called");
    }

    Student(String name){ //this is a parametrized constructor
        this.name = name;
    }

    Student(int roll){
        this.roll = roll;
    }
}
