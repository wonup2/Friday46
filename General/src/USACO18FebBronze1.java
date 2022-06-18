import java.util.*;
import java.io.*;

public class USACO18FebBronze1 {

	static Scanner in;
	static PrintWriter out;
	static int a, b, x, y;
	
	
	public static void main(String[] args) {

		in = new Scanner(System.in);
		//in = new Scanner(new File("teleport.in"));
		//out = new PrintWriter(new File("teleport.in"));
		
		init();
		solve();
		
		in.close();
		//out.close();
	}

	static void init() {
		
		a = in.nextInt();
		b = in.nextInt();
		x = in.nextInt();
		y = in.nextInt();
	}
	
	static void solve() {
		
		int ans = Math.abs(a-b);
		
		ans = Math.min(ans, Math.abs(a-x) + Math.abs(b-y));
		
		ans = Math.min(ans, Math.abs(b-x) + Math.abs(a-y));
		
		
		System.out.println(ans);
		
		//out.println(ans);
		
	}
}
