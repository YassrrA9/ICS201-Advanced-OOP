package package09;

import java.util.*;
import java.io.*;

public class TestClass {
	public static void main(String[] args) throws FileNotFoundException {

		File Input = new File("times.txt");

		if (Input.exists()) {
			Scanner FileInput = new Scanner(Input);
			File Output = new File("result.txt");
			PrintWriter pwritter = new PrintWriter(Output);
			int numberOFlines = 0;
			pwritter.println("#\t  24-hour\t  12-hour");
			pwritter.println("-----------------------------------\n");

			while (FileInput.hasNextLine()) {
				numberOFlines++;
				String Original = FileInput.nextLine();

				try {

					if ((Original.contains(":") && (Original.length() == 5))) {
						int hours = Integer.parseInt(Original.substring(0, 2));
						int min = Integer.parseInt(Original.substring(3, 5));

						String TimeMood;
						if (hours >= 12) {
							TimeMood = "PM";
						} else {
							TimeMood = "AM";
						}

						if ((hours >= 00) && (hours < 24) && (min >= 00) && (min < 60)) {
							if (hours == 00) {
								hours = 12;
								pwritter.printf("%d  \t  %s  \t  %d:%02d %s\n", numberOFlines, Original, hours, min,
										TimeMood);
							} else if (hours > 12) {
								hours = hours - 12;
								pwritter.printf("%d  \t  %s  \t  %d:%02d %s\n", numberOFlines, Original, hours, min,
										TimeMood);
							} else if ((hours > 00) && (hours <= 12)) {
								pwritter.printf("%d  \t  %s  \t  %d:%02d %s\n", numberOFlines, Original, hours, min,
										TimeMood);
							} else {
								throw new TimeException();
							}
						} else {
							throw new TimeException();
						}
					} else {
						throw new TimeException();
					}
				} catch (TimeException x) {
					pwritter.printf("%d  \t  %s  \t  %s \n", numberOFlines, Original, x.getMessage());
				}

			}
			FileInput.close();
			pwritter.close();
		}else {
			System.out.println("File Not Found");
		}

	}
}
