import java.util.SortedSet;
import java.util.TreeSet;

public class Find_the_Union {

    public int[] unionArray(int[] nums1, int[] nums2) {
        SortedSet<Integer> set = new TreeSet<>();

        for (int num : nums1)
            set.add(num);
        for (int num : nums2)
            set.add(num);

        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set)
            result[index++] = num;

        return result;
    }

}
