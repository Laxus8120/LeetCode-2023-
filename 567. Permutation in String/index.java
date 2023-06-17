class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();

        if (len1 > len2) {
            return false;
        }

        int[] count = new int[26]; // Array to store the counts of characters in the window
        int[] targetCount = new int[26]; // Array to store the counts of characters in s1

        // Calculate the initial counts of characters in s1
        for (char ch : s1.toCharArray()) {
            targetCount[ch - 'a']++;
        }

        int start = 0; // Start pointer of the window

        for (int end = 0; end < len2; end++) {
            char current = s2.charAt(end);

            // Increment the count of the current character in the window
            count[current - 'a']++;

            // Shrink the window if its size exceeds len1
            if (end - start + 1 > len1) {
                char startChar = s2.charAt(start);

                // Decrement the count of the character at the start of the window
                count[startChar - 'a']--;
                start++;
            }

            // Check if the window contains a permutation of s1
            if (end - start + 1 == len1 && matches(count, targetCount)) {
                return true;
            }
        }

        return false;
    }

    // Helper method to compare the counts of characters in two arrays
    private boolean matches(int[] count1, int[] count2) {
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }
}


