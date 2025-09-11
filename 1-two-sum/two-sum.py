class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        mp={}
        for i,num in enumerate(nums):
            diff=target-num
            if(diff in mp):
                return [i,mp[diff]]
            mp[num]=i
        