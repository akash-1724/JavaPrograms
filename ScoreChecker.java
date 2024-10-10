package Tutorial10;

import java.util.Scanner;

//Custom unchecked exception
class InvalidScoreException extends RuntimeException {
 public InvalidScoreException(String message) {
     super(message);
 }
}

class Student {
 private String name;
 private int score;

 public Student(String name, int score) {
     this.name = name;
     setScore(score);
 }

 public void setScore(int score) {
     if (score < 0 || score > 100) {
         throw new InvalidScoreException("Score must be between 0 and 100");
     }
     this.score = score;
 }

 public int getScore() {
     return score;
 }

 public String getName() {
     return name;
 }
}

public class ScoreChecker {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.print("Enter the student's name: ");
     String name = scanner.nextLine();

     System.out.print("Enter the student's score: ");
     while (true) {
         try {
             int score = Integer.parseInt(scanner.nextLine());
             var student = new Student(name, score);
             System.out.println(student.getName() + "'s score: " + student.getScore());
             break;
         
         } catch (InvalidScoreException e) {
             System.out.print("Error: " + e.getMessage() + ". Please enter a valid score: ");
         }
     }
     
     scanner.close();
 }
}