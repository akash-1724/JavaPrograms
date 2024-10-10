package Tutorial12;

import java.io.*; 
public class BinaryDemo { 
 
 public static void main(String[] args) { 
  File b1=new File("Binary1.bin"); 
  File b2=new File("Binary2.bin");; 
  try 
  { 
   FileInputStream fin=new FileInputStream(b1); 
   FileOutputStream fout=new FileOutputStream(b2); 
   int i; 
   System.out.print("Data of the original file:"); 
   while((i=fin.read())!=-1) 
   { 
    char c=(char)i; 
    System.out.print(c); 
    fout.write(i); 
   } 
   System.out.println("Successfully written to another file!"); 
   fin.close();
   fout.close();
  } 
  catch(Exception e) 
  { 
   System.out.println("An error occured:"+e.getMessage()); 
  } 
  try 
  { 
   FileInputStream fin2=new FileInputStream(b2); 
   System.out.print("Data of the copied file:"); 
   int i; 
   while((i=fin2.read())!=-1) 
   { 
    char c=(char)i; 
    System.out.print(c); 
   } 
   fin2.close();
  } 
  catch(Exception e) 
  { 
   System.out.println("Exception:"+e.getMessage()); 
  } 
 } 
 
} 
