
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearOfBirth = 0;
        int count = 0;
        int nameLenght = 0;
        String name = null;
        while (true) {

            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");

            if (parts[0].length() > nameLenght) {
                nameLenght = parts[0].length();
                name = parts[0];
            }
            yearOfBirth = yearOfBirth + Integer.valueOf(parts[1]);
            count = count + 1;
        }
        System.out.println("Longest name: " + name);
        if (count > 0) {
            System.out.println("Age average: " + (1.0 * yearOfBirth / count));
        } else {
            System.out.println("No input.");
        }
    }
}
