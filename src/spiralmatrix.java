public class spiralmatrix {
    static void printspiral(int matrix[][]) {
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length - 1;
        int endcol =matrix.length-1;
        while( startrow<=endrow && startcol<=endcol) {
            for (int j = startcol; j <= endcol; j++) {
                System.out.println(matrix[startrow][j]);
            }
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.println(matrix[i][endcol]);
            }
            for (int j = endcol - 1; j >= startcol; j--) {
               if(startrow==endrow){
                   break;
               }
                System.out.println(matrix[endrow][j]);
            }
            for (int i = endrow - 1; i >= startrow + 1; i--) {
                if(startcol==endcol){
                    break;
                }
                System.out.println(matrix[i][startcol]);
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;

        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] matrix={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        printspiral(matrix);
    }
}
