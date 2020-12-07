public class ExceptionC extends ExceptionB
{
    public ExceptionC(String message)
    {
        super(message);
    }

    public static void getExceptionC() throws ExceptionC
    {
        throw new ExceptionC("Exception C");
    }
}