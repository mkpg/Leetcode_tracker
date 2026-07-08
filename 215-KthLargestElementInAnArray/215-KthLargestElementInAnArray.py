# Last updated: 7/8/2026, 4:48:36 PM
class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        nums.sort()
        return nums[-k]  