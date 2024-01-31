package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExceptionDemo {

	public static void main(String[] args) throws FileNotFoundException {

		ExceptionDemo.checkedException();
		ExceptionDemo.readFile();

	}
	
	
	// without throws
	
	public static void checkedException() {
		String path ="the path does not exist";
		
		File file = new File(path);
		
		try {
			FileInputStream stream = new FileInputStream(file);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	//with throws keyword
	
//	public void checkedExceptionWithThrowsKeyword() throws FileNotFoundException {
//		
//		String path ="";
//		File file = new File(path);
//		
//		try {
//			FileInputStream stream = new FileInputStream(file);
//		}catch(FileNotFoundException e) {
//			throw new processingException("error opening file");
//		}
//	}
	
	public static void readFile() throws FileNotFoundException {
        String fileName = "file does not exist";
        File file = new File(fileName);
        FileInputStream stream = new FileInputStream(file);
    }

}
