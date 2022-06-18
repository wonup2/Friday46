import java.util.*;
public class CSES1068 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		long n = in.nextLong();
		
		StringBuilder sb = new StringBuilder();
		sb.append(n);
		
		while(n!=1){
			if(n%2==0) n = n / 2;
			else n = n * 3 + 1;
			sb.append(" ").append(n);
		}
		
		System.out.println(sb.toString());
	}

}
