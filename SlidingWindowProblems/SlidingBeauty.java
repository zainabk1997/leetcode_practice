
public class SlidingBeauty {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {

        int n = nums.length;
        // frequency array
        int neg[] = new int[51];
        int[] res = new int[n - k + 1];
        int index = 0;
        // a will keep track of nums from the left
        int a = 0;
        // i will keep track of nums from the right
        for (int i = 0; i < n ; i++) {
            if (nums[i] < 0)
                neg[-nums[i]]++;
            if (i + 1 >= k) {
                int c = 0;
                int j = 0;
                for (j = 50; j > 0; j--) {

                    c += neg[j];

                    if (x <= c) {
                        // we have reached x smallest negative integer, hence store it in res and break
                        // the value will be the index of the array
                        res[index] = -j;
                        break;
                    }
                }
                if (j == 0)
                    res[index] = 0;
                // slide the window from the left - only remove negative numbers anyway so
                // searching for negative numbers
                if (nums[a] < 0)
                    neg[-nums[a]]--;
                index++;
                a++;
            }
        }

        return res;

    }

    public static void main(String[] args) {
        SlidingBeauty solution = new SlidingBeauty();
        int[] nums = { 1, -1, -3, -2, 3 };
        int k = 3;
        int x = 2;
        int[] result = solution.getSubarrayBeauty(nums, k, x);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
