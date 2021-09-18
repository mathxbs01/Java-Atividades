package agenda07;

import java.util.Scanner;

public class Agenda07 {

    public static void main(String[] args) {
    
       String produto;
       double valor, porc;
       
       Scanner leitor = new Scanner(System.in);
       
       for(int i=1; i<=10; i++)
       {
        System.out.println("Digite o nome do produto " + i + ": ");
        produto = leitor.next();
        System.out.println("Digite o valor do produto" + i + ": ");
        valor = leitor.nextDouble();
        
        porc = valor * 0.5;
        
        System.out.println("Aplicando o desconto de 50% no produto " + produto + " o valor caiu para: " + "R$ " + porc);      
       
       }
 
    }
    
}
