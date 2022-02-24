package package11;
import java.lang.*;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		Octagon Oct1 = new Octagon(5);
		System.out.println(Oct1);
		Octagon OctCopy = (Octagon)Oct1.clone();
		String checking;
		if((Oct1.compareTo(OctCopy)==1)) {
			checking = "Octagon and its clone are equal";
		}else {
			checking = "Octagon and its clone are Not equal";

		}
		System.out.println(checking);
	}

}
