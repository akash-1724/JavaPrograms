package Tutorial12;

import java.io.*; 
public class ExistsCopy { 
 
 public static void main(String[] args) { 
  String content="Akash Ani\n"; 
  File f1=new File("File1.txt"); 
  File f2=new File("File2.txt"); 
  try 
  { 
   if(f1.exists()) 
   { 
    System.out.println("File1 exists."); 
    FileOutputStream fout=new FileOutputStream(f1); 
    fout.write(content.getBytes()); 
    fout.close(); 
   } 
   else 
   { 
    System.out.println("File1 does not exists"); 
   } 
  } 
  catch(Exception e) 
  { 
   System.out.println("An error occured:"+e.getMessage()); 
  } 
  if(f2.exists()) 
  { 
   System.out.println("File2 exists"); 
   try{ 
	    FileInputStream fin=new FileInputStream(f1); 
	    FileOutputStream fout=new FileOutputStream(f2); 
	    System.out.println("File contents copied from file1 to file2."); 
	    int c; 
	    while((c=fin.read())!=-1) 
	    { 
	     fout.write(c); 
	    } 
	    fin.close(); 
	    fout.close(); 
	    String line; 
	    System.out.println("Contents of File 1 :"); 
	    BufferedReader br1=new BufferedReader(new FileReader(f1)); 
	    while((line=br1.readLine())!=null) 
	    { 
	     System.out.println(line); 
	    } 
	    br1.close(); 
	    System.out.println("Contents of File 2 :"); 
	    BufferedReader br2=new BufferedReader(new FileReader(f2)); 
	    while((line=br2.readLine())!=null) 
	    { 
	     System.out.println(line); 
	    } 
	    br2.close(); 
	     
	   } 
	   catch(Exception e) 
	   { 
	    System.out.println("Exception:"+e.getMessage()); 
	   } 
	  } 
	  else 
	  { 
	    System.out.println("File 2 does not exists"); 
	  } 
	 } 
	 
	} 
   