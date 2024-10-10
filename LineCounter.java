package Tutorial12;
import java.io.*;
public class LineCounter {
	public static void main(String[] args) { 
		  try 
		  { 
		   FileInputStream fin=new FileInputStream("Line.txt"); 
		   BufferedReader br=new BufferedReader(new InputStreamReader(fin)); 
		   String line; 
		   int lineno=0; 
		   while((line=br.readLine())!=null) 
		   { 
			   	System.out.println(line); 
		    	lineno++; 
		   } 
		  System.out.println("Number of lines:"+lineno);
		  br.close();
		  }   
		  catch(Exception e) 
		  { 
			  System.out.println("Exception:"+e.getMessage()); 
		  } 
	 } 
		 
}


