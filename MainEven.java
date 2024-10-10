package Tutorial11;
import evenpackage.Even;
import java.util.Scanner;

public class MainEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (Even.isEven(number)) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is not an even number.");
        }
        sc.close();
    }
}


