import java.util.*;
//all the other than the primitive type are the reference type.
//String and date are some example of ref. type in java.

public class ReferenceTypes
{
	public static void main(String [] Args)
	{
		// refernce type are the class's object in java .
		// string in jurnal is an array of char.
		// we have a short hand syntex double quote in many language for string .
		// in java string is a reference type and created by creating instance of String class.

		String name = new String ("hello ,world!");
		System.out.println(name);

		//other example
		//we have to import data class first.
		Date date = new Date();
		System.out.println(date);

		//java provide a shorthand syntex for create String instance .
		String name_two = "hello , begginer!";
		System.out.println(name_two);

		//a short hand way to create ref. type is
		var Date_new = new Date();	
	}
}