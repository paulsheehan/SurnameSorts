package arraylistSort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListController {	//This class contains methods to manipulate our string ArrayList

	public void fillArray(ArrayList<String> names) throws FileNotFoundException
	{
		FileReader filereader = new FileReader("surnames");
		BufferedReader br = new BufferedReader(filereader);
		String line = null;
		
		try {
			while((line = br.readLine()) != null)
			{
				names.add(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<String> jumbleList(ArrayList<String> names)
	{
		Collections.shuffle(names);
		return names;
	}
	
	public ArrayList<String> bubbleSortList(ArrayList<String> names)	//Bubble sort names alphabetically
	{
		boolean sorted = false;
		String temp = null;
		
		while(!sorted)
		{
			sorted = true;
			for(int i = 1; i < names.size(); i++)
			{
				if (names.get(i-1).compareToIgnoreCase(names.get(i)) > 0)
				{
					sorted = false;
					temp = names.get(i-1);
					names.set(i-1, names.get(i));
					names.set(i, temp);
				}
			}
		}
		return names;
	}
}