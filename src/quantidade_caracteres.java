import java.util.Scanner;
public class quantidade_caracteres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = scan.nextLine();

        int letras = frase.length();

        if (letras > 50) {
            System.out.println("Frase longa");
        } else {
            System.out.println("Frase curta");
        }

        scan.close();
        }

}