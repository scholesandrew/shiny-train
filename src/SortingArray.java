import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Would you like to sort ints?");
		String Answer = scan.nextLine();
		while(Answer.equals("Yes")) {

			System.out.println("enter number of ints");

			int n = scan.nextInt();

			int[] array=new int[n];

			System.out.println("enter ints");

			for(int i=0;i<n;i++){
				array[i] = scan.nextInt();
			}
			System.out.println("Organizing...");
			
			sortThing(array);
			
			System.out.println("Would you like to sort ints?");
			scan.nextLine();
			Answer = scan.nextLine();
		}
	}
	public static void sortThing(int[] array) {
		for(int i = 0; i < array.length; i++) {
			int min = array[i];
			int minVal = i;
			for (int j = i + 1; j < array.length; j++) {
				if(array[j] < min) {
					min = array[j];
					minVal = j;
				}
			}
			int temp = array[i];
			array[i] = min;
			array[minVal] = temp;
		}
		for(int i: array) {
			System.out.println(i);
		}
	}
}