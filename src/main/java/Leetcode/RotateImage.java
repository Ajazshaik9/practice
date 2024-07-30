package Leetcode;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int [][]matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        /*
input:
        5 1 9 11
        2 4 8 10
        13 3 6 7
        15 14 12 16
output:
        15 13 2 5
        14 3 4 1
        12 6 8 9
        16 7 10 11
          */
        rotate(matrix);
    }

    public static void rotate(int[][] matrix) {

        int n = matrix.length;
        int [][] a = new int[5][5];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                n--;
                a[i][j] = matrix[n][j];
                j++;
                System.out.println(Arrays.deepToString(a));
            }
        }


    }
}
