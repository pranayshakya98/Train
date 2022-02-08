package day15;

public class gette {
    private String name;
    private String roll;

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        gette Pranay = new gette();
        Pranay.setName("Shakya");
        System.out.println(Pranay.getName());
    }
}


