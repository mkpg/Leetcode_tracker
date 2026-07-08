# Last updated: 7/8/2026, 4:47:58 PM
class Solution:
    def removeKdigits(self, num: str, k: int) -> str:
        st = []
        
        for i in num:
            while st and k>0 and st[-1]>i:
                st.pop()
                k-=1
            st.append(i)
        while k>0:
            st.pop()
            k-=1
        a = ''.join(st).lstrip('0')
        return a if a else '0'