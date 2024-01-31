package developersKnow;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class IOstreams {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\SSLTP11229\\Desktop\\ramu\\raja\\raja.txt");
		
		boolean present =file.exists();
		
		if(present) {
			System.out.println("file is present");
		}
		
		else {
			System.out.println("nothing");
		}
		
/*		if(present==false) {
//			file.mkdirs();     --> for create new folder
  }
*/	
		
		file.createNewFile();  // --> for new file

		
		// to rename the existing file
		
		File rename = new File("C:\\Users\\SSLTP11229\\Desktop\\ramu\\raja\\rajesh.txt");
		
		boolean renamed= file.renameTo(rename);
		
		System.out.println("renamed success"+renamed);
		
		System.out.println("file name"+file.getName()); // -- to get a file name 
		
		new IOstreams().readFile();
		
	}
	
	public void  readFile() throws IOException {
		
		
		try(FileInputStream file = new FileInputStream("C:\\Users\\SSLTP11229\\Desktop\\ramu\\raja\\rajesh.txt")){
			int read=file.read();
			
			
			while(read !=-1) {
				System.out.print((char)read);
				read=file.read();
			}
		}
		
//		FileReader reader = new FileReader("C:\\Users\\SSLTP11229\\Desktop\\ramu\\raja\\rajesh.txt");
//		
//		int read; 
//		
//		while ((read = reader.read()) != -1)
//            System.out.print((char)read);
//		
//		reader.close();
	}

}
