public class static_keyword {
    public static void main(String[] args) {
        // Static keyword in Java
        Student s1 = new Student();
        s1.schoolname = "JMV";
        Student s2 = new Student();
        System.out.println(s2.schoolname);
    }
}

class Student{
    //static function
    static int returnPercentage(int math, int phy, int chem){
        return (math + phy + chem) /3;
    }

    //Ststic properties
    String name;
    int rollno;

    static String schoolname;

    void setName(String name){  //setter
        this.name = name;
    }
    String getName(String name){ //getter
        return this.name;
    }
}
