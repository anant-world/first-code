public class pattern {
    public static void main(String[] args) {
//        for(int i=0;i<4;i++){
//            for(int j=0;j<4;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        int N=5;
        pattern(N);
    }
  static void pattern(int N){
//        for(int i=0;i<N;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
      for (int i=0;i<=N;i++){
          for(int j=0;j<i;j++){
              System.out.print(" ");
          }
          for(int j=0;j<2*N-2*i-1;j++){
              System.out.print("*");
          }
          for(int j=0;j<i;j++){
              System.out.print(" ");
          }
          System.out.println();
      }

   }

}
