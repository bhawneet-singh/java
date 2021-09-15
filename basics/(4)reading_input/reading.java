import java.util.*;
//thare is a lot of way to read input .
//in this we use Scanner object to read form console.

public class Reading
{
	public static void main(String [] Args)
	{
		//create a scanner object with system.in arg.
		var scn = new Scanner(System.in);
		//read int form console.
		int x = scn.nextInt();
		System.out.println(x);
		//reading double and float follow same role.
		//reading string 
		scn = new Scanner(System.in);
		String str = scn.nextLine();
		System.out.println(str);
	}
}