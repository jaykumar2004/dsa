public class trapping_rainwater {
    public static int trappedRainWater(int height[]){
        int n = height.length;
        //step 1 : To calculate the left max boundary => in array form we calculate
        int leftmax [] = new int[n];
        leftmax[0] = height[0];
        for (int i=1; i<n; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }

        //step 2 : Then we calculate the left max boundary => in array
        int rightmax [] = new int[n];
        rightmax[n-1] = height[n-1];
        for (int i=n-2; i>=0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }

        int trapperWater = 0;
        //step 4 : Then run a loop
        // In loop we want to calculate the water level
        for (int i=0; i<n; i++){
            // Water level = min(left max voundary, right max boundary)
            int WaterLevel = Math.min(leftmax[i], rightmax[i]);
            //Trapped water = Water level - height[i]
            trapperWater += WaterLevel - height[i];
        }
        return trapperWater;
    }
    public static void main(String[] args) {
        int height [] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedRainWater(height));
    }
}
