package package23;

import java.io.File;
import java.util.Scanner; 

public class Lab23 {
  public static void main(String[] args) {
	  
	  
	Scanner kb = new Scanner(System.in);
    System.out.print("Enter a directory of a file: ");    
    String directory = kb.nextLine();
    
    File f = new File(directory);
    int numberOfFiles = countFiles(f);
    
    kb.close();
    
    System.out.println(numberOfFiles+ " files exist in "+ f.getName()+".");
  }
  
  public static int countFiles(File f) {
	  
    int NUMBER = 0; 

    if (f.isDirectory()) {
    	
      File[] FILES = f.listFiles(); 
      
      for (int i = 0;  i < FILES.length; i++) {
    	  
    	  NUMBER += countFiles(FILES[i]); 
      }
    }
    else { 
    	NUMBER ++;
    }

    return NUMBER;
  }
}
