package package24;

import java.util.ArrayList;

public class LAB24 {
	public static void main(String[] args) {
		
		Queue<String> q = new Queue<>();
		
		q.add("X");
		q.add("Y");
		q.add("Z");
		
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());


		
	}
	
	
}
 class Queue<T>{
	private ArrayList<T> LIST = new ArrayList<>();
	
	
	
	public void add(T item) {
		LIST.add(item);
	}
	public T remove() {
		
		if(!(LIST.isEmpty())) {
			T ITEM = LIST.get(0);
			LIST.remove(0);
			return ITEM;
		}else {
			return null;
		}
	}
	@Override
	public String toString() {
		return LIST.toString();
	}
}

