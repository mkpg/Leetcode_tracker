# Last updated: 7/8/2026, 4:48:15 PM
class Solution(object):
    def lengthOfLIS(self, nums):
        lis = []

        for num in nums:
            left, right = 0, len(lis)

            while left < right:
                mid = (left + right) // 2

                if lis[mid] < num:
                    left = mid + 1
                else:
                    right = mid

            if left == len(lis):
                lis.append(num)
            else:
                lis[left] = num

        return len(lis)