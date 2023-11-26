//TC -->o(n)
// max subarray sum(Kadanes Algorithm)
class KadanesAlgorithm {
    public static void kadanes(int arr[], int n) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0;i<n;i++){
            
        }
        System.out.println("Maximum subarray sum is: "+maxSum);
    }
    
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        int n = arr.length;
        kadanes(arr, n);
    }
}
