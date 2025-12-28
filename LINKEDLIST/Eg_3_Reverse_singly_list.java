import java.util.Scanner;

public class Eg_3_Reverse_singly_list {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of elements in the list:");
        int n = in.nextInt();

        // Dummy head to simplify list creation
        ListNode head = new ListNode();
        ListNode dummy = head;

        // Create linked list
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter element " + i + ":");
            int data = in.nextInt();
            ListNode temp = new ListNode(data);
            dummy.next = temp;
            dummy = temp;
        }

        // Reverse the list (real head is head.next)
        ListNode reversedHead = reverseList(head.next);

        // Print reversed list
        System.out.println("Reversed Linked List:");
        printList(reversedHead);

        in.close();
    }

    // Reverse linked list (creates new nodes)
    public static ListNode reverseList(ListNode head) {

        ListNode ans = null;

        while (head != null) {
            ListNode temp = new ListNode(head.val);
            temp.next = ans;
            ans = temp;
            head = head.next;
        }
        return ans;
    }

    // Print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }
}

// ListNode class
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
