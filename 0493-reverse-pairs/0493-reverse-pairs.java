class Solution {
    int cnt=0;
    public int reversePairs(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return cnt;
    }
    void countPairs(int[] nums,int low,int mid,int high){
        int right=mid+1;
        for(int i=low;i<=mid;i++){
            while(right<=high && (long)nums[i]>(long)2*nums[right]){
                right++;
            }
            cnt+=(right-(mid+1));
        }
    }
    void mergeSort(int[] nums,int low,int high){
        if(low>=high)return;//base condition
        int mid=low+(high-low)/2;
        mergeSort(nums,low,mid);
        mergeSort(nums,mid+1,high);
        countPairs(nums,low,mid,high);
        merge(nums,low,mid,high);
    }
    void merge(int[] nums,int low,int mid,int high){
        ArrayList<Integer> list=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(nums[left]<nums[right]){
                list.add(nums[left]);
                left++;
            }
            else{
                list.add(nums[right]);
                right++;
            }
        }
        while(left<=mid){
            list.add(nums[left]);
            left++;
        }
        while(right<=high){
            list.add(nums[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            nums[i]=list.get(i-low);
        }
    }
}