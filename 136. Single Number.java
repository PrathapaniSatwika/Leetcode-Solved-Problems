class Solution {
    public int singleNumber(int[] nums) {
      int ans=0;
      for(int num : nums){
          ans^=num;
      }
      return ans;
    }
}

Explanation:
The statement "for(int num : nums)" is a construct used in Java
 (and some other programming languages) to iterate over elements in an array 
or a collection. Here's how it works:

1. "for" keyword: The "for" keyword is used to start a loop construct.

2. "int num": This part declares a new variable named "num" of type "int" (integer). 
This variable will be used to hold the value of each element in the array or 
collection.

3. ":" (colon): The colon separates the variable declaration from the array or
 collection that you want to iterate over.

4. "nums": This is the array or collection you want to iterate over. 
It can be an array of integers, a list, or any other iterable data structure.

So, when you write "for(int num : nums)", it means that you want to iterate over
 each element in the "nums" array or collection, and in each iteration, 
the value of the current element will be assigned to the variable "num". 
You can then use this variable within the loop to perform operations or access 
the current element.