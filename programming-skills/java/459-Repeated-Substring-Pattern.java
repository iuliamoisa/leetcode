/*
s = "abab" -> s+s =  "abababab"
eliminam primul si ultimul caracter ->"bababa"
observam ca 'bababa' contine abab, adica sirul initial -> da, e format din caractere repetitive


Input: s = "aba"
Doubling: "abaaba"
Modified: "baab"
Check: "baab" does not contain "aba", so the output is false.

The reason why we remove the first and last characters is to avoid matching the original string at its own boundary, 
which could be a false positive. If s can be constructed by repeating a substring, then in the string ss, removing the 
first and last characters will ensure that s can still be found within it if it is composed of repeating substrings.
 */

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String ss = s + s;
        String substring = ss.substring(1, ss.length() - 1); //removes the first and last character of the concatenated string.
        return substring.contains(s); // checks if the original string s exists within the modified string substring.
    }
    
}
