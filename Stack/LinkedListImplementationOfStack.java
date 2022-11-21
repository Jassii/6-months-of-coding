import java.util.*;

//creating a Node class..
class Node
{
    private int data;
    private Node next;
    
    //constructor
    Node(int data)
    {
        this.data=data;
    }
    
    //set the data
    public void setData(int data)
    {
        this.data=data;
    }
    
    //get the data
    public int getData()
    {
        return this.data;
    }
    
    //set next Pointer
    public void setNext(Node next)
    {
        this.next = next;
    }
    
    //get next
    public Node getNext()
    {
        return this.next;
    }
}


//creating a LinkedList class
class LinkedList
{
    private Node head; //will point to the head.
    private Node tail; //will point to the tail.
    
    //get head
    public Node getHead()
    {
        return this.head;
    }
    
    //get tail
    public Node getTail()
    {
        return this.tail;
    }
    
    //insertion at the beginning..
    public void push(int data)
    {
        //create the node
        Node node = new Node(data); //new node will be created..
        
        //if the list is empty.
        if(this.head==null) 
        {
            this.head = this.tail = node;
        }
        else
        {
            node.setNext(this.head); //point the first node to the head node..
            this.head = node; //new node will be the head node..
        }
    }
    
    //delete the element..(removed from the top or we can say from the beginning)
    public void pop()
    {
        //first check if the list is empty or not.
        if(this.head==null)
        {
            System.out.println("Stack is empty..Stack underflow..");
        }
        else
        {
            Node temp = this.head.getNext();
            this.head.setNext(null);
            this.head = temp;
            
            System.out.println("Top element has been removed..");
        }
    }
    
    //get the stack top element
    public void peek()
    {
        //check if the list is empty
        if(this.head==null)
        {
            System.out.println("List is empty..");
        }
        else
        {
            System.out.println("Peek element of the stack is "+this.head.getData());
        }
    }
    
    public void display()
    {
        Node temp = this.head;
        while(temp!=null)
        {
            System.out.print(temp.getData()+" ");
            temp = temp.getNext();
        }
    }
}

class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        list.push(5);
        list.push(1);
        list.push(3);
        list.push(6);
        list.push(8);
        
        list.display();
      //   list.peek(2);
        list.pop();
        list.display();
        list.peek();
        // list.stackTop();
        
    }
}
