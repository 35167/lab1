package pl.lublin.wsei.java.cwiczenia.mylib;

import org.apache.commons.lang3.StringUtils;
import pl.lublin.wsei.java.cwiczenia.isPalindromeTest;

import java.util.Locale;

public class StringFun {
    public static boolean isPalindrome(String word){
        boolean output;

       // char charWord[] = word.toCharArray();
        String rev ="";
       // for(int i = charWord.length-1;)


        char[] chartab = word.toCharArray();
        char[] revchartab = chartab;
        int j = 0;
        for(int i = chartab.length-1; i >= 0; i--, j++){
            System.out.println(revchartab[i] + " | "+ chartab[j]);
            rev += revchartab[i];
        }

        System.out.println(rev);
        System.out.println(word);

        if(rev == word){
            output = true;
        }else{
            output = false;
        }
        System.out.println(output);
        return output;
    }

    public static String anarchize(String word) {
        String temp = word;
        String output = "";
        char[] chartab = word.toCharArray();

        for(int i = 0; i < chartab.length; i++) {
            if(i%2 == 0) {
                temp += temp.substring(i, chartab.length).toLowerCase() + "\n";
            }else {
                temp += temp.substring(i, chartab.length).toUpperCase() + "\n";
            }
        }

        return temp;
    }

}
