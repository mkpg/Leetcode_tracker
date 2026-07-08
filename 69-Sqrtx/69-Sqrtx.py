# Last updated: 7/8/2026, 4:49:47 PM
class Solution:
    def mySqrt(self, x: int) -> int:
        if x < 2:
            return x
        l,r = 0,x//2
        while  l <= r:
            m = l + (r-l)//2
            sq = m*m
            if sq == x:
                return m
            elif sq<x:
                l = m+1
            elif sq>x:
                r = m-1
        return r