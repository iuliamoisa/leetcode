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
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        StringBuilder result = new StringBuilder();
        String format = s.substring(s.length()-2, s.length());
        String[] parts = s.split(":");
        String last = parts[2].substring(0,2);
        if(parts[0].equals("12")){
            if(format.equals("AM")){
                result.append("00");
            }
            else {
                result.append(parts[0]);
            }
        }
        else{
            if(format.equals("AM")){
                result.append(parts[0]);
            }
            else {
                result.append(Integer.parseInt(parts[0]) + 12);
            }
        }
        result.append(":").append(parts[1]).append(":").append(last);
        return result.toString();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
