//in java everything is classes.
//in java we use PASCAL naming convention for class. 
//camalcasing used for variable naming in java.
/**
	basics structure of java programs .
	access-modifier class <class_name>
	{
		access-modifier static return-type main(typeArray arg_name)
		{
			code to be executed 
		}
	}
	
***/

public class HelloWorld
{
	//java code start excuting from main method.
	//if there are too many class in one single file the porgram start excuting form class that have main class.
	//static means the function often called "mathed" belong to this class.
	//a string array can be passed as command line arg. 
	public static void main(String [] args)
	{
		//System class has a field called out and the field have refrenced to println methods.
		//println used to print a string on the screen an jump to next line.
		System.out.println("hello ,world!");
	}

}


