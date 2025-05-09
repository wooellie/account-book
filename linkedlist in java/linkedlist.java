public class linkedlist{
  //ask questions about memory
  //define a linkedlist
  static class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
      this.next = null;
    }
  }
  static class LinkedList{
    //node head as null
    Node head;
    LinkedList(){
      this.head = null;
    }
    void append(int data){
      Node newNode = newNode(data);
      if(head == null){
        head = newNode;
        return;
      }
      Node last = head;
      while(head.next != null){
        last = last.next;
      }
      last.next = newNode;
    }



  }

}