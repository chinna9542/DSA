class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int res=0;
        for(int i=0;i<s.length()-1;i++){
            int c=map.get(s.charAt(i));
            int n=map.get(s.charAt(i+1));
            if(c<n) res-=c;
            else res+=c;
        }
        res+=map.get(s.charAt(s.length()-1));
        return res;
    }
}