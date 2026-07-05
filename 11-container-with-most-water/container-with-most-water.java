class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxarea = 0;
        while (i < j) {
            int currArea = Math.min(height[i], height[j]) * (j - i);
            maxarea = Math.max(maxarea, currArea);

            if (height[i] < height[j]) {
                i++;
            } else if (height[i] > height[j]) {
                j--;
            } else {
                if (height[i + 1] < height[j - 1]) {
                    j--;
                } else {
                    i++;
                }

            }

        }
        return maxarea;

    }
}