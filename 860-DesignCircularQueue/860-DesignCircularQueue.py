# Last updated: 7/8/2026, 4:47:14 PM
class box:
    def __init__(self, value):
        self.value = value
        self.next = None


class MyCircularQueue(object):

    def __init__(self, k):
        self.head = None
        self.tail = None
        self.size = k
        self.count = 0

    def enQueue(self, value):

        if self.isFull():
            return False

        new_node = box(value)

        if self.head is None:
            self.head = new_node
            self.tail = new_node

        else:
            self.tail.next = new_node
            self.tail = new_node

        self.count += 1
        return True

    def deQueue(self):

        if self.isEmpty():
            return False

        self.head = self.head.next

        if self.head is None:
            self.tail = None

        self.count -= 1
        return True

    def Front(self):

        if self.isEmpty():
            return -1

        return self.head.value

    def Rear(self):

        if self.isEmpty():
            return -1

        return self.tail.value

    def isEmpty(self):

        return self.count == 0

    def isFull(self):

        return self.count == self.size