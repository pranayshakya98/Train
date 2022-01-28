package day15;

import java.security.KeyStore;
import java.util.logging.Logger;
public class ObjectCLassTest {

    public static void main(String[] args) {
        Dayfifteen dayfifteen = new Dayfifteen("Vivek" ,12, 2);
        Dayfifteen stu1= new Dayfifteen("Vivek", 13,2);
        Logger.getGlobal().info(dayfifteen.toString());
        Logger.getGlobal().info(stu1.toString());

        boolean ap= dayfifteen.equals(stu1);
        if (ap){
            Logger.getGlobal().info("Get Ready ");
        }
        else {
            Logger.getGlobal().info("Not same");
        }
    }

}
