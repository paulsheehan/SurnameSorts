package arraylistSort;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args)
	{
		ArrayListController c = new ArrayListController();		//Our controller class
		
		ArrayList<String> names = new ArrayList<String>(160);	//Declare ArrayList with predefined size. 160 names in textfile
		
		try {
			c.fillArray(names);									//Fill the ArrayList with surnames
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		c.jumbleList(names);	//Shuffle the surnames
		
		System.out.println(names);
		System.out.println("\n");
		c.bubbleSortList(names);
		
		System.out.println(names);
	}
	
}
