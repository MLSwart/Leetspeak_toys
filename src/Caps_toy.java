import java.util.Scanner;

public class Caps_toy {
    public static void main(String[] args) {
        System.out.println("Welke tekst wil je omzetten?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] characterArray = input.toCharArray();


        for (int x = 0; x < characterArray.length; x++) {
            if (x % 2 == 0 && characterArray[x] > 96 && characterArray[x] < 123) {
                //karakters op even plaatsen zijn hoofdletters
                characterArray[x] = (char) ((characterArray[x]) - 32);
            } else if (x % 2 != 0 && characterArray[x] > 64 && characterArray[x] < 91) {
                //karakters op oneven plaatsen zijn klein
                characterArray[x] = (char) ((characterArray[x]) + 32);
            } else characterArray[x] = characterArray[x];

            System.out.print(characterArray[x]);
        }


    }
}
