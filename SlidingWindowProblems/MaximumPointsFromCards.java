
public class MaximumPointsFromCards {
    
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int res=0;
        int i=0;
        int j = n-k;
        int total = 0;
        for(int m=j; m<n; m++){
            total+=cardPoints[m];
            res = total;
        }

        while(j<n){
            total+= (cardPoints[i]-cardPoints[j]);
            res = Math.max(res,total);
            i++;
            j++;

        }

        return res;
        
    }

    public static void main(String[] args) {
        MaximumPointsFromCards solution = new MaximumPointsFromCards();
        int[] cardPoints = { 9,7,7,9,7,7,9 };
        int k = 7;
        int result = solution.maxScore(cardPoints, k);
        System.out.println("The maximum score is : " + result);
    }
}
