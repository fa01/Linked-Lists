/*
 Insert Node at the end of a linked list
 head pointer input could be NULL as well for empty list
 Node is defined as
 class Node {
 int data;
 Node next;
 Node prev;
 }
 */

Node Reverse(Node head) {
if (head == null){
return head;
}
Node temp = head.next;
head.next = head.prev;
head.prev = temp;
if (head.prev != null){
return Reverse(head.prev);
}
return head;
}