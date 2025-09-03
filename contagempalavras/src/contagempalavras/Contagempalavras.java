
package contagempalavras;

import java.util.Scanner;

public class Contagempalavras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma palavra/frase:");
        String p = scanner.nextLine();
        int f = p.length();
        
        System.out.println("Tamanho da palavra: " + f);
    }
    
}
