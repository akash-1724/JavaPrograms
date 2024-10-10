package Tutorial12;

import java.io.*; 
public class LineNumber { 
 
 public static void main(String[] args) { 
  try 
  { 
   File f=new File("Line.txt"); 
   FileInputStream fin=new FileInputStream(f); 
   BufferedReader br=new BufferedReader(new InputStreamReader(fin)); 
   String line; 
   int lno=1; 
   while((line=br.readLine())!=null) 
   { 
    System.out.println(lno+":"+line); 
    lno++; 
   }
   br.close();
  } 
  catch(Exception e) 
  { 
   System.out.println("Exception:"+e.getMessage()); 
  } 
 } 
 
}
