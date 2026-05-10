class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charCounts = new int[26];
        for (char c : chars.toCharArray()) {
            charCounts[c - 'a']++;
        }

        int totalLength = 0;
        for (String word : words) {
            if (canForm(word, charCounts)) {
                totalLength += word.length();
            }
        }
        return totalLength;
    }

    private boolean canForm(String word, int[] charCounts) {
        int[] temp = new int[26]; 
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            temp[idx]++;
            // Fail Fast: Stop if word has more of 'c' than available in chars
            if (temp[idx] > charCounts[idx]) {
                return false;
            }
        }
        return true;
    }
}
