public abstract class ExceptionA extends Exception
{
public ExceptionA()
{

}
public ExceptionA( final String exceptionMessage )
{
super( exceptionMessage );
}	

public abstract void test() throws ExceptionA;
} 