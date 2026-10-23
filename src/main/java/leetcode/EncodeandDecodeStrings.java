package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeandDecodeStrings {
    public String encode(List<String> strs) {
        // the length of string then : then the string, like 5:teste
        String result = new String();

        for (String str : strs) {
            result += str.length() + ":" + str;
        }

        return result;
    }

    public List<String> decode(String str) {
        var list = new ArrayList<String>();

        int i = 0;
        char[] charsStr = str.toCharArray();

        String number = "";

        for (; i < charsStr.length; i++) {
            if (charsStr[i] == ':') {
                int start = i + 1;
                int end = Integer.decode(number) + start;
                char[] s = Arrays.copyOfRange(charsStr, start, end);

                list.add(new String(s));

                i = end - 1;
                number = "";

                continue;
            }

            number += charsStr[i];
        }

        return list;
    }
}
