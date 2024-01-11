class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }

        int reversedNumber = 0;
        int temp = x;

       while (temp != 0) {
            int divident = temp % 10;
            reversedNumber = reversedNumber*10 + divident;
            temp= temp/10;
        }

        if(reversedNumber == x){
            return true;
        }
        else{
            return false;
        }
    }
}