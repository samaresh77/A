//TC -->o(n2), SC -->o(n)
// max subarray sum(Prefix Array)
class MaxSubArrSum {
    public static void maxSubArrSum(int arr[], int n) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        //take prefix array
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                currSum = i==0 ? prefix[j]:prefix[j]-prefix[i-1];
                maxSum = Math.max(maxSum, currSum);
            }
        }
        System.out.println("Maximum subarray sum is: "+maxSum);
    }
    
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        int n = arr.length;
        maxSubArrSum(arr, n);
    }
}
