import java.util.Scanner;

public class Atv5 {
    //5.	Crie um algoritmo que, dada uma temperatura em graus célsius, 
    //exiba uma mensagem informando o tipo do clima, de acordo com as seguintes condições: 
    //se a temperatura estiver até 18 graus, o clima é frio; 
    //se a temperatura estiver entre 19 e 23 graus, o clima é agradável; 
    //se a temperatura estiver entre 24 e 35 graus, o clima é quente; 
    //se a temperatura estiver acima de 35 graus, o clima é muito quente.
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Qual a temperatura(C°)? ");
        int temp = ler.nextInt();
        
        if(temp <= 18){
            System.out.println("O clima é frio.");
        }
        else if((temp >= 19) && (temp <= 23)){
            System.out.println("O clima é agradável.");
        }
        else if((temp >= 24) && (temp <= 35)){
            System.out.println("O clima é quente.");
        }
        else if(temp > 35){
            System.out.println("O clima é muito quente.");
        }        
    }
}


