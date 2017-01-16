/*
 Merge two linked lists
 head pointer input could be NULL as well for empty list
 Node is defined as
 class Node {
 int data;
 Node next;
 }
 */

Node MergeLists(Node headA, Node headB) {
// This is a "method-only" submission.
// You only need to complete this method
Node a = headA;
Node b = headB;
Node temp1 = new Node();
Node temp2 = new Node();
boolean pointer = false;
if (headA == null && headB == null){
return headA;
}
if (headA == null){
return headB;
}
if (headB == null){
return headA;
}
if (headA.data < headB.data){
pointer = true;
}
if (a.next == null && b.next == null){
if (a.data <= b.data){
a.next = b;
return b;
}
else if (b.data < a.data){
b.next = a;
return b;
}
}

else{
while (a != null){
if (a.next != null){
temp1 = a.next;
}
if (b.next != null){
temp2 = b.next;
}
if (a.data <= b.data){
if (a.next == null){
a.next = b;
//System.out.println("LOL");
break;
}
else if (a.next.data > b.data){
/*
 System.out.println("a = "+a.data);
 System.out.println("b = "+b.data);
 System.out.println("a.next before = "+a.next.data);
 */
a.next = b;
//System.out.println("a.next after = "+a.next.data);
a.next.next = temp1;
//System.out.println("a.next.next is = "+a.next.next.data);
a = a.next.next;
b = temp2;
/*
 System.out.println("temp2 is "+temp2.data);
 System.out.println("bye A");
 */
}
else{
a = a.next;
}
}
else if (b.data < a.data){
if (b.next == null){
b.next = a;
break;
}
else if (b.next.data > a.data){
/*
 System.out.println("a = "+a.data);
 System.out.println("b = "+b.data);
 System.out.println("b.next before = "+b.next.data);
 */
b.next = a;
//System.out.println("b.next after = "+b.next.data);
b.next.next = temp2;
//System.out.println("b.next.next is = "+b.next.next.data);
b = b.next.next;
a = temp1;
/*
 System.out.println("temp1 is "+temp1.data);
 System.out.println("bye B");
 */
}
else{
b = b.next;
}
}

}
//System.out.println("bye2");
}

if (pointer == false){
return headB;
}
else{
return headA;
}
}

