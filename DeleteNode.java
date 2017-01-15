/*
 Insert Node at a given position in a linked list
 head can be NULL
 First element in the linked list is at position 0
 Node is defined as
 class Node {
 int data;
 Node next;
 }
 */


Node InsertNth(Node head, int data, int position) {
// This is a "method-only" submission.
// You only need to complete this method.
Node newNode = new Node();
newNode.data = data;
if (head == null){
head = new Node();
head.data = data;
head.next = null;
}

if (position == 0){
newNode.next = head;
return newNode;
}

else {
int ctr=0;

Node temp1 = head;

while(ctr < position-1 && temp1 !=null){
temp1=temp1.next;
ctr++;
}

Node temp2= temp1.next;

temp1.next=newNode; // temp1's pointer is assinged n;
newNode.next=temp2; // n's pointer is assinged temp2

return head;

}
}

