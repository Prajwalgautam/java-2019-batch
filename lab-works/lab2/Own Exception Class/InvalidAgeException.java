public class InvalidAgeException extends Exception
{
    private double value;

    public InvalidAgeException(double value, String message)
    {
        super(message);
        this.value = value;
        if(value < 1 || value > 100){
            message = "Age is not to be lessthan 1 nor exceeds 100";
        }
    }
}
