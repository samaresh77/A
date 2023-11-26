//TC -->o(n3)
// subarray sum(BFS approach)
class SubArrSum {
    public static void subArrSum(int arr[], int n) {
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int currSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                }
                maxSum = Math.max(maxSum, currSum);
                minSum = Math.min(minSum, currSum);
                currSum = 0;
            }
        }
        System.out.println("Maximum subarray sum is: "+maxSum);
        System.out.println("Minimum subarray sum is: "+minSum);
    }

    
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        int n = arr.length;
        subArrSum(arr, n);
    }
}