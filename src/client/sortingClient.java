package client;

import java.util.ArrayList;

import sortingStrategy.*;
public class sortingClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> numbers=new ArrayList<Integer>(); 
		 numbers.add(5);
		 numbers.add(3);
		 numbers.add(4);
		 numbers.add(2);
		 numbers.add(1);
		 
		 System.out.println(numbers);
		 System.out.println("\n");
		 
		 sortStrategy ss = new bubbleSort();
		 
		 ss.sortList(numbers);
		 
		 System.out.println(numbers);
		 System.out.println("\n");
		 
		 
		 ArrayList<Integer> numbers2=new ArrayList<Integer>(); 
		 numbers2.add(5);
		 numbers2.add(3);
		 numbers2.add(4);
		 numbers2.add(2);
		 numbers2.add(1);
		 
		 System.out.println(numbers2);
		 System.out.println("\n");
		 
		 sortStrategy ss2 = new insertionSort();
		 
		 ss2.sortList(numbers2);
		 
		 System.out.println(numbers2);
		 System.out.println("\n");
		 

	}

}
