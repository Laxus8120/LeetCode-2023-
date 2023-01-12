/*
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
 *  it reads the same forward and backward. Alphanumeric characters include letters and numbers.
    
    Given a string s, return true if it is a palindrome, or false otherwise.
 */

/*
 * TimeComplexity - O(n);
 * SpaceComplexity - O(1);
 */

class Solution {
    public boolean isPalindrome(String s) {
        
        int left = 0 , right = s.length() -1 ;

        while(left < right){

            Character l = s.charAt(left);
            Character h = s.charAt(right);

            if(!Character.isLetterOrDigit(l)){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(h)){
                right --;
                continue;
            }
            if(Character.toLowerCase(l) != Character.toLowerCase(h)){
                return false;
            }

            left++;
            right--;
        }
        return true;
    } 
}