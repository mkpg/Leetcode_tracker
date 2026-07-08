# Last updated: 7/8/2026, 4:45:59 PM
class Solution:
    def concatWithReverse(self, nums: list[int]) -> list[int]:
        # a = nums[::-1]
        return nums + nums[::-1]