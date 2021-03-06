package algorithms.arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/minimum-swaps-2/problem
 *
 * @author  Manoj Kumar Arram
 */
public class MinimumSwaps2 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int swaps = 0;
        for(int i = 0; i < arr.length; i++){
            while(arr[i] != i+1){
                int t = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = t;
                swaps++;
            }
        }
        return swaps;
    }
}
