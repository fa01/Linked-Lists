/*
 Delete Node at a given position in a linked list
 head pointer input could be NULL as well for empty list
 Node is defined as
 class Node {
 int data;
 Node next;
 }
 */
// This is a "method-only" submission.
// You only need to complete this method.

Node Delete(Node head, int position) {
// Complete this method
Node current = head;
if (position == 0){
if (head.next != null){
head = head.next;
return head;
}
}
else{
int count = 0;
while(current.next != null){
if(count == position-1){
Node temp=current.next.next;
current.next=temp;
break;
}
current = current.next;
count++;
}
}
return head;
}