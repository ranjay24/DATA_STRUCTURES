import java.util.Scanner;

public class Eg_2_Merge_Two_Sorted_LL {

    // Method to merge two sorted linked lists
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode ans = new ListNode(0); // dummy node
        ListNode temp = ans;

        // loop until both lists become null
        while (list1 != null || list2 != null) {

            // when both lists have nodes
            if (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    temp.next = new ListNode(list1.val);
                    list1 = list1.next;
                } else {
                    temp.next = new ListNode(list2.val);
                    list2 = list2.next;
                }
                temp = temp.next;
            }

            // when first list is empty
            else if (list1 == null && list2 != null) {
                temp.next = new ListNode(list2.val);
                temp = temp.next;
                list2 = list2.next;
            }

            // when second list is empty
            else {
                temp.next = new ListNode(list1.val);
                temp = temp.next;
                list1 = list1.next;
            }
        }

        return ans.next; // skip dummy node
    }

    // Helper method to create a linked list from user input
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

    // Helper method to print a linked list
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

        // Input for first sorted linked list
        System.out.println("Enter number of nodes in first sorted linked list:");
        int n1 = sc.nextInt();
        System.out.println("Enter elements in sorted order:");
        ListNode list1 = createList(sc, n1);

        // Input for second sorted linked list
        System.out.println("Enter number of nodes in second sorted linked list:");
        int n2 = sc.nextInt();
        System.out.println("Enter elements in sorted order:");
        ListNode list2 = createList(sc, n2);

        // Merge operation
        Eg_2_Merge_Two_Sorted_LL obj = new Eg_2_Merge_Two_Sorted_LL();
        ListNode mergedList = obj.mergeTwoLists(list1, list2);

        // Output result
        System.out.println("Merged Sorted Linked List:");
        printList(mergedList);

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
