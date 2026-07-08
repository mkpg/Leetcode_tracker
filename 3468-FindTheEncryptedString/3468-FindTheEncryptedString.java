// Last updated: 7/8/2026, 4:46:02 PM
class Solution {
    public String getEncryptedString(String s, int k) {
        // String str ;
        char[] arr = new char[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i);
        }
        char[] arr2 = new char[s.length()];
        for(int i=0;i<s.length();i++){
            arr2[i]=arr[(i+k)%s.length()];
        }
        // for(int i=0;i<s.length();i++){
        //     System.out.print(arr2[i]);
        // }
        String a =new String(arr2);
        return a;
        
    }
    
}