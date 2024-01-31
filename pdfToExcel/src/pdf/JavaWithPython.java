package pdf;

import java.io.IOException;

public class JavaWithPython {
	
	 public static void main(String[] args) {
	        // Replace "path/to/your/script.py" with the actual path to your Python script
	        String pythonScriptPath = "    C:\\Users\\SSLTP11229\\PycharmProjects\\pythonProject\\NewPackage\\java.py";

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

	        } catch (IOException | InterruptedException e) {
	            e.printStackTrace();
	        }
	        
//	        PythonInterpreter interpreter = new PythonInterpreter();
//	        interpreter.exec("pythonVariable = 'Hello from Python via Jython!'");
//	        String pythonVariableValue = (String) interpreter.get("pythonVariable");
//	        System.out.println("Python variable value: " + pythonVariableValue);
	    }

}