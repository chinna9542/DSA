class Solution {
    public String intToRoman(int num) {
        StringBuilder sb=new StringBuilder();
        int a[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String c[]={"M", "CM","D", "CD","C","XC","L","XL","X","IX","V","IV","I"};
        for(int i=0;i<a.length&&num>0;i++){
            while(num>=a[i]){
                num=num-a[i];
                sb.append(c[i]);
            }
        }
        return sb.toString();
    }
}