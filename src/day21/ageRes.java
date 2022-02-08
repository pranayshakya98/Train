package day21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ageRes {

    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner abc = new Scanner(System.in);

//        int x=-2;
//        assert x>=0;
        try {
            int age = abc.nextInt();
            if (age<18){
                throw new ageRestrictionException("Small age");
            }
        }catch(InputMismatchException e){
            e.printStackTrace();
        }catch(ageRestrictionException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
