import java.io.*;

class Main {
	public static void main (String[] args){
	    int n = 5;
	    int arr[] = {1,2,3,-2,5};
	    System.out.println(maxSubarraySum(arr, n));
	}
	
	// arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    public static int maxSubarraySum(int ar[], int n){
        
        //checking if all are negative numbers
        boolean allNegative=true;
        int maxNegative=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(ar[i]>=0){
                allNegative=false;
                break;
            }
            else{
                if(ar[i]>maxNegative){
                    maxNegative=ar[i];
                }
            }
        }
        if(allNegative){
            return maxNegative;
        }
        
        int sum=0;
        int maxSum=0;
        for(int i=0;i<n;i++){
            sum+=ar[i];
            if(sum>maxSum){
                maxSum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxSum;
    }
}

