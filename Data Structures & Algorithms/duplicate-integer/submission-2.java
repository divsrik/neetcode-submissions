class Solution {
    public boolean hasDuplicate(int[] nums) {
         Set set = new HashSet<>();
	        for(int a : nums) {
				if(set.contains(a))
				return true;
				else
				set.add(a);
				
			}
			return false;

    }
}