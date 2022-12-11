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
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {
        // // Write your code here
        // int arr[] = new int[]{31,28,31,30,31,30,31,31};
        // int programmer_day = 256, sum = 0, diff =0;
        
        // if(year == 1917){
        //     return "09"+Integer.toString(year);
            
        // }
        // if(year <= 1917){
        //     if(year % 4 ==  0){
        //         arr[1] = 29;
        //     }
        // }
        
        // if(((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0){
        //     arr[1] = 29;
        // }
        
        // for(int a : arr){
        //     sum +=a;
        // }
        // diff = programmer_day - sum;
        
        
        
        
        String s = ".09."+Integer.toString(year);
        if(year == 1918){
            return "26"+s;
        }
        if((year <= 1917 && year %4 == 0) || (year >=1919 &&(year % 400 == 0||(year % 4 == 0 && year % 100 != 0)))){
            return "12"+s;
        }else{
            return "13"+s;
        }
        
        
        // return Integer.toString(diff)+".13."+Integer.toString(year);

    }

}

public class DayOfTheProgrammer {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
