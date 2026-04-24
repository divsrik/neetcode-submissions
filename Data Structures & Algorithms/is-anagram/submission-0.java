class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
			return false;
		char[] sorted_s = s.toCharArray();
		char[] sorted_t = t.toCharArray();
		Arrays.sort(sorted_s);
		Arrays.sort(sorted_t);
		
		return Arrays.equals(sorted_s, sorted_t);
    }
}
