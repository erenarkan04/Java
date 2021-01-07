import java.util.Scanner;
import junit.framework.*;
import org.junit.*;
import static org.junit.Assert.*;

public class inttostring {

	public static void main (String[] args) {

	int a = 243; 
	String b = String.valueOf(a); 
	char c = b.charAt(0); 
	int d = Character.getNumericValue(c);
	
	System.out.println(String.valueOf(a).length()); 
	}
}
