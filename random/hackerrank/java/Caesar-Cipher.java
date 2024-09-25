import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
        // Write your code here
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isLetter(c)){
                if (Character.isUpperCase(c)) {
                  // c-'A' = pozitia caracterului in alfabet ('C'-'A' = 67-65=2)
                  // c - 'A' + k = pozitia la care treb sa mut caracterul (daca k=3: 2+3=5)
                  //(c - 'A' + k) % 26 - ma asigur ca litera se incadreaza in alfabet (26 litere in alfabet)
                  //                 -> obtin noua pozitie la care trb mutat caracterul -> 5%26 = 5
                  //((c - 'A' + k) % 26 + 'A') -> reconvertesc pozitia la caracterul ascii curent
                    char shifted = (char) ((c - 'A' + k) % 26 + 'A');
                  //folosim (char) pentru a transforma rezultatul numeric al expresiei înapoi într-un 
                  //caracter, ptc operațiile aritmetice pe caractere (c - 'A') returnează un int, 
                  // => pt a obține din nou un caracter după calcule, folosim conversia explicită la char
                    result.append(shifted);
                } else {
                    char shifted = (char) ((c - 'a' + k) % 26 + 'a');
                    result.append(shifted);
                }
            }
            else{
                result.append(c);
            }
        }
        return result.toString();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
