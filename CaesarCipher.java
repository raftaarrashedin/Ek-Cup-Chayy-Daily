// // import java.io.*;
// // import java.math.*;
// // import java.security.*;
// // import java.text.*;
// // import java.util.*;
// // import java.util.concurrent.*;
// // import java.util.function.*;
// // import java.util.regex.*;
// // import java.util.stream.*;
// // import static java.util.stream.Collectors.joining;
// // import static java.util.stream.Collectors.toList;

// // class Result {

// //     /*
// //      * Complete the 'caesarCipher' function below.
// //      *
// //      * The function is expected to return a STRING.
// //      * The function accepts following parameters:
// //      *  1. STRING s
// //      *  2. INTEGER k
// // //      */
// // // String str = "GeeksForGeeks";
  
// // //         // Creating array of string length
// // //         // using length() method
// // //         char[] ch = new char[str.length()];

// // // char[] ch = str.toCharArray();
// //     public static String caesarCipher(String s, int k) {
// //     // Write your code here
// //         String original_alphabet = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
// //         char[] givenalphabet = s.toCharArray();
// //         char[] totalalphabet = original_alphabet.toCharArray();
// //         String encrypt;
// //         int i,j;
// //         for(j = 0; j < givenalphabet.length; j++){
// //             if(givenalphabet[j] == totalalphabet[i]){
// //                 encrypt = totalalphabet[i]+k;
// //                 i++;
// //             }
// //         }
// //         return encrypt;
// //     }

// // }

// // public class Solution {
// //     public static void main(String[] args) throws IOException {
// //         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
// //         BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

// //         int n = Integer.parseInt(bufferedReader.readLine().trim());

// //         String s = bufferedReader.readLine();

// //         int k = Integer.parseInt(bufferedReader.readLine().trim());

// //         String result = Result.caesarCipher(s, k);

// //         bufferedWriter.write(result);
// //         bufferedWriter.newLine();

// //         bufferedReader.close();
// //         bufferedWriter.close();
// //     }
// // }
// import java.util.Scanner;

// public class CaesarCipher {

//   String cipher(String message, int offset) {
//     // To hold the cipher text
//     StringBuilder result = new StringBuilder();

//     // Character by character encryption
//     for (char character : message.toCharArray()) {
//       if (character != ' ') {
//         int originalAlphabetPosition = character - 'a';

//         // Applying Caesar Cipher Technique
//         int newAlphabetPosition = (originalAlphabetPosition + offset) % 26;
//         char newCharacter = (char) ('a' + newAlphabetPosition);

//         // Adding the new character to the result
//         result.append(newCharacter);
//       } else {
//         result.append(character);
//       }
//     }
//     return result.toString();
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     CaesarCipher cipher = new CaesarCipher();

//     int offset = sc.nextInt();

//     String cipheredMessage = cipher.cipher(
//       "I enjoy learning from scalar topics",
//       offset
//     );
//     System.out.println(cipheredMessage);
//   }
// }
import java.util.Scanner;
 
public class CaesarCipher {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt() % 26;
        String str = "";
        for (int i = 0; i < n; i++) {
            str = str + getUpdatedAsciiChar(s.charAt(i), k);
        }
        System.out.println(str);
    }
 
    static char getUpdatedAsciiChar(char ch, int incremental) {
        if (Character.isLetter(ch)) {
            int i = (int) ch;
            i = i + incremental;
 
            if (Character.isUpperCase(ch)) {
                if (i > 90) {
                    int num = (int) ch + incremental;
                    i = num - 26;
                }
            } else if (i > 122) {
                int num = (int) ch + incremental;
                i = num - 26;
            }
            return (char) i;
        }
        return ch;
    }
 
}