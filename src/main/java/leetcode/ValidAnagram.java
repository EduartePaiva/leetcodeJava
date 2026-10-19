package leetcode;

import java.util.Hashtable;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Hashtable<Byte, Integer> map = new Hashtable<Byte, Integer>();

        byte[] ss = s.getBytes();
        byte[] tt = t.getBytes();
        for (int i = 0; i < s.length(); i++) {
            addToTable(map, ss[i], 1);
            addToTable(map, tt[i], -1);
        }

        return map.values().stream().allMatch(v -> v == 0);
    }

    private void addToTable(Hashtable<Byte, Integer> map, byte key, int value) {
        Integer quantity = map.get(key);
        if (quantity == null) {
            quantity = 0;
        }
        quantity += value;
        map.put(key, quantity);
    }
}
