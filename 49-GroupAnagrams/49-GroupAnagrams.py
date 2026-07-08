# Last updated: 7/8/2026, 4:49:57 PM
class Solution:
    def groupAnagrams(self, a: List[str]) -> List[List[str]]:
        s = {}
        for i in a:
            st = "".join(sorted(i))
            if st not in s:
                s[st] = []
            s[st].append(i)
        return list(s.values())