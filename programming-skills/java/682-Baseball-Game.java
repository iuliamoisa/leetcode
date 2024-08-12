/*
solutia cu arrayList
*/

public class Solution {
    public int calPoints(String[] operations) {
        List<Integer> record = new ArrayList<>();

        for (String operation : operations) {
            if (operation.equals("C")) {   
                record.remove(record.size() - 1); 
            } else if (operation.equals("D")) {
               record.add(record.get(record.size() - 1) * 2);
            } else if (operation.equals("+")) {
                int last = record.get(record.size() - 1);
                int secondLast = record.get(record.size() - 2);
                record.add(last + secondLast);
            } else {
                record.add(Integer.parseInt(operation));
            }
        }

        int total = 0;
        for (int points : record) {
            total += points;
        }

        return total;
    }
}

/*
cu linkedList - am acces atat la elementul urmator, cat si la cel anterior, deci e mai usoara stergerea
*/

class Solution {
    public int calPoints(String[] ops) {
       LinkedList<Integer> list = new LinkedList<>();
        int sum = 0;
        for(var op : ops){
            switch (op){
                case "C":{
                    sum -= list.removeLast();
                    //list.removeLast();
                    break;
                }
                case "D":{
                    int item = list.getLast();
                    list.addLast(item*2);
                    sum+=item*2;
                    break;
                }
                case "+":{
                    int value = list.get(list.size()-2)+list.getLast();
                    list.addLast(value);
                    sum+=value;
                    break;
                }
                default:{
                    list.addLast(Integer.parseInt(op));
                    sum+=Integer.parseInt(op);
                    break;
                }
            }
        }
        return sum;
    }
}
