import java.util.Scanner;

public class Caps_toy {
    public static void main(String[] args) {
        System.out.println("Welke tekst wil je omzetten?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        char[] characterArray = input.toCharArray();


        for (int x = 0; x < characterArray.length; x++) {
            if (x % 2 == 0 && characterArray[x] > 96 && characterArray[x] < 123) {
                //karakters op even plaatsen zijn hoofdletters
                characterArray[x] = (char) ((characterArray[x]) - 32);
            }

            System.out.print(characterArray[x]);
        }


    }
}
