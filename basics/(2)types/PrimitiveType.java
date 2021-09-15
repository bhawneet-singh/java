//we have two main type of variable in java.
// primitive and reference(no-primitive).
// primitive are used for storing simple values and references are used for storing complex object.
// primitive -> for Integers (byte(8bit),short(16bit),int(32bit),long(64bit)).
// primitive -> for floating point no.(float(32bit),double(64bit))
// primitive -> for boolean (true ,false ) one bit each.
// primitive -> for char (8bit)

// all the objects are refrence type .
// some commonly used ref. type are String ,Date etc.

public class PrimitiveType 
{
	public static void main(String [] Args)
	{
		//syntex for creating variable in java ( type <variable_name> )
		// primitive integer
		// uncomment and compile to see error.

		byte a = 127; // range [-126 : 127].
		
		// byte test = 128;  
		
		short b = 32000; // range [-32k : 32k].
		
		// short test = 33000; 
		
		int c = 10; // range [-2B : 2B].
		
		// int test = -3_000_000_000;

		long e = 10L; // range [].

		// primitive char

		char f = 'a';
		// primitive floating points.

		float a = 234.34F;
		double b = 1234234.34D;

		// primitive boolean 
		boolean isTrue  =  true; 
	}
}