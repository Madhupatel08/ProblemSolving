class Solution {
    public boolean isPowerOfTwo(int n) {
    
        if(n<=0) return false; 
        
       int x= (int) Math.ceil( Math.log10(n)/Math.log10(2));
       
        int y= (int) Math.floor(Math.log10(n)/Math.log10(2));
        
        // System.out.println(x+ " " + y);
        
        if(x==y) return true;
        return false;
    }
}
