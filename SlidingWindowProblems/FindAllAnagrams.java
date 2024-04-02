import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllAnagrams {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> check = new HashMap<>();
        for(int i=0; i<p.length();i++){
            map.put(p.charAt(i), map.getOrDefault(p.charAt(i), 0)+1);
        }
        for(int i=0; i<p.length(); i++){
            check.put(s.charAt(i), check.getOrDefault(s.charAt(i),0 )+1);
        }

        if(map.equals(check)==true){
            result.add(0);
        }
        int count = s.length()-p.length();
        for(int i=0;i<count;i++)
        {
            int val=check.get(s.charAt(i));
            if(val==1)
            {
                check.remove(s.charAt(i));
            }
            else
            {
                check.put(s.charAt(i),val-1);
            }
            check.put(s.charAt(i+p.length()),check.getOrDefault(s.charAt(i+p.length()), 0)+1);
            System.out.println(check);
             if(check.equals(map)==true)
                 result.add(i+1);
        }

        return result;
    }

    public static void main(String[] args) {
        FindAllAnagrams solution = new FindAllAnagrams();
        List<Integer> result = new ArrayList<>();
        String s = "cbaebabacd";
        String p = "abc";
        result = solution.findAnagrams(s,p);
        for(int i : result){
            System.out.println(i);
        }
    }

}
