class Solution {

    public boolean hasDuplicate(int[] nums) {

        Set<Integer> h = Arrays.stream(nums).boxed().collect(Collectors.toCollection(HashSet::new));
        
        if(h.size() == nums.length){
            return false;
        } else{
            return true;
        }


    }
}