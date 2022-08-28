import java.util.Scanner;

public class Atv4 {
    //4.	Crie um programa que recebe um array de inteiros positivos 
    //e substitui seus elementos de valor ímpar por -1 e os pares por +1.
    public static void main(String[] args) throws Exception {
        int numero1;

        Scanner ler = new Scanner(System.in);
        System.out.println("Quantos números você gostaria de digitar? ");
        int numDigitados = ler.nextInt();
        System.out.println("Digite os números que você deseja: ");
        int[] array = new int[numDigitados];
        
        for(int i = 0; i < numDigitados; i++){
            numero1 = ler.nextInt();
            if(numero1 > 0){
                array [i] = numero1;
            }else{
                i--;
            }
        }
        for(int i = 0; i < numDigitados; i++){
            if (array[i] %2 == 0){
                array[i] = +1;
                System.out.println("+" + array[i]);
            }else{
                array[i] = -1;
                System.out.println(array[i]);
            }
        }
    }
}

