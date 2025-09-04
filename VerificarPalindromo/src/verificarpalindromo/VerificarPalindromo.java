
package verificarpalindromo;

import java.util.Scanner;


public class VerificarPalindromo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma palavra: ");
        String p = scanner.nextLine();
        
        
        String invertida = new StringBuilder(p).reverse().toString();
        
        if(invertida.equals(p)){
            System.out.println("A palavra é um palíndromo!");
        }else{
            System.out.println("A palavra não é um palíndromo!");
        }
        
    }
    
}
