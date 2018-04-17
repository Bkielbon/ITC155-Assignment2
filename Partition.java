//Bennett Kielbon
//ITC 155
//Assignment2
//Write a method called partition that accepts a list of integers and an integer value E as its parameter,
//and rearranges (partitions) the list so that all the elements with values less than E occur before all 
//elements with values greater than E. The exact order of the elements is unimportant, so long as all elements 
//less than E appear before all elements greater than E.Forexample,for the linked list[15, 1, 6, 12, –3, 4, 8, 21, 2, 30, –1, 9],
//one acceptable ordering of the list after a call of partition(list, 5) would be [–1, 1, 2, 4, –3, 12, 8, 21, 6, 30, 15, 9].You
//may assume that the list contains no duplicates and does not contain the element value E.

import java.util.*;

public class Partition {
	
	public static void main(String[] args) {
		
		//set the integer value E at 5
		int E = 5;
				
		//Create Linked List and add the Integers
		List<Integer>mainList= new LinkedList<Integer> ();
		mainList.add(15);
		mainList.add(1);
		mainList.add(6);
		mainList.add(12);
		mainList.add(-3);
		mainList.add(4);
		mainList.add(8);
		mainList.add(21);
		mainList.add(2);
		mainList.add(30);
		mainList.add(-1);
		mainList.add(9);
			
			
		//call the partition method that takes in the main list and the value of E partitions list, then print it 
		
		List<Integer>P=partition(mainList,E);
		
		System.out.println(P);
	}
	
	
	
	
	//method for partitioning list 
	private static List<Integer> partition (List<Integer> mainList, int E){
		
		//make a new linked list that the numbers will be sorted into
		List<Integer>partitionedList = new LinkedList<Integer>();
		
		//first put it all the numbers lower than E
		for(Integer num:mainList)
			if(num < E)
				partitionedList.add(num);
		
		//Then add all the numbers greater than E
		for(Integer num:mainList)
			if(num > E)
				partitionedList.add(num);
		
		//return the 
		return partitionedList;
		
		
		
		
	}
	
	
}
	
	
	


