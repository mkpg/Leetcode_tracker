# Last updated: 7/8/2026, 4:45:58 PM
class Solution:
    def processStr(self, s: str) -> str:
        
        d = ''
        for i in s:
            if i.isalpha():
                d+=i
            elif i == '*':
                d = d[:-1]
            elif i == '#':
                d = d+d
            elif i == '%':
                d = d[::-1]
        return d