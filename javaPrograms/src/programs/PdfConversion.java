package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PdfConversion {
	
	
	public static void main(String[] args) {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("python", "C:\\Users\\SSLTP11229\\PycharmProjects\\pythonProject\\NewPackage\\deepan.py");
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            int exitCode = process.waitFor();
            System.out.println("Python script exited with code " + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
