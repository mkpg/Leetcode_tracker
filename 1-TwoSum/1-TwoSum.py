# Last updated: 7/8/2026, 4:50:39 PM
class Solution(object):
    def twoSum(self, nums, target):
        tgn = {}
        for i in range(len(nums)):
            cnum = nums[i]

            if cnum in tgn:
                return [tgn[cnum],i]
            com = target - cnum
            tgn[com] = i