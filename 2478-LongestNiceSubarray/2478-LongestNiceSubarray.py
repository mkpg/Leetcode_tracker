# Last updated: 7/8/2026, 4:46:18 PM
class Solution(object):
    def longestNiceSubarray(self, z):
        left = 0
        mask = 0 
        ma = 0
        for right in range(len(z)):
            while mask & z[right]:
                mask=mask^z[left]
                left = left+1
            mask = mask | z[right]
            ma = max(ma,right-left+1)
        return ma

        