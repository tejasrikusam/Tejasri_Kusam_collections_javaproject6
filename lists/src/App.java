package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App 
{
	public static void main(String[] args) { 
		List<Integer> numbers = new ArrayList<Integer>(); 
		numbers.add(1);
		numbers.add(2);
		numbers.add(3); 
		numbers.add(5);
		numbers.add(11);
		numbers.add(22);
		numbers.add(21);
		numbers.add(33);
		numbers.add(50);
		numbers.add(40);
		Scanner s=new Scanner(System.in);
		int position;
		System.out.println("List contains : " + numbers); // Calling remove(index) 
		numbers.remove(1); //removing object at index 1 i.e. 2nd Object
		numbers.remove(new Integer(3)); 
		System.out.println("After modification,List contains:"+numbers);
		System.out.println("Enter position of element to retrive ");
		position=s.nextInt();
		System.out.println("Element at "+position+" position "+numbers.get(position));//getting  elements with index or Fetching
		for(Object element : numbers) {
		    System.out.print(element+" ");
		}
		}

	
}
