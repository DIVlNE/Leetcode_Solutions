class Solution {
    public int[] twoSum(int[] nums, int target) {
        // hashmap to store key and value 
        // key : number in nums array , value= index of the number
        // int compliment = target - num > to find which number add up to target
        // return new int [] {} 

        HashMap<Integer,Integer> total = new HashMap<>();

        for (int i = 0 ; i < nums.length; i++) {
            int num = nums[i];
            int compliment = target - num;

            if (total.containsKey(compliment)) {
                return new int [] {total.get(compliment), i};
            }
            total.put(num, i);
        }
        return new int [] {};
    }
}
