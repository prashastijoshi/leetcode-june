class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        
        int count=0;
        int l = 0;
        int r = people.length-1;
        while(l<=r){
            int rem = limit-people[r];
            count++; 
            r--;
            if(l<=r && people[l] <=rem){
                
               
                l++;
            }
        }
        return count;
        
    }
}