/**
 * Custom exception for when an inputed value does not fall within the parameters needed
 */

public class myCustomException extends Exception{
    public myCustomException(String message){
        super(message);
    }
}
