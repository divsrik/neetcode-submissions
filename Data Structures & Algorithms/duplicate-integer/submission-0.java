class Solution {
    public static boolean hasDuplicate(int[] nums) {
		 Map map = new HashMap<>();
	        for(int a : nums) {
	        	if(map.containsKey(a))
	        		return true;
	        	else
	        		map.put(a, 1);
	        		
	        }
	        return false;
	 }
}