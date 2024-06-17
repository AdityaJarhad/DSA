public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {4,2,5,2,8,9,1};
        int size =arr.length;
        System.out.println("Array before Bubble sort");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        //Time comp : O(n^2)
        System.out.println("\nBubble sort");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
            System.err.println();
            for (int q : arr) {
                System.out.print(q+" ");
            }
        }
        System.out.println("\nArray after Bubble sort\n");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
