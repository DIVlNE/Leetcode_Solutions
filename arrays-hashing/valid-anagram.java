class Solution {
    public boolean isAnagram(String s, String t) {
        // check for str length comparison
        if (s.length() != t.length()) {
            return false;
        }

        // make the string in char, and sort them
        char [] arrS = s.toCharArray();
        char [] arrT = t.toCharArray();

        Arrays.sort(arrS);
        Arrays.sort(arrT);

        return Arrays.equals(arrS,arrT);
    }
}
