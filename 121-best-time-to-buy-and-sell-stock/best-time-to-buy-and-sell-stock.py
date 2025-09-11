class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        m=0
        min=prices[0]
        for i in range(1,len(prices)):
            if prices[i]<min:
                min=prices[i]
            m=max(m,prices[i]-min)
        return m
        