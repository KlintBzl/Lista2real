
package contagem;

import java.util.Scanner;

public class Contagem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma frase: ");
        
        String f = scanner.nextLine();
        
        String F = f.replace(" ", "");
        
        int Fp = F.length();
        
        System.out.println("A quantidade de palavras dela é '" + Fp + "' letras (sem contar os espaços)");
    }
    
}
