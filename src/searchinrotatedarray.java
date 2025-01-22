//public class searchinrotatedarray {
//    public static void main(String[] args) {
//
//    }
//    static int search(int[] nums,int target){
//        int pivot= findpivot(nums);
//
//
//        if(pivot==-1){
//            return findbinarysearch(nums, target,0,nums.length-1);
//        }
//        if (pivot==target){
//            return pivot;
//        }
//        if (target>nums[0]){
//            return binarysearch(nums,target,0,pivot-1);
//        }
//
//            return binarysearch(nums,target,pivot+1,nums.length-1);
//        }
//
//    static int findpivot(int[] arr,int target,int start,int end){
//        while(start<=end){
//            int mid=start+(end-start/2);
////            the 4 cases are there
//            if(mid<end && arr[mid]>arr[mid+1]){
//                return arr[mid];
//            }
//            if(mid>start && arr[mid]<arr[mid+1]){
//                return arr[mid+1];
//            }
//            if(arr[mid]<=arr[start]){
//                end=mid-1;
//            }
//            if (arr[start]<arr[mid]){
//                start=mid+1;
//            }
//        }
//        return -1;
//    }
//    static int binarysearch(int[] arr,int target,int start,int end){
//
//        while(start<=end){
//            int mid= start+(end-start)/2;
//            if(target< arr[mid]){
//                end=mid-1;
//            }else if (target>arr[mid]){
//                start=mid+1;
//            }else{
//                return mid;
//            }
//        }
//        return -1;
//    }
//}
//
//}
