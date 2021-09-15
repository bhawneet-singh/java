// we have lots of arithmatic expression in java
// + -> for addition
// - -> for subtraction
// * -> for multyplaycation
// / -> for divition 
// % -> for get the remaing in divition
public class ArithmaticExpression
{
	public static void main(String [] Args)
	{
		int num_one = 12;
		int num_two = 12;
		System.out.println(num_one + num_two);
		System.out.println(num_one - num_two);
		System.out.println(num_one * num_two);
		System.out.println(num_one / num_two);
		System.out.println(num_one % num_two);
		//order of operation { () -> * / -> + -}
	}
}