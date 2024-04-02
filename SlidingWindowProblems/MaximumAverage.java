

public class MaximumAverage {
    
    // public double findMaxAverage(int[] nums, int k) {
    //     int n = nums.length;
    //     int i=0;
    //     int j = k;
    //     double avg = 0.0000;
    //     double maxAvg = 0.0000;
    //     while(j<=n){
    //         double sum=0.00000;
    //         for(int m=i; m<j; m++){
    //             sum += nums[m];
    //         }
    //         avg = sum/k;
    //         maxAvg = Math.max(maxAvg, avg);
    //         i++;
    //         j++;
            
    //     }
    //     return maxAvg;
    // }

    public double findMaxAverage(int[] nums, int k){
        int sum = 0;
        for(int i=0; i<k; i++){
            sum+=nums[i];
        }
        int maxSum = sum;
        for(int i=k; i<nums.length; i++){
            sum+=nums[i] - nums[i-k];
            maxSum = Math.max(sum, maxSum);
        }
        return(double)maxSum/k;
    }


    public static void main(String[] args) {
        MaximumAverage solution = new MaximumAverage();
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        double result = solution.findMaxAverage(nums, k);
        System.out.println("The maximum average is : " + result);
    }
}
