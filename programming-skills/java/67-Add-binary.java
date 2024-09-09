/*
plec initial cu restul 0; 
parcurg caracter cu caracter fiecare sir, concomitent, pornind de la ultima pozitie 
sum contine valoarea caracterului curent din 'a' (daca exista) adunata cu valoarea caracterului curent din 'b' (daca exista) + carry,
adica sum = Suma bitilor curenți plus carry.
carry (restul) este suma caracterelor curente / 2 :
  fie a[i]=1 si b[i]=1 => sum = (1+1)/2 = 1-> restul este 1, adaug 1 pt caracterul urmator 
  fie a[i]=1 si b[i]=0 => sum = (1+0)/2 = 0 -> restul este 0
  stiu ca la pasul urmator restul va trebui adaugat la suma--> sum=carry
*/

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry; // la pasul curent, suma e initial restul de la pasul trecut
            if (i >= 0) {
                sum += a.charAt(i) - '0'; // convertesc caracterul in cifra
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0'; // convertesc caracterul in cifra
                j--;
            }
            
            carry = sum / 2; // daca sum = 2 (1+1)-> restul = 2/2 = 1 
            result.append(sum % 2); 
            
        }
        
        return result.reverse().toString();
    }
}
