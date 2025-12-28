public class EX_28Linked_List {

    // Head → first node, Tail → last node
    public static Node head;
    public static Node tail;
    public static int size; // keeps track of number of nodes

    // ================= NODE STRUCTURE =================
    public static class Node {
        int data; // value stored in node
        Node next; // reference to next node

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // ================= ADD AT BEGINNING =================
    // Time Complexity: O(1)
    public void addFirst(int data) {
        System.out.println("\n[ADD FIRST] Adding " + data);

        Node newNode = new Node(data);
        size++;

        // If list is empty
        if (head == null) {
            head = tail = newNode;
            System.out.println("List was empty → head & tail point to " + data);
            return;
        }

        // Link new node before current head
        newNode.next = head;
        head = newNode;

        System.out.println("New head is " + data);
    }

    // ================= ADD AT END =================
    // Time Complexity: O(1)
    public void addLast(int data) {
        System.out.println("\n[ADD LAST] Adding " + data);

        Node newNode = new Node(data);
        size++;

        // If list is empty
        if (head == null) {
            head = tail = newNode;
            System.out.println("List was empty → head & tail point to " + data);
            return;
        }

        // Attach new node after tail
        tail.next = newNode;
        tail = newNode;

        System.out.println("New tail is " + data);
    }

    // ================= ADD AT SPECIFIC INDEX =================
    // Time Complexity: O(n)
    public void addRandom(int index, int data) {
        System.out.println("\n[ADD AT INDEX] Adding " + data + " at index " + index);

        // Boundary check
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }

        // Insert at beginning
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int idx = 0;

        // Traverse till (index - 1)
        while (idx < index - 1) {
            temp = temp.next;
            idx++;
        }

        // Adjust links
        newNode.next = temp.next;
        temp.next = newNode;

        // Update tail if inserted at last position
        if (newNode.next == null) {
            tail = newNode;
        }

        System.out.println("Inserted " + data + " at index " + index);
    }

    // ================= REMOVE FIRST =================
    // Time Complexity: O(1)
    public void removeFirst() {
        System.out.println("\n[REMOVE FIRST]");

        if (size == 0) {
            System.out.println("List is empty, nothing to remove");
            return;
        }

        if (size == 1) {
            System.out.println("Removing only element: " + head.data);
            head = tail = null;
            size--;
            return;
        }

        System.out.println("Removing element: " + head.data);
        head = head.next;
        size--;
    }

    // ================= REMOVE LAST =================
    // Time Complexity: O(n)
    public void removeLast() {
        System.out.println("\n[REMOVE LAST]");

        if (size == 0) {
            System.out.println("List is empty, nothing to remove");
            return;
        }

        if (size == 1) {
            System.out.println("Removing only element: " + head.data);
            head = tail = null;
            size--;
            return;
        }

        Node prev = head;

        // Traverse till second last node
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        System.out.println("Removing element: " + tail.data);
        prev.next = null;
        tail = prev;
        size--;
    }

    // ================= SEARCH ELEMENT =================
    // Time Complexity: O(n)
    public void searchData(int data) {
        System.out.println("\n[SEARCH] Searching for " + data);

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        int idx = 0;

        while (temp != null) {
            if (temp.data == data) {
                System.out.println("Data found at index " + idx);
                return;
            }
            temp = temp.next;
            idx++;
        }

        System.out.println("Data not found");
    }

    // ================= PRINT LIST =================
    public void printList() {
        System.out.println("\n[PRINT LIST]");

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println("Size = " + size);
    }

    // ================= MAIN METHOD =================
    public static void main(String[] args) {

        EX_28Linked_List list = new EX_28Linked_List();

        list.addFirst(21);
        list.addFirst(23);
        list.addLast(44);
        list.addLast(666);

        list.printList();

        list.addRandom(0, 90);
        list.printList();

        list.removeFirst();
        list.removeLast();
        list.printList();

        list.searchData(44);
        list.searchData(100);
    }
}
