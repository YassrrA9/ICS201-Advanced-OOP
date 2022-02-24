package package25;

import java.io.*;
import java.util.Random;

public class File {
	public static void main(String[] args) throws IOException {
		File Filetxt = new File("Lab25.txt");
		PrintWriter pwriter = new PrintWriter(Filetxt);
		FileOutputStream Filedata = new FileOutputStream("Lab25.dat");
		DataOutputStream Dwriter = new DataOutputStream(Filedata);
		Random k = new Random();
		for(int i=0; i<100; i++) {
			int h = k.nextInt();
			pwriter.println(h);
			Dwriter.writeInt(h);
		}
		pwriter.close();
		Dwriter.close();
		
		System.out.println(Filetxt.length());
	
	
	
	}

}
