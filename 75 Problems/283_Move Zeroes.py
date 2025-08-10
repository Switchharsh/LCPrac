class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        slow_ptr = 0
        for fast_ptr in range(len(nums)):
            if nums[fast_ptr] != 0:
                nums[slow_ptr] = nums[fast_ptr]
                slow_ptr += 1
        for i in range(slow_ptr, len(nums)):
            nums[i] = 0