package Errors;

public class OutOfSpaceException extends Throwable{
    public OutOfSpaceException(String errorMessage){
        super(errorMessage);
    }
}
