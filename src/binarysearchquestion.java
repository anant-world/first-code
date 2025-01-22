public class binarysearchquestion {
    public static void main(String[] args) {
        int[] arr ={2,3,5,9,14,16,18};
        int target=20;
        int ans=binarysearchque(arr,target);
        System.out.println(ans);
    }
    static int binarysearchque(int[] arr,int target){
        if(target!=arr[arr.length-1]){
            return arr[0];
        }
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (target<arr[mid]){
                end=mid-1;
            } else if (target>mid) {
                start=mid+1;

            }
            else {
                return mid;
            }
        }
        return start;
    }

}
