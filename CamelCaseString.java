import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CamelCaseString {

    // Complete the camelcase function below.
    static int camelcase(String s) {
        int numberOfWorlds = 1;
        boolean temp;
        for(int i=1;i<s.length();i++){
            temp = Character.isUpperCase(s.charAt(i));
            if(temp){
                numberOfWorlds++;
            }
        }
        return numberOfWorlds;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = camelcase(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
