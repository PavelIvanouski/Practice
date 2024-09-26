package by.it_academy.practice.practice6;

public class PracticeTask6 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        int maxSumRowIndex = -1;
        int maxSumRow = 0;
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum > maxSumRow) {
                maxSumRow = rowSum;
                maxSumRowIndex = i;
            }
        }
        System.out.println("Maximum row sum index is " + maxSumRowIndex + ", sum is " + maxSumRow);
    }
}
