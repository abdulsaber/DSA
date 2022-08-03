import java.util.HashSet;

public class longestSubString {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(length_SubString(s));
    }

    static int length_SubString(String s) {
        int maxLenght = 0, start = 0, end = 0;
        HashSet<Character> set = new HashSet<>();
        while (end < s.length()) {
            if (!set.contains(s.charAt(end))) {
                set.add(s.charAt(end));
                end++;
                maxLenght = Math.max(maxLenght, set.size());
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }
        return maxLenght;
    }
}
