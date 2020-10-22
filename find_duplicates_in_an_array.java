//most optimized approach O(n) time space O(1)
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // HashSet<Integer>hs = new HashSet<>();
        List<Integer> ans = new ArrayList<Integer>();
        for(int i = 0 ; i < nums.length ; i++){
            int idx = Math.abs(nums[i])-1;
            if(nums[idx] >= 0){
                nums[idx] =  - nums[idx];
            }else{
                ans.add(Math.abs(nums[i]));
            }
        }
        return ans;
    }
}

//approach 2 using hashset
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer>hs = new HashSet<>();
        List<Integer> ans = new ArrayList<Integer>();
        for(int i:nums){
            if(hs.contains(i)==false){
                hs.add(i);  
            }else{
                ans.add(i);
            }
        }
        return ans;
    }
}
//approach 3 using sorting
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<Integer>();
        for(int i =0;i<nums.length-1 ;i++){
            if(nums[i] ==nums[i+1] ){
             ans.add(nums[i]);   
            }
        }
        return ans;
    }
}
