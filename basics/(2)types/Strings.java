//string is a ref. type in java.
//String can be created with String class.
//String class defines many other mathad too.

public class Strings
{
	public static void main(String [] Args)
	{
		// String compare 
		String name = "bhawneet";
		String name_two = "any_one_else";

		//we can't compare string with '==' in older version .
		//String.equals mathod
		System.out.println(name.equals(name_two));
		
		//return false
		//String indexof
		System.out.println(name.indexOf("a"));
		//return 2

		//String replace
		System.out.println(name.replace("bhaw","nav"));
		// return navneet

		//String startsWith and endsWith
		System.out.println(name.startsWith("b"));
		//return true

		//control char. in syntex
		System.out.println("bhawneet\"singh Nigaltiya\"");

		// we have bounch of other mathod too like toUpperCase etc,.
	}
}