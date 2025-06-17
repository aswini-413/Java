class Node 
{
    int data;
    Node next;
    Node(int n)
    {
        this.data=n;
        this.next=null;
    }
}
class linkedlist
{
   Node head=null;
   void add(int n)
   {
       Node newnode=new Node(n);
       if(head==null)
       {
           head=newnode;
       }
       else{
           Node curr=head;
           while(curr.next!=null)
           {
               curr=curr.next;
           }
           curr.next=newnode;
       }
   }
   void display()
   {
       Node curr=head;
       while(curr!=null)
       {
           System.out.println(curr.data);
           curr=curr.next;
       }
   }
}
public class Elementsatlast
{
	public static void main(String[] args) {
	Node a=new Node(1);
	Node b=new Node(2);
	Node c=new Node(3);
	a.next=b;
	b.next=c;
	System.out.println(a.data);
	System.out.println(a.next.data);
	System.out.println(a.next.next.data);
	}
}