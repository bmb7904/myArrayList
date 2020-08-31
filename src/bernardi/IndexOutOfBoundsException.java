/**
 * Custom class that extends the exception class to return a custom exception 
 * regarding array indices
*/
package bernardi;

public class IndexOutOfBoundsException extends Exception
{
    public IndexOutOfBoundsException(String s)
    {
        super(s);
    }
           

}
