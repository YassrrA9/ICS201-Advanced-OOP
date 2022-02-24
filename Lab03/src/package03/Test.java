package package03;

public class Test {
	public static void main(String[] args) {
		
		Queue Obj = new Queue();
		
		for(int i=1; i<=20; i++) {
			Obj.enqueue(i);
		}
		while(Obj.empty()!=true) {
			
			for( int i=0; i<Obj.getSize();i++) {
				
				System.out.print(Obj.dequeue()+" ");
				
			}
			
		}
			
	
	
	}

}
