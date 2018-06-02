public class ExceptionC extends ExceptionB
{
public ExceptionC()
{

}
public ExceptionC( final String exceptionMessage )
{
super( exceptionMessage );
}	

@Override
public void test() throws ExceptionC
{
throw new ExceptionC( "An Exception of type 'ExceptionC' has been thrown because 1st Number is 0" );
}
}