package day1;

public class Welcome {
    double salary=9;
    public static void main(String[] args) {
        String greet = "Fighting !!!";
        System.out.println(greet);
        for (int i = 0; i < greet.length(); i++) {
            System.out.print("*");
        }
    }


    public double getSalary() {
        return salary;
    }
    

}