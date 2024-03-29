package demo;

import java.io.IOException;

public class Hello {

	public static void main(String[] args) {
		 String pythonScriptPath = "C:\\Users\\SSLTP11229\\PycharmProjects\\pythonProject\\NewPackage\\java.py";

	        // Build the command to run the Python script
	        String[] command = {"python", pythonScriptPath};

	        try {
	            // Start the process
	            ProcessBuilder processBuilder = new ProcessBuilder(command);
	            Process process = processBuilder.start();

	            // Wait for the process to complete (optional)
	            int exitCode = process.waitFor();
	            System.out.println("Python script exited with code: " + exitCode);

	            // Optionally, you can read the output of the Python script
	            // InputStream inputStream = process.getInputStream();
	            // BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
	            // String line;
	            // while ((line = reader.readLine()) != null) {
	            //     System.out.println(line);
	            // }
	            

		        PythonInterpreter interpreter = new PythonInterpreter();
		        interpreter.exec("pythonVariable = 'Hello from Python via Jython!'");
		        String pythonVariableValue = (String) interpreter.get("pythonVariable");
		        System.out.println("Python variable value: " + pythonVariableValue);

	        } catch (IOException | InterruptedException e) {
	            e.printStackTrace();
	        }
	}

}
