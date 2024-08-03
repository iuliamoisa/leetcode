/*
o varianta ar fi fost cu kmp; altfel:
 sliding window technique
*/

class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        
        int haystackLen = haystack.length();
        int needleLen = needle.length();

        if (needleLen > haystackLen) {
            return -1;
        }
        
        for (int i = 0; i <= haystackLen - needleLen; i++) {
            if (haystack.substring(i, i + needleLen).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
