package mySparkProject;
import static spark.Spark.*;

public class HelloWorld {
	
	//default web address http://localhost:4567/hello
	
	public static final String LINE_BREAK = "<br />";
	
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
        get("/helloManyTimes", (req, res) -> doSomething());
    }
    
    public static String doSomething(){
    	String message = "Hello World!";
    	
    	for (int i = 2; i <=10000; ++i)
    	{
    		message += LINE_BREAK + "Hello world again, for the number " + i + " time";
    	}
    	
    	return message;
    }
    
    
}
