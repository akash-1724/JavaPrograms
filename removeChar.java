package Tutorial6;

import java.util.Scanner;

public class removeChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String inputString = sc.nextLine();

        System.out.print("Enter the character to remove: ");
        char charToRemove = sc.next().charAt(0);

        int length = inputString.length();
        char[] resultArray = new char[length];
        int index = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = inputString.charAt(i);
            if (currentChar != charToRemove) {
                resultArray[index++] = currentChar;
            }
        }

        String resultString = new String(resultArray, 0, index);
        System.out.println("String after removing '" + charToRemove + "': " + resultString);

        sc.close();
    }
}
