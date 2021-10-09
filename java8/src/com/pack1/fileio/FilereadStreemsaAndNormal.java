package com.pack1.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.Buffer;

public class FilereadStreemsaAndNormal {

	public static void main(String[] args){
	
		File file = new File("C:\\Users\\Dell\\Desktop\\Source.text1.txt");
		  
	        try (BufferedReader br = new BufferedReader(new FileReader(file)))
	        {
	            String line;
	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}  
	}

}
