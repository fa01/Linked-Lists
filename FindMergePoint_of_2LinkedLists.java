/*
 Insert Node at the end of a linked list
 head pointer input could be NULL as well for empty list
 Node is defined as
 class Node {
 int data;
 Node next;
 }
 */
int FindMergeNode(Node headA, Node headB) {
Node a = headA;
Node b = headB;

while (a != b){
if (a.next == null){
a = headB;
}
else{
a = a.next;
}
if (b.next == null){
b = headA;
}
else{
b = b.next;
}
}
return a.data;
}
