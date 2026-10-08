package String;
// Longest Repeating Character Replacement
// Sliding window
public class DSA40 {
    public static void main(String[] args) {
        String s = "AABABBA";
        int left = 0;
        int maxFreq = 0;
        int maxLen = 0;
        int freq[] = new int[26];
        int k = 1;
        for(int right = 0 ; right < s.length() ; right++)
        {
            freq[s.charAt(right)-'A']++;
            maxFreq = Math.max(maxFreq,freq[s.charAt(right)-'A']);

            while((right - left + 1) - maxFreq > k)
            {
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen,right - left +1);
        }
        System.out.println("Maximum length: "+maxLen);
    }
    
}
