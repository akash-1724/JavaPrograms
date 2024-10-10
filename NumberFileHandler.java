package lab8;

import java.io.*;
import java.util.*;

public class NumberFileHandler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int n = sc.nextInt();
        
        // Array to store numbers
        int[] numbers = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        
        // Write to numbers.txt
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("numbers.txt"))) {
            for (int num : numbers) {
                writer.write(num + "\n");
            }
            System.out.println("Data added to numbers.txt");
        } catch (IOException e) {
            System.out.println("Error writing to numbers.txt: " + e.getMessage());
        }
       
        // Separate even and odd numbers
        try (BufferedReader reader = new BufferedReader(new FileReader("numbers.txt"));
             BufferedWriter evenWriter = new BufferedWriter(new FileWriter("even.txt"));
             BufferedWriter oddWriter = new BufferedWriter(new FileWriter("odd.txt"))) {
             
            String line;
            while ((line = reader.readLine()) != null) {
                int num = Integer.parseInt(line.trim());
                if (num % 2 == 0) {
                    evenWriter.write(num + "\n");
                } else {
                    oddWriter.write(num + "\n");
                }
            }
            System.out.println("Even and odd numbers have been separated into even.txt and odd.txt");
        } catch (IOException e) {
            System.out.println("Error processing files: " + e.getMessage());
        }
        
        // Display the contents of the files
        System.out.println("Content of numbers.txt:");
        displayFileContent("numbers.txt");
        
        System.out.println("Content of even.txt:");
        displayFileContent("even.txt");
        
        System.out.println("Content of odd.txt:");
        displayFileContent("odd.txt");
        sc.close();
    }
    
    // Method to display file content
    public static void displayFileContent(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading " + fileName + ": " + e.getMessage());
        }
    }
}

