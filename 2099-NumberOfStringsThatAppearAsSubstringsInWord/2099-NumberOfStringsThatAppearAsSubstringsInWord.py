# Last updated: 7/8/2026, 4:46:35 PM
class Solution:
    def numOfStrings(self, a: List[str], b: str) -> int:
        cn = 0 
        for i in a:
            if i in b:
                cn+=1
        return cn