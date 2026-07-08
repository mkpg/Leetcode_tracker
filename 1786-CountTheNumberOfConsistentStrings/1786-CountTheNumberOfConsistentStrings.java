// Last updated: 7/8/2026, 4:46:43 PM
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> a = new HashSet<>();
        for(char al:allowed.toCharArray()){
            a.add(al);
        }
        int cnt = 0 ;
        for(String st:words){
            boolean cns = true;
            for(char c:st.toCharArray()){
                if(!a.contains(c)){cns=false;break;}
            }
            if(cns) cnt++;
        }return cnt;
    }
}