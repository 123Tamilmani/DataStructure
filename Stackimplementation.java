class Stack{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    void push(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    void pop(){
        if(head == null) return;
        System.out.println(head.data);
        head = head.next;
    }

    void peek(){
        if(head == null) return;
        System.out.println(head.data);
    }

    void reverse(){
        if(head == null) return;
        Node prev = null;
        Node next = null;
        while(head != null){
            next = head.next;
            head.next = prev;
            prev  = head;
            head = next;
        }
        head = prev;
    }

    void display(){
        Node current = head;
        if(head == null) return;
        System.out.print("NULL");
        while(current != null)
        {
            System.out.print("<--" + current.data);
            current = current.next;
        }
        System.out.println();
    }
}

public class Stackimplementation {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("DISPLAY method");
        stack.display();

        System.out.println("POP method");
        stack.pop();

        stack.display();

        System.out.println("PEEK method");
        stack.peek();

        System.out.println("REVERSE method");
        stack.reverse();

        stack.display();

    }
}

// //output

// DISPLAY method
// NULL<--40<--30<--20<--10
// POP method
// 40
// NULL<--30<--20<--10
// PEEK method
// 30
// REVERSE method
// NULL<--10<--20<--30