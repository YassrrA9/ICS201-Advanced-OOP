package package06;
import java.util.*;
import java.io.*;

public class IDS {
			public static void main(String[] args) throws FileNotFoundException{
			
			ArrayList<String> Ids = new ArrayList<>();
			String id;
			FileInputStream input = new FileInputStream("IDsWithDuplicates.txt");
			Scanner read = new Scanner(input);
			FileOutputStream output = new FileOutputStream("IDsWithoutDuplicates.txt");
			PrintWriter print = new PrintWriter(output);
			
			while(read.hasNext()) {
				id = read.next();
				if(!(Ids.contains(id))) {
					Ids.add(id);
					
				}
			}
			
			
			for(int i=0; i<Ids.size(); i++) {
				print.println(Ids.get(i));
			}
			read.close();
			print.close();
		}

	
}
