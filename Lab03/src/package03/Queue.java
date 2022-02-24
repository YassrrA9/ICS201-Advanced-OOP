package package03;

class Queue {
	
	private int[] elements;
	private int size;
	private final int DEVAULT_CAPACITY = 8;
	
	public Queue() {
		this.elements = new int[DEVAULT_CAPACITY];
	}
	public void enqueue(int v) {
		
		if(size>=elements.length) {
			int[] array = new int[elements.length];
			System.arraycopy(elements, 0, array, 0, elements.length);
			elements = new int[array.length*2];
			for(int i=0; i< array.length;i++) {
				elements[i]= array[i];
			}
		}
	
		elements[size] = v;
		size++;
	}
	
	public int dequeue() {
		int first = elements[0];
		for(int i=0; i< size;i++) {
			elements[i]= elements[i+1];
		}
		size--;
		return first;
	}
	public boolean empty() {
		if(size<=0) {
			return true;
		}else {
			return false;
		}
	}
	
	public int getSize() {
		return this.size;
	}
	}

