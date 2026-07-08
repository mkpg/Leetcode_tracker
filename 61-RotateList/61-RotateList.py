# Last updated: 7/8/2026, 4:49:51 PM
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    
    def rotateRight(self, head, k):
        if head is None or head.next is None:
            return head

        cn = 1 
        temp = head
        while temp.next!=None:
            cn+=1
            temp = temp.next
        
        temp.next = head
        if cn<=k:
            k%=cn
            temp = head
        else:
            temp = head

        for i in range(cn - k - 1):
            temp = temp.next

        new_head = temp.next

        temp.next = None

        return new_head        
        # # ___________________
        # rot_v = abs(k - leng(head))
        # # ___________________
        # cn = 0
        # temp = head
        # while cn < rot_v-1:
        #     cn+=1
        #     temp = temp.next
        # # print(temp.val)
        # zept = temp.next
        # while zept != None:
        #     # print(zept.val)
        #     zept = zept.next
        # zept = head
        # cn = 0
        # temp = head
        # while cn < rot_v-1:
        #     cn+=1
        #     temp = temp.next
        #     zept.next = temp 
        # print(zept.val)