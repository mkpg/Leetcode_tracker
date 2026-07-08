// Last updated: 7/8/2026, 4:50:27 PM
import java.util.*;
class Solution {
    public int romanToInt(String s) {
    
    HashMap<Character,Integer> map = new HashMap<>();
    map.put('I',1);
    map.put('V',5);
    map.put('X',10);
    map.put('L',50);
    map.put('C',100);
    map.put('D',500);
    map.put('M',1000);
    int currentval;int result=0;int prevval=0;
    for(int i=s.length()-1;i>=0;i--){
        currentval = map
.get(s.charAt(i));

        if(currentval<prevval){
            result = result-currentval;
        }
        else{
            result=result+currentval;
        }
        prevval = currentval;
    }
    return result;
    }
    
        
}