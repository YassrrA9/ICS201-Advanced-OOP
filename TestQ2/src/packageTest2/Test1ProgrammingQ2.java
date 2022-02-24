package packageTest2;
import java.util.*;

public class Test1ProgrammingQ2 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		list1.add(2);
		list1.add(3);
		list1.add(1);
		list1.add(5);
		list2.add(3);
		list2.add(4);
		list2.add(6);
		System.out.println(union(list1,list2));
	}

	public static ArrayList<Integer> union(ArrayList<Integer> list1 ,ArrayList<Integer> list2 ){
		
		ArrayList<Integer> list3 = new ArrayList<>();
		for(int i=0; i<list1.size();i++) {
			if(!(list3.contains(list1.get(i)))){
				list3.add(list1.get(i));
			}
		}
		for(int i=0; i<list2.size();i++) {
			if(!(list3.contains(list2.get(i)))){
				list3.add(list2.get(i));
			}
		}
		return list3;
	}
}
