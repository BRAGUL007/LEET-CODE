class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        nums.sort()
        if(len(nums)==1 and nums[0]==1):
            return nums[0]
        for i in nums:
            if(nums.count(i)==1):
                return i
        
        