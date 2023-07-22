/*
Removing Duplicates from ArrayList

Write a Java program that takes a list of integers as input from the user and removes 
any duplicate elements from the list. After removing duplicates, print the updated list.
*/


/*
Self-Evaluation:

- I used a try-catch block to effectively handle exceptions that may occur due to invalid input.
- I added a count variable to prompt the user for the number of values they want to add, and I display a message indicating the current count when accepting user input, making it clearer and more user-friendly.
- The removeDuplicates() doesn't directly print the values, providing flexibility for the user to handle the unique values.

*/

package DSA;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDuplicateRemover {
  public static void main(String[] args) {

    ArrayList < Integer > arr = new ArrayList < Integer > ();
    Scanner scan = new Scanner(System.in);
    int size = 0, input = 0;
    
    System.out.println("How many values do you want to add?");
    int count = 1;
    try {

      size = scan.nextInt();
      System.out.println("Let's add values now: ");
      while (arr.size() < size) {
    	
    	System.out.printf("Number %d: ", count);
        input = scan.nextInt();
        arr.add(input);
        count++;
        
      }

    } catch (Exception e) {
      System.out.println("Input value is required");
    }
    System.out.println(removeDuplicates(arr));

  }
  public static ArrayList<Integer> removeDuplicates(ArrayList < Integer > arr) {
    ArrayList < Integer > uniqueValues = new ArrayList < Integer > ();
    for (int unique: arr) {
      if (!uniqueValues.contains(unique)) {
        uniqueValues.add(unique);
      }
    }
    return uniqueValues;
  }

}
