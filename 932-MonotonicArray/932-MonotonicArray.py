# Last updated: 7/8/2026, 4:47:11 PM
class Solution:
    def isMonotonic(self, nums: List[int]) -> bool:
        increasing = True
        decreasing = True

        for i in range(len(nums) - 1):
            if nums[i] < nums[i + 1]:
                decreasing = False
            elif nums[i] > nums[i + 1]:
                increasing = False

        return increasing or decreasing