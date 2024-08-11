//cea mai buna varianta, beats 100%

class Solution {
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }
}


/*
varianta ineficienta - transformare manuala, litera cu litera; 
am copiat sirul initial intr-un stringBuilder si am modificat litera cu litera 
*/

class Solution {
    public String toLowerCase(String s) {
        StringBuilder newS = new StringBuilder(s);
        for(int i = 0; i < s.length(); i++){
            if(Character.isUpperCase(s.charAt(i)))
                newS.setCharAt(i, Character.toLowerCase(s.charAt(i)));
        }
        return(newS.toString());
    }
}

/*
tot o varianta ineficienta - transformare manuala, litera cu litera; 
diferenta fata de solutia anterioara e ca am folosit append, nu am copiat direct sirul initial 
intr-un STringBuilder.
*/

class Solution {
    public String toLowerCase(String s) {
        StringBuilder newS = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                newS.append(Character.toLowerCase(c));
            } else {
                newS.append(c);
            }
        }
        return newS.toString();
    }
}
