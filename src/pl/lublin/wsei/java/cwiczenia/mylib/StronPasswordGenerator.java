package pl.lublin.wsei.java.cwiczenia.mylib;
import java.awt.print.Printable;
import java.util.*;

public class StronPasswordGenerator {
    public StronPasswordGenerator(int dlogosc, boolean maleLitery, boolean wielkieLitery, boolean cyfry, boolean znakiSpecjalne, String dozwoloneZnakiSpecjalne) {
        Random rnd = new Random();
        char[] zakres = new char[150];
        int i = 33;
        if (znakiSpecjalne) {
            for (; i <= 47; ) {
                zakres[i - 32] = (char) i;
                i++;
            }
        }
        if (cyfry) {
            for (; i <= 57; ) {
                zakres[i - 32] = (char) i;
                i++;
            }
        }
        if (znakiSpecjalne) {
            for (; i <= 64; ) {
                zakres[i - 32] = (char) i;
                i++;
            }
        }
        if (wielkieLitery) {
            for (; i <= 90; ) {
                zakres[i - 32] = (char) i;
                i++;
            }
        }
        if (znakiSpecjalne) {
            for (; i <= 96; ) {
                zakres[i - 32] = (char) i;
                i++;
            }
        }
        if (znakiSpecjalne) {
            for (; i <= 122; ) {
                zakres[i - 32] = (char) i;
                i++;
            }
        }

        String output = "";
        for(int j = 0; j < dlogosc; j++){
            output += zakres[rnd.nextInt(149)];
            System.out.println(j);
        }
        System.out.println("Twoje bezpieczne hasło to: "+output);
        }
    }

