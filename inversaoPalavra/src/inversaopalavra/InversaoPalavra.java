
package inversaopalavra;

import java.util.Scanner;

public class InversaoPalavra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String p = scanner.nextLine();

        
        String invertida = new StringBuilder(p).reverse().toString();

        System.out.println("Palavra invertida: " + invertida);
    }
    
}
