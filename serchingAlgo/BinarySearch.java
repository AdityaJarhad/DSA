public class BinarySearch {
    public static void main(String[] args) {
        // int arr[] = {1, 3, 7, 8, 9, 12, 34, 56, 67};
        int arr[] = new int[1000];
        int target = 34;

        System.out.println("Binary serching");
        int result = binarySearch(arr, target);
        if (result!=-1) {
            System.out.println("Element "+target+" found at index : "+result);
        }
        else{
            System.out.println("Element not found in binary search");
        }
    }

    public static int binarySearch(int[] arr, int target) {
        //1, 3, 7, 8, 9, 12, 34, 56, 67
        int steps = 0;
        int left = 0;
        int right = arr.length-1;
        
        while (left<=right) {
            steps++;
            int mid = (left+right)/2;

            if (arr[mid] == target) {
                System.out.println("Steps = "+steps);
                return mid;
            }
            else if(arr[mid]<target) {
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        System.out.println("Steps = "+steps);
        return -1;
    }   
}