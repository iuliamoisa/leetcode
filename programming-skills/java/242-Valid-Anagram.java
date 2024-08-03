/*
This approach uses a fixed-size integer array to count the frequency of each character, 
which allows it to achieve linear time complexity O(n);

alfabetul are 26 litere -> folosesc array de 26 integeri pt a calcula frcventa fiecarei litere.

ex: fie caracterul 'c' din sirul s
  The ASCII value of 'c' is 99.
  The ASCII value of 'a' is 97.
  => s.charAt(i) - 'a' is 99 - 97, which equals 2. -> incrementez pozitia a doua din vectorul alphabet deoarece am intalnit litera c; 
  litera c este a 3a din alfabet, deci e pe pozitia 2; 
  daca am ascii('a')-ascii('a') = 0 pentru ca 'a' e prima litera din alfabet, deci e pe pozitia 0 in array alphabet
*/

public class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26];
        
        // am gasit litera in s, incrementez nr de aparitii al lieterei in alphabet
        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++; 

        // am gasit litera in t, deci decrementez nr de aparitii al literei in alphabet
        for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;

      // in final, toate pozitiile din alphabet tre sa aiba valoarea 0, intrucat se anuleaza fiecare litera din s
      // cu fiecare litera din t (incrementare urmata de decrementare)
      // altfel, nr de aparitii ale unei litere din s nu e acelasi cu nr de aparitii al unei litere din t
      // si, implicit, nu e o anagrama 
        for (int i : alphabet) if (i != 0) return false;
        return true;
    }
}

// alta solutie; transform string in array, sortez array, transform array sortat in string si le compar; 
//daca sunt egale, evident e vorba de anagrama

// class Solution {
//     //O(n log n) din cauza sortarii
//     public boolean isAnagram(String s, String t) {
//         if(s.length() != t.length()) return false;
//         char[] sArray = s.toCharArray();
//         char[] tArray = t.toCharArray();
//         Arrays.sort(sArray);
//         Arrays.sort(tArray);
//         String newS = new String(sArray);
//         String newT = new String(tArray);
//         return newS.equals(newT);
//     }
// }
