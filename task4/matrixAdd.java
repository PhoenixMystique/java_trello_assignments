package task4;

public class matrixAdd {

    public static void main(String[] args) {
        int[][] m1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] m2= { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] ans = new int[3][3];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
               ans[i][j] = m1[i][j] + m2[i][j];
            }
        }
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
