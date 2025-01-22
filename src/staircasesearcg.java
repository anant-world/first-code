public class staircasesearcg {
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};
        int target=48;
        staircasearch(matrix,target);


    }
    public static boolean staircasearch(int [][]matrix, int target) {
        int row = 0;
        int column = matrix[0].length - 1;

        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] == target) {
                System.out.println("found key at(" + row + "," + column + ")");
                return true;

            } else if (target < matrix[row][column]) {
                column--;
            } else {
                row++;
            }
        }
        System.out.println("target not found");
        return false;
    }

}
