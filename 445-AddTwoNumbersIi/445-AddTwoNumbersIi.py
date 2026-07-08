# Last updated: 7/8/2026, 4:47:46 PM
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        ar1 = []
        ar2 = []
        while l1:
            ar1.append(l1.val)
            l1 = l1.next      
        
        while l2:
            ar2.append(l2.val)
            l2 = l2.next

        cr = 0
        head = None

        while ar1 or ar2 or cr:
            a = ar1.pop() if ar1 else 0
            b = ar2.pop() if ar2 else 0
            s = (a^b)+((a&b)<<1)
            s += cr
            cr = s//10
            d=s%10
            nd = ListNode(d)
            nd.next = head
            head = nd
        return head