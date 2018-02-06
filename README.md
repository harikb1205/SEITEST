# SEITEST
Problem:
  Given the following class, write 3 methods that can be used to return an array that has no
duplicates.
2. You should define a method signature that you feel is appropriate to the problem.
3. We would prefer to see three implementations (one that should take into consideration #4
below) and an explanation of what use-cases are suitable to each implementation
4. What if we need to retain the original order?
5. What are the positives and negatives of your solution?
a. Can you implement it another way so as to avoid the negatives?
6. Your solution should be testable and “production ready.”
7. Your solution should be posted to a public github repo that SEI can clone.
public class DeDup {

    public int[] randomIntegers = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,3,
                                   20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,19,
                                   13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};
                                   
                                   public static void main(String [] args) {
                                   
                                   }
                                }

Solution: 
  Implemented 3 methods to eliminate duplicates with one method (1st Method - removeDups) retaining the original order.
  
  - The method removeDups is time consuming since it loops on the actual array and compares with temporary array while looping through it.
  - The method removeDuplicates is fairly simple since it uses the Java inbuilt util Set.
  - The mrthod eliminateDuplicates also has similar issues as removeDups.
  
  
  How to execute this project?
    - Clone or download the project.
    - Run the main class DeDup.java.
    
  
