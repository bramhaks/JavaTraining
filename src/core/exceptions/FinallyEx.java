package core.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FinallyEx {

	public static void main(String[] args) {	
		FileReader fr = null;
		try {
			int ch = 0;
			fr = new FileReader("/Users/sandhyakanaparthi/git/JavaTraining/src/core/exceptions/ExceptionEx1.java");
			while((ch = fr.read()) != -1){
				System.out.print((char)ch);
			}
			
		}catch (FileNotFoundException e) {
			System.out.println("File not found, so innore reading content of the file.");
		}catch(IOException e){
			System.out.println(e.getMessage());
		}finally{
			try {
				if(fr != null){
					fr.close();
				}
				System.out.println("reader connection closed.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
