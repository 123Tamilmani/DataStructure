class Queue{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    void enqueue(int data){
        Node newNode = new Node(data);
        if(head == null) head = newNode;
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        } 
    }

    void dequeue(){
        if(head == null) return;
        System.out.println(head.data);
        head = head.next;
    }

    void peek(){
        System.out.println(head.data);
    }

    void reverse(){
        if(head == null) return;
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

    void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("NULL");
    }
}

public class Queueimplementation {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println("DISPLAY function");
        queue.display();

        System.out.println("DEQUEUE function");
        queue.dequeue();

        System.out.println("PEEK function");
        queue.peek();
        
        System.out.println("REVERSE function");
        queue.reverse();
        queue.display();
    }
}


// // output

// DISPLAY function
// 10-->20-->30-->40-->50-->NULL
// DEQUEUE function
// 10
// PEEK function
// 20
// REVERSE function
// 50-->40-->30-->20-->NULL