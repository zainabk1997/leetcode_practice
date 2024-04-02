import java.util.HashMap;

public class CountNumberOfGoodSubarrays {

    public long countGood(int[] nums, int k) {

        long res = 0;
        int val = 0;
        long c = 0;
        int i = 0;
        int j = 0;
        HashMap<Integer, Integer> hmap = new HashMap<>();

        while (j < nums.length) {
            if (c < k) {
                if(hmap.containsKey(nums[j])){
                    // val is the frequency of the value in the array
                    val = hmap.get(nums[j]);
                    hmap.put(nums[j], val+1);
                    c+=val;
                    j++;
                } else {
                    hmap.put(nums[j],1);
                    c+= (val * (val-1))/2;
                    j++;
                } 
            }

            if(c >= k){
                hmap.remove(nums[i]);
                i++;
            }

            res = c;
        }

        return res;
    }

    public static void main(String[] args) {
        CountNumberOfGoodSubarrays solution = new CountNumberOfGoodSubarrays();
        int[] nums = { 3, 1, 4, 3, 2, 2, 4 };
        int k = 2;
        long result = solution.countGood(nums, k);
        System.out.println(result);
    }

}
