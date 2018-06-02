public class ExceptionB extends ExceptionA
{
public ExceptionB()
{
// empty Constructor
}
public ExceptionB( final String exceptionMessage )
{
super( exceptionMessage );
}	
public void test() throws ExceptionB
{
throw new ExceptionB( "An Exception of type 'ExceptionB' has been thrown Because 2nd Number is 0" );
}
} 