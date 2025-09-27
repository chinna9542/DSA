class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int c=0;
        int l=0;
        int f[]=new int[3];
        for(int i=0;i<n;i++){
            f[s.charAt(i)-'a']++;
            while(f[0]>=1&&f[1]>=1&&f[2]>=1){
                c+=n-i;
                f[s.charAt(l)-'a']--;
                l++;
            }
        }
        return c;
    }
}