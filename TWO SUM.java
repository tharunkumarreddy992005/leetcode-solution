class Solution {
    public int[] twoSum(int[] numbers, int target) {
     int i=0,j;
     for( j=1;j<numbers.length;j++){
        if(numbers[i]+numbers[j]==target){
         break;
        }
        
     }
    
     return new int[]{i+1,j+1};
     
    }
}
