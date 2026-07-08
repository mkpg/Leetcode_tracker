# Last updated: 7/8/2026, 4:48:23 PM
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False
        for i in set(s):
            if s.count(i)!=t.count(i):
                return False
        return True