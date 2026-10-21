class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        Deque<Integer> stack=new ArrayDeque<>();
         Arrays.fill(arr, -1);

        for(int i=0;i<n*2;i++){
            int index=i%n;
            while(!stack.isEmpty() && nums[index]>nums[stack.peek()]){
                arr[stack.pop()]=nums[index];
            }
            if(i<n){
                stack.push(index);
            }
        }
        return arr;
    }
}