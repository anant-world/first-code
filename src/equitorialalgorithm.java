public class equitorialalgorithm {
    static int equitorial(int a, int b){
        while (a>0 && b>0){
            if (a>b){
                a= a% b;
            }else{
                b=b%a;
            }
            }
        if(a==0){
            return b;
        }else
        return a;
    }
    public static void main(String[] args) {
      int n1=20,n2=15;
      int gcd=equitorial(n1,n2);
        System.out.println(gcd);
    }
}
