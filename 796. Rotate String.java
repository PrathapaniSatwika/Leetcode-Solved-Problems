class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String doubleS=s+s;
        return doubleS.contains(goal);
    }
}
//The canShift method takes two strings, s and goal, as input and checks if s can become goal after some number of shifts. It first compares the lengths of the two strings and returns false if they are different. Then, it concatenates s with itself to create doubleS. Finally, it checks if goal is a substring of doubleS using the contains method and returns true if it is, and false otherwise.