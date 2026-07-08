// Last updated: 7/8/2026, 4:50:16 PM
class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();
        for(char i:s.toCharArray()) {
            if(i=='('||i=='{'||i=='['){
                st.push(i);}
                else {
                if(!st.empty()){
                    if(i==')'&&st.pop()!='('){
                        return false;
                    }
                    if(i=='}'&&st.pop()!='{'){
                        return false;
                    }
                    if(i==']'&&st.pop()!='['){
                        return false;
                    }
                }
                else return false;
            }}
        
        if(st.empty()) return true;
        return false;}
                    
                }
            
        
        // while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
        //     s = s.replace("()", "");
        //     s = s.replace("{}", "");
        //     s = s.replace("[]", "");
        // }
        // return s.isEmpty();
//     }
// }
