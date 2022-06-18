import java.io.*;
import java.util.*;

public class CSES1083 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(in.readLine());
		
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		long sum = n * (n + 1) / 2;
		
		for(int i=0; i<n-1; i++)
			sum -= Long.parseLong(st.nextToken());
		
		System.out.println(sum);
	
	}
}

/*
5
2 3 1 5
*/