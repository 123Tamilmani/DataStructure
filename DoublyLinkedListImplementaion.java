import java.nio.channels.NetworkChannel;

class DoublyLinkedList{
    Node head;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    void add(int data){
        Node newNode = new Node(data);
        if(head == null) head = newNode;
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            Node temp = current;
            temp.next = newNode;
            newNode.prev = temp;
            newNode.next = null;
        }
    }

    void addatfirst(int data){
        Node newNode = new Node(data);
        if(head == null) head = newNode;
        else{
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
            head.prev = null;
        }
    }

    void addatmiddle(int pos, int data){
        Node newNode = new Node(data);
        if(head == null) head = newNode;
        else{
            Node current = head;
            for(int i = 0;i<pos;i++){
                current = current.next;
            }
            newNode.next = current;
            newNode.prev = current.prev;
            current.prev.next = newNode;
            current.prev = newNode;
        }
    }

    void delete(){
        if(head == null) return;
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.prev.next = null;
    }

    void deleteatfirst(){
        if(head == null) return;
        head = head.next;
        head.prev = null;
    }

    void deleteatmiddle(int pos){
        if(head == null) return;
        Node current = head;
        for(int i = 0;i<pos - 2;i++){
            current = current.next;
        }
        current.next = current.next.next;
        current.next.next.prev = current;
    }

    void display(){
        if(head == null) return;
        Node current = head;
        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("NULL");
    }
}

public class DoublyLinkedListImplementaion {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.add(10);
        dll.add(20);
        dll.add(30);
        dll.add(40);
        dll.add(50);
        dll.display();

        dll.delete();
        dll.display();

        dll.addatfirst(100);
        dll.display();

        dll.deleteatfirst();
        dll.display();

        dll.addatmiddle(2, 200);
        dll.display();

        dll.deleteatmiddle(4);
        dll.display();
    }    
}
