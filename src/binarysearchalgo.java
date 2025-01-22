public class binarysearchalgo {
    public static void main(String[] args) {
        int[]arr={-1,0,2,5,6,8,9,10};
        int target=2;
        int ans=binarysearch(arr,target);
        System.out.println(ans);
    }
    static int binarysearch(int[] arr,int target){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(target< arr[mid]){
                end=mid-1;
            }else if (target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
