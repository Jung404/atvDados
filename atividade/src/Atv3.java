import java.util.Scanner;

public class Atv3 {
    //3.	Escreva um algoritmo que apresente um menu de opções 
    //para realizar as quatro operações básicas da matemática.
    //a)	O usuário deve selecionar a operação desejada através de um número
    //b)	Após selecionar a operação, o usuário deve informar dois números para que a operação seja realizada
    //c)	Para encerrar a calculadora, o usuário deve digitar o número zero
    public static void main(String[] args) throws Exception {
        double operacao = 1;
        double valor = 0;
        Scanner ler = new Scanner(System.in);
    
        while(operacao != 0){
            System.out.println(" Insira um número: ");
            double numero = ler.nextDouble();
            System.out.println("Insira o próximo número");
            double numero2 = ler.nextDouble();
            
            System.out.println("Qual operação você deseja fazer?");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            operacao = ler.nextInt();
            
            if(operacao == 1){
                valor = numero + numero2;
                System.out.println("A soma é: " + valor);
            }
            else if(operacao == 2){
                valor = numero - numero2;
                System.out.println("A subtração é: " + valor);   
            }
            else if(operacao == 3){
                valor = numero * numero2;
                System.out.println("A multiplicação é: " + valor);
            }
            else if(operacao == 4){
                valor = numero / numero2;
                System.out.println("A divisão é: " + valor);
            }
            else{
                System.out.println("Operação inválida");
            }
            System.out.println("Para finalizar, digite 0");
            operacao = ler.nextInt();
        }       
    }
}
