/*
- return (double) sus / jos;
    (double) sus va fi 10.0.
    10.0 / 3 va da 3.3333... (un double cu zecimale).
- return (double) (sus / jos);
    sus / jos va fi 10 / 3, care este 3 (deoarece este o împărțire între int).
    3 este apoi convertit la 3.0 (dar fără zecimale, partea zecimală s-a pierdut deja).
 */

class Solution {
    public double average(int[] salary) {
        int jos = salary.length - 2;
        int sus = salary[0];
        int mini = salary[0];
        int maxi = salary[0];
        for(int i = 1; i < salary.length; i++){
            if(salary[i] > maxi) maxi = salary[i];
            if(salary[i] < mini) mini = salary[i];
            sus += salary[i];
        }
        sus -= (mini + maxi);
        return (double) sus / jos;
    }
}
