package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args)     {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int left = 0;
        int right = 0;
        int up = 0;
        int down = 0;

        int[][] mat = new int[m][n];

        for (int i=0; i<m; i++) {
            for(int j=0; j<n; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();
        System.out.println();

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++){
                if (x == mat[i][j]) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (mat[i][j] == x) {
                        left = mat[i][j-1];
                        
                        System.out.println("Left: " + left);
                        

                    }
                }
            }
        }

        sc.close();

    }
}
