
package email;

import java.util.Scanner;

public class Email {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu email: ");
        String e = scanner.nextLine();
        
        if(e.contains("@")){
            String dominio = e.substring(e.indexOf("@") + 1);
            System.out.println("Domínio: " + dominio);
        }else{
            System.out.println("Insira um email válido! Por favor, né!");
        }
    }
    
}
