package arraylistSort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Array {

	private ArrayList<String> names;
	
	Array()
	{
		names = new ArrayList<String>(200);
		try {
			fillArray();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fillArray() throws FileNotFoundException
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
}
