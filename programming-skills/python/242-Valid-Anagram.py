'''

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 

Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?


'''

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) > len(t):
            s1 = s
        else:
            s1 = t
        for char in s1:
            if s.count(char) != t.count(char):
                return False
        return True


'''
alt mod:
This code takes advantage of the fact that anagrams have the same characters, but in different orders. By sorting the characters, the code transforms the problem into a comparison of the sorted strings, simplifying the anagram check.

However, it's worth noting that this approach has a time complexity of O(n log n) due to the sorting operation, where n is the length of the strings.

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        sorted_s = sorted(s)
        sorted_t = sorted(t)
        return sorted_s == sorted_t


# alt mod:

class Solution(object):
    def isAnagram(self, s, t):
        # In case of different length of thpse two strings...
        if len(s) != len(t):
            return False
        for idx in set(s):
            # Compare s.count(l) and t.count(l) for every index i from 0 to 26...
            # If they are different, return false...
            if s.count(idx) != t.count(idx):
                return False
        return True 
'''
        
