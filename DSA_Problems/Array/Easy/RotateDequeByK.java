package Array.Easy;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class RotateDequeByK {
    public static void rotateDeque(Deque<Integer> dq, int type, int k) {
        int n = dq.size();
        if (n == 0) return;

        k = k % n; // effective rotation
        if (k == 0) return;

        // Convert deque to list for easier slicing
        List<Integer> list = new ArrayList<>(dq);
        dq.clear();

        if (type == 1) { // Right rotation
            // last k + first (n-k)
            dq.addAll(list.subList(n - k, n));
            dq.addAll(list.subList(0, n - k));
        } else { // Left rotation
            // from k to end + from 0 to k
            dq.addAll(list.subList(k, n));
            dq.addAll(list.subList(0, k));
        }
    }

    public static void main(String[] args) {
        Deque<Integer> dq = new java.util.ArrayDeque<>();
        dq.add(1);
        dq.add(2);
        dq.add(3);
        dq.add(4);
        dq.add(5);

        int type = 1; // 1 for right rotation, 0 for left rotation
        int k = 2;

        System.out.println("Original Deque: " + dq);
        rotateDeque(dq, type, k);
        System.out.println("Rotated Deque: " + dq);
    }
}
