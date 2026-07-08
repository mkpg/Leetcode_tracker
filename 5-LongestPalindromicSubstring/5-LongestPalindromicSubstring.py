# Last updated: 7/8/2026, 4:50:33 PM
class Solution(object):
    def longestPalindrome(self, s):

        if len(s) == 1:
            return s

        for l in range(len(s), 0, -1):

            for i in range(len(s) - l + 1):

                sub = s[i:i+l]

                if sub == sub[::-1]:
                    return sub