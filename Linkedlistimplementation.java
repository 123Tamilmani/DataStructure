// import java.util.*;
class Linkedlist
{
    Node head;
    public class Node
    {
        private int data;
        private Node next;
        Node(int data)
        {
            this.data = data;
        }
    }

    //Add method // Defaultly adding at the end
    public void add(int data)
    {
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    //Delete
    public void delete(){
        if(head == null) return;
        Node current = head;
        if(current.next == null){
            head = null;
            // head = head.next;
        }
        else{
            while(current.next.next != null){
                current = current.next;
            }
            current.next = null;
            // System.out.println(head.next.data);
        }
    }

    //Add at First method
    public void addatfirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            head = newNode;
            head.next = temp;
        }
    }

    //Delete at First
    public void deleteatfirst(){
        if(head == null) return;
        head = head.next;
    }

    //Add at any position
    public void addatpos(int pos,int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node current = head;
            for(int i =0;i<pos-1;i++){
                current = current.next;
            }
            Node temp = current.next;
            current.next = newNode;
            newNode.next = temp;
        }
    }

    //Delete at any position
    public void deleteatpos(int pos){
        Node current = head;
        for(int i = 0;i<pos-2;i++){
            current = current.next;
        }
        // if(current.next == null) return;
         current.next = current.next.next;
    }

    //Display method to display LinkedList
    public void display()
    {
        if(head == null) return;
        else{
            Node current = head;
            while(current != null){
                System.out.print(current.data + "-->");
                current = current.next;            
            }
            System.out.println("null");
        }
    }

    //Reverse
    public void reverse(){
        Node prev = null;
        Node next = null;
        Node current = head;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
}
public class Linkedlistimplementation{
    public static void main(String args[])
    {
        Linkedlist li = new Linkedlist();
        li.add(10);
        li.add(20);
        // li.add(30);
        // li.add(40);

        // System.out.println("Add at First");
        // li.addatfirst(50);
        li.display();

        // System.out.println("Add at pos");
        // li.addatpos(2, 100);
        // li.display();

        // System.out.println("Delete at First");
        // li.deleteatfirst();
        // li.display();

        // System.out.println("Delete at pos");
        // li.deleteatpos(3);
        // li.display();

        // System.out.println("Delete at End");
        li.delete();
        li.display();
        System.out.println("Hi");

        // System.out.println("Reverse");
        // li.reverse();
        // li.display();
    }
}


// OUTPUT

// Add at First
// 50-->10-->20-->30-->40-->null
// Add at pos
// 50-->10-->100-->20-->30-->40-->null
// Delete at First
// 10-->100-->20-->30-->40-->null
// Delete at pos
// 10-->100-->30-->40-->null
// Delete at End
// 10-->100-->30-->null
// Reverse
// 30-->100-->10-->null