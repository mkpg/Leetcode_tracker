# Last updated: 7/8/2026, 4:48:22 PM
class Solution(object):
    z = 0
    def di(self,a):
        if a%10 == a:
            return a
        z = 0
        while a > 0:
            z = z+a%10
            a = a//10
        return self.di(z)
    def addDigits(self, num):
        return self.di(num)