/*
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.

  => An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
    
  * Space Complexity = O(1)
  * Time COmplexity  = O(n)  //
 */


class Solution {
    public boolean isAnagram(String s, String t) {
        
        int[] arr = new int[26];

        for(char a : s.toCharArray()){
            arr[a - 'a']++;
        }
        for(char a : t.toCharArray()){
            arr[a - 'a']--;
        }

        for(int n : arr){
            if(n != 0) return false;
        }
        return true;
    }
        
    }
