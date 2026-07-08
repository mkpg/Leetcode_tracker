# Last updated: 7/8/2026, 4:48:08 PM
class Solution:
    def reverseString(self, s: List[str]) -> None:
        l = 0 
        r = len(s)-1
        while l<r:
            s[l],s[r]=s[r],s[l]
            l+=1
            r-=1        