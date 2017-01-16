/*
 Reverse a linked list and return pointer to the head
 The input list will have at least one element
 Node is defined as
 class Node {
 int data;
 Node next;
 }
 */
// This is a "method-only" submission.
// You only need to complete this method.
Node Reverse(Node head) {

/* We have two conditions in this if statement.
 This first condition immediately returns null
 when the list is null. The second condition returns
 the final node in the list. That final node is sent
 into the "remaining" Node below.
 -----------------------------------------------------*/

if (head == null || head.next == null) {
return head;
}

/* When the recursion creates the stack for A -> B -> C
 (RevA(RevB(RevC()))) it will stop at the last node and
 the recursion will end, beginning the unraveling of the
 nested functions from the inside, out.
 -----------------------------------------------------*/

Node remaining = Reverse(head.next);

/* Now we have the "remaining" node returned and accessible
 to the node prior. This remaining node will be returned
 by each function as the recursive stack unravels.
 
 Assigning head to head.next.next where A is the head
 and B is after A, (A -> B), would set B's pointer to A,
 reversing their direction to be A <- B.
 -----------------------------------------------------*/

head.next.next = head;

/* Now that those two elements are reversed, we need to set
 the pointer of the new tail-node to null.
 -----------------------------------------------------*/

head.next = null;

/* Now we return remaining so that remaining is always
 reassigned to itself and is eventually returned by the
 first function call.
 -----------------------------------------------------*/

return remaining;
}