class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        mp = dict()
        for i in range(len(nums)):
            mp[nums[i]] = i
        for i in range(len(nums)):
            if target - nums[i] in mp and i != mp[target - nums[i]]:
                return sorted([i, mp[target - nums[i]]])
        return []