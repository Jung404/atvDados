import java.util.Scanner;

public class Atv1 {
    //1.	Receba uma string informada pelo usuário e 
    //exiba cada caractere informado em uma linha diferente.
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        String saida = "";
            
        System.out.println("Insira uma palavra: ");
        String palavra = ler.nextLine();
        
        for(int i = 0; i < palavra.length(); i++){
            saida = String.valueOf(palavra.charAt(i));
            System.out.println(saida);
        }
    }          
}

