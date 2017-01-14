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

Node SortedInsert(Node head,int data) {
if (head == null){
Node nodeToInsert = new Node();
nodeToInsert.data = data;
return nodeToInsert;
}
else if (data < head.data){
Node nodeToInsert = new Node();
nodeToInsert.data = data;
nodeToInsert.next = head;
head.prev = nodeToInsert;
return nodeToInsert;
}
else{
Node restOfNodes = SortedInsert(head.next, data);
head.next = restOfNodes;
restOfNodes.prev = head;
return head;
}
}