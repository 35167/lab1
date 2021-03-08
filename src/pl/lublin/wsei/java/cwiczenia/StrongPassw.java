package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;
import pl.lublin.wsei.java.cwiczenia.mylib.StronPasswordGenerator;

public class StrongPassw {
    public static void main(String[] args){
        String passwd = String.valueOf(new StronPasswordGenerator(16, true, true, true, true, "@#!"));
        System.out.println(passwd);
    }
}
