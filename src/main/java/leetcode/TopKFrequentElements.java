package leetcode;

import java.util.ArrayList;
import java.util.Hashtable;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        // first count the frequency

        // store the number and frequency
        Hashtable<Integer, Integer> map = new Hashtable<>();

        for (int n : nums) {
            map.putIfAbsent(n, 0);

            map.put(n, map.get(n) + 1);
        }

        // second sort from most frequent
        ArrayList<int[]> frequencyArray = new ArrayList<>();
        map.forEach((t, u) -> frequencyArray.add(new int[] { t, u }));

        frequencyArray.sort((o1, o2) -> Integer.compare(o2[1], o1[1]));

        // third return the top K

        return frequencyArray.stream().limit(k).mapToInt(t -> t[0]).toArray();
    }
}