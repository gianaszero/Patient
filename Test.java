import java.util.Scanner;
class Test {
	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("How many times dou want to input: ");
		int input = sc.nextInt();

		SelectionSortObject so = new SelectionSortObject(input);
		//BubbleSortObject so = new BubbleSortObject(input);
		//InsertionSortObject so = new InsertionSortObject(input);
		
		String fname,lname,address;
		int age;

		for(int i = 1;i <= input;i++) {

			System.out.print("Enter Firstname:");
		 	fname = sc.next();
		 	System.out.println();

			System.out.print("Enter Lastname:");
			lname = sc.next();
			System.out.println();

			System.out.print("Enter Age:");
			age = sc.nextInt();
			System.out.println();

			System.out.print("Enter Address:");
			address = sc.next();
			System.out.println();

			so.insert(fname, lname, age, address);
			System.out.println();
			System.out.println();
		}

		System.out.println("\n\n\n\n\n");
		System.out.println("****************************");
		System.out.println("*\tSelection Sort\t   *");
		System.out.println("****************************\n");
		System.out.println();

		System.out.println("Original position of Patient:\n");
		System.out.println("*******************************************\n");
		so.displayAllObj();
		System.out.println("*******************************************\n");
		System.out.println();

		System.out.println("Ascending order of the age of Patient:\n");
		System.out.println("*******************************************\n");
		so.sort();
		so.displayAllObj();
		System.out.println("*******************************************\n");
		System.out.println();

		System.out.println("Descending order of the age of Patient:\n");
		System.out.println("*******************************************\n");
		so.revsort();
		so.displayAllObj();
		System.out.println("*******************************************\n");
		System.out.println();
	}
}