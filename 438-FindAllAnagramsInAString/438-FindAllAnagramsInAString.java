// Last updated: 7/8/2026, 4:47:48 PM
import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String str, String anagram) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = anagram.length();
        for (int i = 0; i <= str.length() - n; i++) { 
            boolean x = is_anagram(i, i + n, str, anagram); 
            if (x == true) list.add(i);
        }
        
        return list;
    }
    public static boolean is_anagram(int start, int end, String str, String anagram) {
        int[] arr = new int[26];
                for (int i = 0; i < anagram.length(); i++) {
            arr[anagram.charAt(i) - 'a']++;
        }
                for (int i = start; i < end; i++) {
            arr[str.charAt(i) - 'a']--;
        }
                for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) return false;
        }
        
        return true;
    }
}
