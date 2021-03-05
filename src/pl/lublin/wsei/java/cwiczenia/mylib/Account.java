
package pl.lublin.wsei.java.cwiczenia.mylib;
import org.apache.commons.lang3.StringUtils;


public class Account {

//    public String setName;
    private String name;
/*
    public void setName(String name) {
        String[] tokens = StringUtils.split(name);
        for(int i = 0; i < tokens.length; i++)
            tokens[i] = StringUtils.capitalize(tokens[i]);
        this.name = StringUtils.join(tokens,' ');
 //       return name;
    }
*/
/*
    public void setName(String name) {
        this.name = name;
    }
*/
    public String getName() {
       return name;
    }
/*
    public static String capitalize(String aStr)
    {
        String[] tokens = StringUtils.split(aStr);
        for(int i = 0; i < tokens.length; i++)
            tokens[i] = StringUtils.capitalize(tokens[i]);
        return StringUtils.join(tokens,' ');
    }
    public void setName(String name) {
        this.name = capitalize(name);
    }
*/
public static String translit(String arg)
{
    String ukrAlphabet = "абвгдеєжзиіїйклмнопрстуфхцчшщьюя";
    System.out.println(ukrAlphabet);
    String[] translitRepl = {"a","b","v","g","d","e","je","zh","z","y","i","ji", "j",
            "k","l","m","n","o","p","r","s","t","u","f","h","c",
            "ch","sh","shh","'","ju","ja"};
    String[] tokens = StringUtils.split(arg);
    String output = "";
    System.out.println(output);
    for(int i = 0; i < tokens.length; i++)
        for(int j = 0; j < ukrAlphabet.length(); j++){
            System.out.println("iter"+i +" | "+ j + "  " + tokens[i]);
            if(tokens[i] == Character.toString(ukrAlphabet.charAt(j))){

                System.out.println(output);
                break;
            }
        }
    System.out.println(output);
    return output;
}
    public void setName(String name) {
        this.name = translit(name);
    }



}
