package Tutorial12;
import java.io.*; 
public class CreateFile { 
 
 public static void main(String[] args)throws IOException { 
  File f=new File("MyFile.txt"); 
  f.createNewFile(); 
  String content="This is the University Exam for OODP. \nThis a program to illustrate the use of files."; 
  try 
  { 
   FileOutputStream fout=new FileOutputStream(f); 
   fout.write(content.getBytes()); 
   FileInputStream fin=new FileInputStream(f); 
   int i; 
   while((i=fin.read())!=-1) 
   { 
    char c=(char)i; 
    System.out.print(c); 
   } 
   fout.close();
   fin.close();
  } 
  catch(Exception e) 
  { 
   System.out.println(e.getMessage()); 
  } 
 } 
 
}