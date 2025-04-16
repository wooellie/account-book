#  Grammar basic: arrays, linked lists

 To make an account book in Java, we need to start from data structures like **arrays** and **linked lists.**

##  Arrays in Java

```java
// Arrays in Java

public class ArrayExample {

    public static void main(String[] args) {
        // Initialize an array
        int[] arr = {1, 2, 3, 4, 5};

        // Access elements in an array
        System.out.println("First element: " + arr[0]);
        System.out.println("Second element: " + arr[1]);

        // Modify elements in an array
        arr[2] = 10;
        System.out.print("Modified array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Iterate over an array
        System.out.println("Array elements:");
        for (int i : arr) {
            System.out.println(i);
        }

        // Append an element in an array (Note: Java arrays are fixed size, so we need to create a new array)
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = 6;
        arr = newArr; // Replace the old array with the new one.

        System.out.print("Array after appending: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Remove an element from an array (Note: Similar to appending, we need to create a new array)
        int removeValue = 6;
        int count = 0;
        for (int i : arr) {
            if (i != removeValue) {
                count++;
            }
        }
        int[] finalArr = new int[count];
        int index = 0;
        for(int i : arr){
            if(i != removeValue){
                finalArr[index] = i;
                index++;
            }
        }

        arr = finalArr;

        System.out.print("Array after removing: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
```

## linklist

```java
// Linked List in Java

public class LinkedListExample {

    // Linked List in Java
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

        LinkedList() {
            this.head = null;
        }

        void append(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }

        void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        // Create a linked list and append elements
        LinkedList ll = new LinkedList();
        ll.append(1);
        ll.append(2);
        ll.append(3);

        // Display the linked list
        ll.display();
    }
}

```

