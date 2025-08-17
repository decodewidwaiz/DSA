

// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int temp = n;
        int sum = 0;
        int power = String.valueOf(n).length();
        while(n!=0){
            int rem = n%10;
            sum += (int)Math.pow(rem, power);
            n /=10;
        }
        if(sum == temp){
            return true;
        }
        return false;
        
    }
}