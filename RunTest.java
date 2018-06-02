import java.util.Scanner; 
public class RunTest
{	
public static void main( String [] args )
{
ExceptionB b = new ExceptionB();
ExceptionC c = new ExceptionC();
Scanner scan = new Scanner(System.in);
System.out.println("If first value you enter 0 then Exception C will occur and will catch throw Exception A Class. ");
System.out.println("If second value you enter 0 then Exception B will occur and will catch throw Exception A Class. ");
int first , second;
System.out.println("Enter First Value: ");
first = scan.nextInt();
System.out.println("Enter Second Value: ");
second = scan.nextInt();
if (second == 0)
{
try
{


b.test();
}	

catch( ExceptionA e )	
{
e.printStackTrace( System.err );
} 
}
if (first == 0)
{
try
{


c.test();	
} 
catch( ExceptionA e ) 
{
e.printStackTrace( System.err );
}
} 
} 
} 