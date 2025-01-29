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
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) 
    {
        // Loop through the indices from 1 to n
        for(int i = 1; i <= n; i++)
        {
            // Use a mutable object instead of fixed one - in this case StringBuilder
            // Mutables: perform set changes in an attribute inside their class, keeping mem/CPU usage stable
            // Fixed: such as 'string' crete a copy of every single one so trashes the RAM and the CPU usage
            // These differences can only be noticed thru a 'profiler'
            StringBuilder output = new StringBuilder();
            
            if(i % 3 == 0)
            {
                output.append("Fizz");
            }           
            
            if(i % 5 == 0)
            {
                output.append("Buzz");
            }
            
            if(output.isEmpty())
            {
                output.append(i);
            }
            
            System.out.println(output);
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();
    }
}
