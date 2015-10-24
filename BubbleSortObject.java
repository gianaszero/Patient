class BubbleSortObject extends SortObject {
	
	private final int SIZE;

	private int noElem; 
	
	private Patient[] array;

	public BubbleSortObj(int size) { // Constructor
		SIZE = size;
		this.array = new Patient[SIZE];
		noElem = 0;
	}

	public void sort() {
		for (int i = 0; i < super.SIZE - 1; i++) {
			for (int j = 0; j < super.SIZE - (i+1); j++) {
				if ( super.array[j].getAge() > super.array[j+1].getAge() ) {
					swap(j, j+1);
				}
			}
		}
	}

	public void revsort() {
		for (int i = 0; i < super.SIZE - 1; i++) {
			for (int j = 0; j < super.SIZE - (i+1); j++) {
				if ( super.array[j].getAge() < super.array[j+1].getAge() ) {
					swap(j, j+1);
				}
			}
		}
	}
	public void insert(String fname, String lname, int age, String address) {
		 array[noElem] = new Patient(fname, lname, age, address); 

		 noElem++;
	}

	public void swap(int n, int n2) {
		Patient temp = this.array[n];
		this.array[n] = this.array[n2];
		this.array[n2]  = temp;
	}

	public void displayAllObj() {
		for ( int i = 0; i < SIZE; i++ ) {
			this.array[i].displayInfo();
			System.out.println();
		}
	}
}