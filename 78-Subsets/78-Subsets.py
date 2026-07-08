# Last updated: 7/8/2026, 4:49:40 PM
class Solution(object):
    def subsets(self, nums):
        s = [[]]
        for i in range(len(nums)):
            c = []
            for j in range(len(s)):
                c.append(s[j] + [nums[i]])
            s.extend(c)
        return s