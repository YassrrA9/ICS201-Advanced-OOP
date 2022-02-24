package package08;
import java.util.*;
import java.io.*;

public class Lab08 {
	public static void main(String[] args) throws FileNotFoundException{
		 
		
		File input = new File("Names.txt");

         String Firstname=null;
         String Lastname = null;
         if(input.exists()) {
        	 Scanner fileinput = new Scanner(input);
             File output = new File("NamesOutput.txt");
             PrintWriter pwritter = new PrintWriter(output);
         
         while(fileinput.hasNextLine()) {
        	 
        	 if(fileinput.hasNext()) {
        		 Firstname = fileinput.next(); 
        	 }else {
        		 fileinput.nextLine();
        	 }
        	 if(fileinput.hasNext()) {
        		 Lastname = fileinput.next(); 
        	 }else {
        		 fileinput.nextLine();
        	 }
        	 
        	 pwritter.println(Firstname+" "+Lastname);
         }
         fileinput.close();
         pwritter.close();
         }else {
        	 System.out.println("No such that FILE !");
         }
         

		
	}

}
