/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l = 1;
        int r = n;
        // int myGuess = n+1/2;

        while(true){
            int myGuess=l+(r-l)/2;
            int res = guess(myGuess);
            if(res==0){
                return myGuess;
            }
            else if(res>0){
                l = myGuess+1;
            }
            else if(res<0){
                r=myGuess-1;
            }
        }   
    }
}