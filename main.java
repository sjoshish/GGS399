package ggs399;
import java.io.File;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class main {
	public static void main(String[]args) {
		String fileName = "/Users/sabinayajoshishrestha/Desktop/Gowalla_totalCheckins.txt";
		File file = new File(fileName);
		try {
			Scanner inputStream = new Scanner(file);
			while(inputStream.hasNext()) {
				String data = inputStream.nextLine();
				String[] values = data.split("\t");
				
				Integer users = Integer.parseInt(values[0]);												
				Double lat = Double.parseDouble(values[2]);		
				Double lng = Double.parseDouble(values[3]);
				Integer location = Integer.parseInt(values[4]);
				
				String [] dateNtime = values[1].split("T");		//2010-10-12T15:19:03Z
				
				//Date date1=new SimpleDateFormat("yyyy-mm-dd").parse(dateNtime[0]);  
			    
				  String sDate1= dateNtime[0];  
				    Date date1=new SimpleDateFormat("yyyy-mm-dd").parse(sDate1);  
				    System.out.println(users + " " + date1);  
		
			}
			inputStream.close();   //closing the file 
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			
		
		
	}
	
		

}
