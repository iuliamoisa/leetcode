/*
fie IX:
- Când ajungi la X (prima iterație), vezi că caracterul anterior este I
=> add 9 la valoare; trb sa evit procesarea din nou a lui I, deoarece I a fost deja utilizat pentru a calcula valoarea IX.
=>scazi i cu 1 (de la poziția actuală X la poziția I) și continui să parcurgi șirul.
La următoarea iterație, i va fi mai mic cu 1, deci va sări peste I, și bucla va continua cu următorul caracter (dacă există).
*/
class Solution {
    public int romanToInt(String s) {
        int value = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == 'I'){
                value++;
            }
            else if(s.charAt(i) == 'V'){
                if(i > 0 && s.charAt(i - 1) == 'I'){
                    value += 4;
                    i--;  
                }
                else value += 5;
            }
            else if(s.charAt(i) == 'X'){
                if(i > 0 && s.charAt(i - 1) == 'I'){
                    value += 9;
                    i--;  
                }
                else value += 10;
            }
            else if(s.charAt(i) == 'L'){
                if(i > 0 && s.charAt(i - 1) == 'X'){
                    value += 40;
                    i--;  
                }
                else value += 50;
            }
            else if(s.charAt(i) == 'C'){
                if(i > 0 && s.charAt(i - 1) == 'X'){
                    value += 90;
                    i--; 
                }
                else value += 100;
            }
            else if(s.charAt(i) == 'D'){
                if(i > 0 && s.charAt(i - 1) == 'C'){
                    value += 400;
                    i--;  
                }
                else value += 500;
            }
            else if(s.charAt(i) == 'M'){
                if(i > 0 && s.charAt(i - 1) == 'C'){
                    value += 900;
                    i--; 
                }
                else value += 1000;
            }
        }
        return value;
    }
}
