# Last updated: 7/8/2026, 4:47:49 PM
class Solution:
    def countSegments(self, s: str) -> int:
        if len(s)==0 or s==" ":
            return 0
        elif len(s)==1:
            return 1

        s+=' '
        d = []
        e = ''
        zz = ["!","@","#","$","%","^","&","*","(",")","_","+","=","-","'",",",".",":"]
        for i in s:
            if i.isdigit():
                e+=i
            elif i.isalpha():
                e+=i
            elif i in zz:
                e+=i
            elif i==' ':
                if e!='':
                    d.append(e)
                    e = ''
            # else:
            #     continue
            
        print(d)
        return len(d)