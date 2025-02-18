package SlidingWindow;

public class MaximumPointsObtainCards_1423 {

	public static void main(String[] args) {
		MaximumPointsObtainCards_1423 sol = new MaximumPointsObtainCards_1423();
        System.out.println(sol.maxScore(new int[]{1,2,3,4,5,6,1}, 3)); // Output: 12
        System.out.println(sol.maxScore(new int[]{2,2,2}, 2));         // Output: 4
        System.out.println(sol.maxScore(new int[]{9,7,7,9,7,7,9}, 7)); // Output: 55

	}

	public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int windowSize = n - k;

        int minSubarraySum = 0;
        for (int i = 0; i < windowSize; i++) {
            minSubarraySum += cardPoints[i];
        }

        int totalSum = 0;
        for (int num : cardPoints) {
            totalSum += num;
        }
        
        int currentSum = minSubarraySum;
        int minSum = minSubarraySum;
        for (int i = windowSize; i < n; i++) {
            currentSum += cardPoints[i] - cardPoints[i - windowSize];
            minSum = Math.min(minSum, currentSum);
        }

        return totalSum - minSum;
    }
}
