/*
When you use the + operator with String objects, the Java compiler translates these operations into the use of 
StringBuilder under the hood. 

String str = "Hello" + "World";
The compiler converts this to:
String str = new StringBuilder().append("Hello").append("World").toString();

*/

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        int i = 0;
        while(i < word1.length()){
            res.append(word1.charAt(i)); // we can't use '+' operator like we do with Strings, cause
          //StringBuilder is mutable, and it has append method  which is optimized for modifying the existing object
            if(i < word2.length()){
                res.append(word2.charAt(i));
            }
            i++;
        }

        while(i < word2.length()){
            res.append(word2.charAt(i));
            i++;
        }
        return res.toString(); // method expects a String return so we convert StringBuilder to String
    }
}

/*
-- BAD SOLUTION because:
String objects in Java are immutable -> once a String object is created, it cannot be changed. 
Concatenating strings using + -> a new String object is created each time -> copying the content of the existing strings 
to the new string is inefficient, especially in loops.

res += word1.charAt(i); is equivalent to res = new String(res + word1.charAt(i)); -> creates a new String object every 
iteration, resulting in a lot of unnecessary object creation and memory usage.



StringBuilder is a mutable sequence of characters. When you use StringBuilder to append strings, it modifies the same 
object without creating new ones-> reduces the overhead of creating new objects and copying content, 
making it more efficient, especially for concatenation in loops.
 res.append(word1.charAt(i)); modifies the same StringBuilder object, avoiding the creation of additional String objects.
*/


/*
class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res = "";
        int i = 0;
        while(i < word1.length()){
            res += word1.charAt(i);
            if(i < word2.length()){
                res += word2.charAt(i);
            }
            i++;
        }

        while(i < word2.length()){
            res += word2.charAt(i);
            i++;
        }
        return res;
    }
}

*/
