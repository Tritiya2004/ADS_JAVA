


        /*
         find the smallest substring in the first string
         that conatins all characters of the second string

         we are going to use two hashmaps :
         charFreq: to store the frequency of each character 
         in s2:
         windowCoun: to store the frequency of character
         in current window of s1.

         using 2 pointers:
         start nd end to denote current window 

         expand the window by moving the end pointer untill
         all char in s2 covered .
         once a valid window is found , shrink it from left
         by moving the start to  minimize the window size

         */
        import java.util.HashMap;

        public class StringManip {
            public static void main(String[] args) {
                // Test the function
                String s1 = "ADOBECODEBANC";
                String s2 = "ABC";
                System.out.println("Smallest substring: " + minWindow(s1, s2));
            }
        
            public static String minWindow(String s1, String s2) {
                if (s1 == null || s2 == null || s1.length() < s2.length()) {
                    return "";
                }
        
                // Frequency map for characters in s2
                HashMap<Character, Integer> charFreq = new HashMap<>();
                for (char c : s2.toCharArray()) {
                    charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
                }
        
                // Frequency map for characters in the current window
                HashMap<Character, Integer> windowCount = new HashMap<>();
                int start = 0, matched = 0, minLength = Integer.MAX_VALUE;
                int minStart = 0;
        
                // Expand the window by moving the end pointer
                for (int end = 0; end < s1.length(); end++) {
                    char endChar = s1.charAt(end);
                    windowCount.put(endChar, windowCount.getOrDefault(endChar, 0) + 1);
        
                    // If the character in the current window matches the frequency in s2
                    if (charFreq.containsKey(endChar) && windowCount.get(endChar).equals(charFreq.get(endChar))) {
                        matched++;
                    }
        
                    // Shrink the window from the left as long as it's valid
                    while (matched == charFreq.size()) {
                        if (end - start + 1 < minLength) {
                            minLength = end - start + 1;
                            minStart = start;
                        }
        
                        char startChar = s1.charAt(start);
                        windowCount.put(startChar, windowCount.get(startChar) - 1);
        
                        if (charFreq.containsKey(startChar) && windowCount.get(startChar) < charFreq.get(startChar)) {
                            matched--;
                        }
        
                        start++;
                    }
                }
        
                // If no valid window is found, return an empty string
                return minLength == Integer.MAX_VALUE ? "" : s1.substring(minStart, minStart + minLength);
            }
        }
        