package qait.task.gitautomate;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;

import org.omg.SendingContext.RunTime;

public class ExecuteShellCommand {
	
	public static void push(String Link,String Directory,String Repository) throws IOException, InterruptedException {
		 Process pi = Runtime.getRuntime().exec("chmod +x /home/jaspalchandramola/Desktop/pit.sh");
		 pi.destroy();		
		  Process p = new ProcessBuilder("/home/jaspalchandramola/Desktop/pit.sh",Link,Directory,Repository).start();
	        int rc = p.waitFor();
	        System.out.printf("Script executed with exit code %d\n", rc);
	       


	   
	  
	}

	
	
	
	
	

}
