public class pairinarray {

    public static void pairsprint(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            int curr=numbers[i];
            for(int j =i+1;j<numbers.length;j++){
                System.out.println("("+ curr + ","+ numbers[j] +")");
            }
            System.out.println();
        }
    }









    public static void main(String[] args) {
        int[] numbers = {2,4,3,6,7,8};
        pairsprint(numbers);

    }
}
