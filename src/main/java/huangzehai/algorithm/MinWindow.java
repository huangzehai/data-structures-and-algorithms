package huangzehai.algorithm;

public class MinWindow {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String minWindow = minWindow(s, t);
        System.out.println(minWindow);
    }

    /**
     * @param s source string
     * @param t target string
     * @return
     */
    public static String minWindow(String s, String t) {
        int[] targetHash = new int[255];
        // 记录目标字符串每个字母出现次数
//        for (int i = 0; i < t.length(); i++) {
//            srcHash[t.charAt(i)]++;
//        }
        t.chars().forEach(c -> targetHash[c]++);

        // 用于记录窗口内每个字母出现次数
        int[] srcHash = new int[255];
        int found = 0;
        int begin = -1, end = s.length(), minLength = s.length();
        for (int start = 0, i = 0; i < s.length(); i++) {
            // 每来一个字符给它的出现次数加1
            srcHash[s.charAt(i)]++;
            // 如果加1后这个字符的数量不超过目标串中该字符的数量，则找到了一个匹配字符
            if (srcHash[s.charAt(i)] <= targetHash[s.charAt(i)]) found++;
            // 如果找到的匹配字符数等于目标串长度，说明找到了一个符合要求的子串
            if (found == t.length()) {
                // 将开头没用的都跳过，没用是指该字符出现次数超过了目标串中出现的次数，并把它们出现次数都减1
                while (start < i && srcHash[s.charAt(start)] > targetHash[s.charAt(start)]) {
                    srcHash[s.charAt(start)]--;//从旧start到新start间，可能有一些匹配的字符，需要将它们的出现次数减一
                    start++;
                }
                // 这时候start指向该子串开头的字母，判断该子串长度
                if (i - start < minLength) {
                    minLength = i - start;
                    begin = start;
                    end = i;
                }

                //探索后面是否有更短的字段匹配
                // 把开头的这个匹配字符跳过，并将匹配字符数减1
                srcHash[s.charAt(start)]--;
                found--;
                // 子串起始位置加1，我们开始看下一个子串了
                start++;
            }
        }
        // 如果begin没有修改过，返回空
        return begin == -1 ? "" : s.substring(begin, end + 1);
    }
}
