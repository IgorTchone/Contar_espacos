import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escreva qualquer frase para te dizer quantos espaços tem: ");
        String frase = scanner.nextLine();

        int spaceCount = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        System.out.println("A frase tem " + spaceCount + " espaços.");
        scanner.close();
    }
}
