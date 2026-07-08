# Last updated: 7/8/2026, 4:49:03 PM
class Solution:
    def twoSum(self, n: List[int], t: int) -> List[int]:
        l = 0 
        r = len(n)-1
        while l<r:
            s = n[l]+n[r]
            if s == t:
                return [l+1,r+1]
            elif s<t:
                l+=1
            else:
                r-=1