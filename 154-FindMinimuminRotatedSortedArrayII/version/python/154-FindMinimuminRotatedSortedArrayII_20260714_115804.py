# Last updated: 7/14/2026, 11:58:04 AM
1class Solution:
2    def minMoves(self, nums: List[int]) -> int:
3        mn = min(nums)
4        m = 0
5
6        for num in nums:
7            m += num - mn
8
9        return m