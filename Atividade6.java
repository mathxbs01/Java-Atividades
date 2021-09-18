package agenda08;

import java.util.Scanner;

public class Agenda08 {
    public static void main(String[] args)
    {
        float mediaD = 0,porc = 0;
        int contador=0,A=0,B=0,C=0,D=0,E=0,total;
        String idade,avaliacao;
        
        Scanner leitor = new Scanner(System.in);
        
       
           
        while (contador<3)//colocar 100
        {
           System.out.println("Digite sua idade: ");
           idade = leitor.next();
           System.out.println("Digite a sua avaliação: " + "\n  A - Ótimo /  B - Bom / C - Regular  / D - Ruim  / E -  Péssimo");
           avaliacao = leitor.next();
           
           if("A".equals(avaliacao))
           {
            A++;
           }
           total = A+B+C+D+E;
           mediaD = D/total;
           if("mediaD".equals(avaliacao))
           {
           mediaD++;
           }
           porc = (E*100)/total;
           if("B".equals(avaliacao))
           {
            B++;
           }
           if("C".equals(avaliacao))
           {
            C++;
           }
           if("D".equals(avaliacao))
           {
            D++;
           }
           if("E".equals(avaliacao))
           {
            E++;
           }
           
           total = A+B+C+D+E;
           
           mediaD = D/total;
           porc = (E*100)/total;
           
           contador++;
          
           
          
        } 
        System.out.println("A quantidade de Ótimo é: " + A + "\n A quantidade de Bom é: " + B + "\n A quantidade de Regular é: " + C + "\n A quantidade de Ruim é: " + D + "\n A quantidade de Péssimo é: " + E +"\n Média de pessoas que responderam Ruim: " + mediaD + "\n A porcentagem de respostas Péssimo: " + porc + "%");
    }
    
}
