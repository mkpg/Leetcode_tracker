// Last updated: 7/8/2026, 4:46:37 PM

class Solution {
    public boolean checkIfPangram(String sentence) {
        for(char i = 'a';i<='z';i++){
            if(!sentence.contains(String.valueOf(i)))return false;
        }
        return true;
    }
}