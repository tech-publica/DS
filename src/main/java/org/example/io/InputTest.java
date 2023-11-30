package org.example.io;

import java.io.*;

public class InputTest {
	public static void main(String[] args) throws IOException {
		int c;

		try {
			
			BufferedReader br = new BufferedReader(
					            new InputStreamReader(
					            new LowerCaseInputStream(new FileInputStream("test.txt"))));		
			
			String line = null;
			while ((line= br.readLine())!= null)
				System.out.println(line);
	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
