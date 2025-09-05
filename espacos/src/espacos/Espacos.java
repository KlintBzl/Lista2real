
package espacos;

import java.util.Scanner;

public class Espacos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        
        String[] palavras = frase.trim().split("\\s+");
        
        String fraseFormatada = String.join(" ", palavras);
        
        System.out.println("Frase formatada: " + fraseFormatada);
    }
    
}
