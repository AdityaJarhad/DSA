public class RecursionBinary {
    public static void main(String[] args) {
        int arr[] = {1, 3, 7, 8, 9, 12, 34, 56, 67};
        // int arr[] = new int[1000];
        int target = 34;

        System.out.println("Binary serching");
        int result = binarySearch(arr, target, 0, arr.length-1);
        if (result!=-1) {
            System.out.println("Element "+target+" found at index : "+result);
        }
        else{
            System.out.println("Element not found in binary search");
        }
    }

    public static int binarySearch(int[] arr, int target, int left, int right) {
        //1, 3, 7, 8, 9, 12, 34, 56, 67
        int steps = 0;
        
        while (left<=right) {
            steps++;
            int mid = (left+right)/2;

            if (arr[mid] == target) {
                System.out.println("Steps = "+steps);
                return mid;
            }
            else if(arr[mid]<target) {
                return binarySearch(arr, target, mid+1, right);
            }
            else{
                return binarySearch(arr, target, left, mid-1);
            }
        }
        System.out.println("Steps = "+steps);
        return -1;
    }   
}