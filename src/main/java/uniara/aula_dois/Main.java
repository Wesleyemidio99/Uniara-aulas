package uniara.aula_dois;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner dg = new Scanner(System.in);

        System.out.println("Exercicio 01");
        System.out.println();

        System.out.print("Digite o primeiro numero: ");
        int a = dg.nextInt();

        System.out.print("Digite o segundo numero: ");
        int b = dg.nextInt();

        ExercicioUm exUm = new ExercicioUm(a,b);

        System.out.printf("A soma do primeiro numero + segundo numero = %d\n",exUm.soma());
        System.out.printf("A subtracao do primeiro numero - segundo numero = %d\n",exUm.sub());
        System.out.printf("A multiplicao do primeiro numero * segundo numero = %d\n",exUm.mult());
        System.out.printf("A divisao do primeiro numero / segundo numero = %.2f\n",exUm.div());

        System.out.println();
        System.out.println("Exercicio 02");
        System.out.println();

        System.out.print("Digite o primeiro numero: ");
        int c = dg.nextInt();

        System.out.print("Digite o segundo numero: ");
        int d = dg.nextInt();

        System.out.print("Digite o terceiro numero: ");
        int e = dg.nextInt();

        ExercicioDois exDois = new ExercicioDois(a,b,c);

        System.out.printf("A media dos tres numeros digitados = %d",exDois.media());

        System.out.println();
        System.out.println();
        System.out.println("Exercicio 03");
        System.out.println();

        System.out.println("Digite tres palavras: ");
        dg.nextLine();
        System.out.print("Primeira: ");
        String palavraUm = dg.nextLine();
        System.out.print("Segunda: ");
        String palavraDois = dg.nextLine();
        System.out.print("Terceira: ");
        String palavraTres = dg.nextLine();

        ExercicioTres exTres = new ExercicioTres(palavraUm,palavraDois,palavraTres);

        System.out.println("As possiveis combinacao sao:");
        exTres.concatenacaoA();
        exTres.concatenacaoB();
        exTres.concatenacaoC();
        exTres.concatenacaoD();
        exTres.concatenacaoE();
        exTres.concatenacaoF();

        dg.close();
    }
}