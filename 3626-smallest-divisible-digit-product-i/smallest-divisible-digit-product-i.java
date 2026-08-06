class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=n+10;i++){
            int product=1;
            int original=i;
            int num=i;
            while(num>0){
                int digit=num%10;
                product=product*digit;
                num=num/10;
            }
            if(product%t==0){
                return original;
            }
        }
        return -1;
    }
}