package algorithms.warmup;
/**
 * Given two integers: L and R,
 * find the maximal values of A xor B given, L <= A <= B <= R
 * 
 * Input Format :
 * The input contains two lines, L is present in the first line. 
 * R in the second line.
 * 
 * Constraints :  
 * 1 <= L <= R <= 103
 * 
 * Output Format :
 * The maximal value as mentioned in the problem statement.
 * 
 * Sample Input#00
 * 10
 * 15
 * 
 * Sample Output#00
 * 7
 * 
 * In the second sample let's say L=10, R=15, then all pairs which comply to above condition are 
 10^10=0 
 10^11=1 
 10^12=6 
 10^13=7 
 10^14=4 
 10^15=5 
 11^11=0 
 11^12=7 
 11^13=6 
 11^14=5 
 11^15=4 
 12^12=0 
 12^13=1 
 12^14=2 
 12^15=3 
 13^13=0 
 13^14=3 
 13^15=2 
 14^14=0 
 14^15=1 
 15^15=0 
 Here two pairs (10,13) and (11,12) have maximum xor value 7 and this is the answer.
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximizingCXOR {
	public static void main(String[] args) {
		int max = 0;
		BufferedReader read = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			int l = Integer.parseInt(read.readLine());
			int r = Integer.parseInt(read.readLine());

			for (int i = l; i <= r; i++) {
				for (int j = l; j <= r; j++) {
					int res = (i ^ j);
					if (max < res)
						max = res;
				}
			}

			System.out.println(max);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
