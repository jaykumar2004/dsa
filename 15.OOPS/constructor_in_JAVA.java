public class constructor_in_JAVA {
    public static void main(String[] args) {
        // Student s1 = new Student("Jay Kumar");
        Student s1 = new Student();
        // System.out.println(s1.name);
    }
}
class Student{
    String name;
    int roll;


    Student(){ //this is a constructor, in the parematers we want to write String name to print the name
        System.out.println("constructor is called");
    }
}
