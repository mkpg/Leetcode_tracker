# Last updated: 7/8/2026, 4:47:44 PM
class Solution:
    def checkPerfectNumber(self, num: int) -> bool:
        if num == 1:
            return False

        s = 1  
        i = 2
        while i * i <= num:
            if num % i == 0:
                s += i
                if i != num // i:
                    s += num // i
            i += 1

        return s == num