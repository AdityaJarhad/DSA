public class LinearSearch {
    public static void main(String[] args) {
        // int arr[] = {1, 3, 7, 8, 9, 12, 34, 56, 67};
        int arr[] = new int[100];
        int target = 34;

        System.out.println("Linear serching");
        int result1 = linearSearch(arr, target);
        if (result1!=-1) {
            System.out.println("Element "+target+" found at index : "+result1);
        }
        else{
            System.out.println("Element not found in linear search");
        }
       
    }

    public static int linearSearch(int[] arr, int target) {
        int steps = 0;
        for (int i = 0; i < arr.length; i++) {
            steps++;
            if (arr[i]==target) {
                System.out.println("Steps = "+steps);
                return i++;
            }
        }
        System.out.println("Steps = "+steps);
        return -1;
    }
}