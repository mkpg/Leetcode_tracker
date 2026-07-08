# Last updated: 7/8/2026, 4:47:25 PM
class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        total = sum(nums)
        left_sum = 0

        for i, num in enumerate(nums):
            right_sum = total - left_sum - num

            if left_sum == right_sum:
                return i

            left_sum += num

        return -1