package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;
import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;
import java.util.Scanner;

public class isPalindromeTest {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
 /*
        do{
            System.out.println(" Podaj tekst do sprawdzenia");
            String tekst = scn.next();
            if (tekst.equals("0")) break;
            System.out.print("Tekst: " + tekst +" " +
                    (StringFun.isPalindrome(tekst) ? "" : " nie ")+
                    "jest palindromem \n");
        }while (true);
   */
   /*
        System.out.println("Podaj tekst do zmiany");
        String tekst = scn.next();
        System.out.println(StringFun.anarchize(tekst));
    */
        System.out.println("Podaj tekst do zmiany");
        String tekst = scn.nextLine();
        System.out.println(StringFun.camelize(tekst));
    }
}
