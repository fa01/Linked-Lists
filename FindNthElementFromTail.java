/*
 Get Nth element from the end in a linked list of integers
 Number of elements in the list will always be greater than N.
 Node is defined as
 class Node {
 int data;
 Node next;
 }
 */

boolean done = false;
boolean nIsZeroCheck = false;

int GetNode(Node head,int n) {
// This is a "method-only" submission.
// You only need to complete this method.

//System.out.println("n at beginning is "+n);
if (head == null){
//System.out.println("null");
return -1;
}
else{
//System.out.println("head.data is "+head.data);
int answer = GetNode(head.next, n);

//System.out.println("answer = "+answer +" and head.data is = "+head.data);
if (answer == 0 || nIsZeroCheck == true){
if (done == true || nIsZeroCheck == true){
//System.out.println("ansewr is "+answer);
return answer;
}
else{
//System.out.println("FINALLY");
//System.out.println("if  ");
//System.out.println("head.data is = "+head.data);
done = true;
return head.data;
}
}

else{
//System.out.println("else  ");
//System.out.println("answer is = "+answer);
//System.out.println("n is = "+n);

if (answer == -1 && head.next == null){
if (n == 0){
//System.out.println("AHLDLK");
//System.out.println("this head.data = "+head.data);
nIsZeroCheck = true;
return head.data;
}
else{
//System.out.println("if");
n--;
//System.out.println("n is = "+n);
return n;
}
}
else{
//System.out.println("else");
if (done == false){
//System.out.println("glob = "+glob);
answer--;
return answer;
}
else{
//System.out.println("glob = "+glob);
return answer;
}

}
}

}
}