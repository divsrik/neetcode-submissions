class Solution {
    public boolean hasDuplicate(int[] nums) {
         Set set = new HashSet<>();
	    return Arrays.stream(nums).distinct().count()!= nums.length;
    }
}