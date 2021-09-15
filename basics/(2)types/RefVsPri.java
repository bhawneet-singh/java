import java.awt.*;
// primitive type are stored in spacial regin in memory called stack.
// ref. type var. are stored in regin heap in the memory and the ref.(memory address) is stored in the stack.
public class RefVsPri
{
	public static void main(String [] Args)
	{
		// primitive type stored in memory test.
		int a = 10;
		int b = a;
		a = 20;
		System.out.println(a);
		System.out.println(b);
		// so that changing value of a does not affect the var. b.

		//same test with primitive type.
		// we can't make any difference in String becouse java team make the syntex to work similar to primitive type in string.
		String name = "bhawneet";
		String name_two = name;
		name_two = "some_one_else";
		System.out.println(name);
		System.out.println(name_two);

		//lets test with the other ref. type
		//lets use with the point class in java.awt.*; package
		Point point = new Point(12 , 15);
		Point point2 = point;
		point.x = 1555;
		System.out.println(point);
		System.out.println(point2);

		//clearly see that both are same because
		//one obj created in heap and both the two address the same .
		
	}
}