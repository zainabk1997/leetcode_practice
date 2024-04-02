import java.util.HashSet;
import java.util.Iterator;

public class BinaryCodeOfK {

    public boolean hasAllCodes(String s, int k) {

        // StringBuilder str = new StringBuilder();
        HashSet<String> hset = new HashSet<>();

        // for (int i = 0; i < k; i++) {
        //     str.append(s.charAt(i));
        // }
        // hset.add(str.toString());

        // for (int i = k; i <=s.length()-1; i++) {
        //     str.deleteCharAt(0);
        //     str.append(s.charAt(i));
        //     hset.add(str.toString());
        // }
        // return hset.size() == Math.pow(2, k);

        for(int i=k; i<s.length(); i++){
            hset.add(s.substring(i-k, i));
        }
        Iterator itr = hset.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        return hset.size() == Math.pow(2, k);

    }

    public static void main(String[] args) {
        BinaryCodeOfK solution = new BinaryCodeOfK();
        String s = "00110110";
        int k = 2;
        Boolean result = solution.hasAllCodes(s, k);
        System.out.println(result);
    }

}
