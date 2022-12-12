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
     * Complete the 'superReducedString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String superReducedString(String s) {
        // Write your code here
        StringBuilder sb = new StringBuilder(s);
        for(int i = 1; i < sb.length(); i++){
            if(sb.charAt(i) == sb.charAt(i-1)){
                sb.delete(i-1, i+1);
                i = 0;
            }
        }
        String ans = sb.toString();
        if(ans.length() == 0){
            return "Empty String";
        }else{
            return ans;
        }
    }

}

public class Super_Reduced_String {
    public static void main(String[] args) throws IOException {

        String result = Result.superReducedString("bjhbhsbandak");

        System.out.println(result)
    }
}
