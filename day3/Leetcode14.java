public class Leetcode14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        String prefix = "";
        int k = 0;

        while (true) {
            if (k >= strs[0].length())
                return prefix; // base string end
            char ch = strs[0].charAt(k); // pick character from first word

            for (int i = 1; i < strs.length; i++) {
                if (k >= strs[i].length() || strs[i].charAt(k) != ch) {
                    return prefix;
                }
            }

            prefix += ch; // if all match, append
            k++; // move to next character
        }
    }

}
