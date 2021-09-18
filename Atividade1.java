package agenda04;

import java.util.Scanner;

public class Agenda04 {

    public static void main(String[] args) {
        float VtVal, VtBrc, VtNulos, Total, PorcVal, PorcBrc, PorcNulos;
        Scanner leitor = new Scanner(System.in);
        //Declarar a quantidade de votos
        System.out.println("Digite a quantidade de votos válidos: ");
        VtVal = leitor.nextFloat();
        System.out.println("Digite a quantidade de votos em branco: ");
        VtBrc = leitor.nextFloat();
        System.out.println("Digite a quantidade de votos nulos: ");
        VtNulos = leitor.nextFloat();

        //Agora que determinei a quantidade de cada tipo de voto, irei calcular o total && a porcentagem
        Total = VtVal + VtBrc + VtNulos;

        System.out.println("O total de votos no municipio foi de: " + Total);
        //Porcentagem
        PorcVal = (VtVal * 100) / Total;
        PorcBrc = (VtBrc * 100) / Total;
        PorcNulos = (VtNulos * 100) / Total;

        System.out.println("A porcentagem de votos válidos, votos em branco e votos nulos, respectivamente, são: " 
                + PorcVal + "%, " + PorcBrc + "%, " + PorcNulos + "%");

    }

}
