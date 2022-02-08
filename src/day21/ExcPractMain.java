package day21;

import java.util.logging.Logger;

public class ExcPractMain {
    public static void main(String[] args) {
        ExcPract myImage = new ExcPract();

        try {
            myImage.ImageTaker();
        } catch (RuntimeException e) {
            Logger.getGlobal().info("Oops !!!!");
            //       e.printStackTrace();
        }
    }
}

