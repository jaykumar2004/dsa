public class getter_setter {
    public static void main(String[] args) {
        Pen p1 = new Pen(); //created a pen object called p1
        p1.setColor("Blue");
        System.out.println("Pen Color is: " + p1.getColor());
        p1.setTip(5);
        System.out.println("pen tip is: " + p1.getTip());
        p1.setColor("Yellow");
        System.out.println("New Color: " + p1.getColor());
    }
}


class Pen{
    //property + functions
    private String color;
    private int tip;

    String getColor(){ //getter
        return this.color;
    }

    int getTip(){ //getter
        return this.tip;
    }

    void setColor(String newcolor){ //setter
        this.color = newcolor;
    }

    void setTip(int tip){ //setter
        this.tip = tip;
    }
}