package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Account acc = new Account();
        acc.setName("абв абвабв");
        System.out.println(acc.getName());


     //   Scanner input = new Scanner(System.in);
	//komentarz
    /*
    również komentarz
    ale wielolinijkowy
     */
        /**
         * linia1
         * linia2
         * @param
         * @return
          */

//        System.out.println("Jakis tekst");
/*
        int a = 34;
        double b = 22.343;
        String s = "text";

        System.out.printf("a = %d, b = %.2f, s = %20s %n",a,b,s);

        System.out.println("nazwaliśmy to witaminą \"b3\"");

        System.out.printf("alfa\tsin(alfa)\n");
        for(int i = 0; i < 370; i+=10){
            System.out.printf("%d\t%f\t\n", i, Math.sin(i/360.0*2*Math.PI));
        }
*/
/*

        int num1, num2;
        System.out.print("Podaj pierwszą liczbę: ");
        num1 = input.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        num2 = input.nextInt();
        System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1+num2);
*/

/*
        int ile;
        System.out.print("Podaj liczbę: ");
        ile = input.nextInt();
        double temp;
        double temp2;
        int temp3 = 0;

        for(int i = 0; i <= ile; i++) {
            temp = Math.pow(2, i);
            temp2 = Math.log(temp) / Math.log(2);
            temp3+=temp;
            System.out.println("arg: "+ (int)temp + " log2(arg): " + (int)temp2 + " sum(arg): "+ temp3);
        }
*/
    }

}
