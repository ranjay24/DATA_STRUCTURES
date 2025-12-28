import java.util.Scanner;

public class Eg_1_Add_Two_Numbers {

    // Method to add two numbers represented by linked lists
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode ans = new ListNode(0); // dummy node
        ListNode temp = ans;
        int carry = 0;

        // loop until both lists are finished
        while (l1 != null || l2 != null) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10; // calculate carry
            sum = sum % 10; // digit to store

            temp.next = new ListNode(sum);
            temp = temp.next;
        }

        // if carry is left after last addition
        if (carry > 0) {
            temp.next = new ListNode(carry);
        }

        return ans.next; // skip dummy node
    }

    // Helper method to create linked list from user input
    public static ListNode createList(Scanner sc, int n) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            temp.next = new ListNode(val);
            temp = temp.next;
        }
        return dummy.next;
    }

    // Helper method to print linked list
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

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of nodes in first linked list:");
        int n1 = sc.nextInt();

        System.out.println("Enter digits of first number (reverse order):");
        ListNode l1 = createList(sc, n1);

        System.out.println("Enter number of nodes in second linked list:");
        int n2 = sc.nextInt();

        System.out.println("Enter digits of second number (reverse order):");
        ListNode l2 = createList(sc, n2);

        Eg_1_Add_Two_Numbers obj = new Eg_1_Add_Two_Numbers();
        ListNode result = obj.addTwoNumbers(l1, l2);

        System.out.println("Result Linked List:");
        printList(result);

        sc.close();
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
