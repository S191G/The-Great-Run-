import java.util.*;
import java.lang.*;
import java.io.*;

class GreatRun
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = Integer.parseInt(scanner.nextLine());
        for (int t = 0; t < T; t++) {
            String[] firstLine = scanner.nextLine().split(" ");
            int N = Integer.parseInt(firstLine[0]);
            int K = Integer.parseInt(firstLine[1]);

            String[] girlsInput = scanner.nextLine().split(" ");
            int[] girls = new int[girlsInput.length];
            for (int i = 0; i < girlsInput.length; i++) {
                girls[i] = Integer.parseInt(girlsInput[i]);
            }

            int currentImpressed = 0;
            for (int i = 0; i < K; i++) {
                currentImpressed += girls[i];
            }
            int maxImpressed = currentImpressed;

            for (int i = K; i < N; i++) {
                currentImpressed = currentImpressed - girls[i - K] + girls[i];
                maxImpressed = Math.max(maxImpressed, currentImpressed);
            }
            System.out.println(maxImpressed);
        }
        scanner.close();
    }
}