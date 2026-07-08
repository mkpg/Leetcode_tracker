// Last updated: 7/8/2026, 4:48:02 PM
class Solution {
    public int firstUniqChar(String s) {
        char[] a = s.toCharArray();
       
        for(int i=0;i<a.length;i++){
             int flag = 0;
            for(int j = 0;j<a.length;j++){
                if(i != j && a[i]==a[j]){flag=1;break;}
            }
            if(flag==0)return i;
            
        }return -1;
    }
}