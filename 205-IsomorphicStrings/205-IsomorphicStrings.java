// Last updated: 7/8/2026, 4:48:40 PM
class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        for(int i=0;i<a.length;i++){
            char ch1=a[i];
            char ch2=b[i];
            int cn1= 0;
            int cn2 =0;
            for(int j=i+1;j<a.length;j++){
                if(ch1==a[j]) cn1++;
                if(ch2==b[j]) cn2++;
                if(cn1!=cn2) return false;
            }
        }
        return true;
        












        //  char[] a = s.toCharArray();
        // char[] b = t.toCharArray();
        // int f = 0;
        // int g = 0;
        // for(int i=0;i<a.length-1;i++){
        //     for(int j=1;j<a.length;j++){
        //     if(a[i]==a[j]) f++;
        // }}
        // for(int i=0;i<b.length-1;i++){
        //     for(int j=1;j<b.length;j++){
        //     if(b[i]==b[j]) g++;
        // }}
        // if(f==g)return true;
        // else return false;


        // char[] a = s.toCharArray();
        // char[] b = t.toCharArray();
        // int f = 0;
        // int g = 0;
        // for(int i=0,j=1;i<a.length-1 && i<a.length;i++,j++){
        //     if(a[i]==a[j]) f++;
        // }
        // for(int i=0,j=1;i<b.length-1 && i<b.length;i++,j++){
        //     if(b[i]==b[j]) g++;
        // }
        // if(f==g)return true;
        // else return false;
    }
}