import java.util.*;
class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        int sumAlex=0;
        int sumLee = 0;
        Arrays.sort(piles);
        for(int i=0;i<n;i++){     
            if(i%2==0){
                sumLee += piles[i];
            } 
            else{
                sumAlex += piles[i];
            }
            
        }
        if(sumAlex>sumLee){
            return true;
        }
        else{
         return false;   
        }
        
    }
}