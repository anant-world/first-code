public class selectionsort {
    static void sorting(int arr[],int n){
        for(int i=0;i<n-1;i++){
            int mini =i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                }
               int temp=arr[mini];
                arr[mini]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println("after selection sort");
        for(int i=0;i<n;i++){
            System.out.println(arr[i] +"");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9};
        int n=arr.length;
        System.out.println("before selection sort");
        for (int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
        sorting(arr,n);
    }
}
