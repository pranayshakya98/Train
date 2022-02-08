package day21;

public class ageRestrictionException extends RuntimeException{

    String message;
    public ageRestrictionException(String message){
        super(message);
    }
}
