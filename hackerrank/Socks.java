package hackerrank;

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

import javax.naming.spi.DirStateFactory.Result;

public class Socks {
	
	public static int sockMerchant(int n, List<Integer> ar) {
	    // Write your code here
	    
	        List<Integer> distinct_ar = ar.stream().distinct().collect(Collectors.toList());
	        int count=0;
	        for (int i: distinct_ar) {
	            count += ar.stream().filter(j -> j==i).count()/2;
	        }
	        return count;
	    }


	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        List<Integer> ar = (List<Integer>) Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());

	        int result = Socks.sockMerchant(n, ar);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }


	
}
