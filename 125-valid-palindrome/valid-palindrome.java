class Solution {
    public boolean isPalindrome(String s) {
        String s1="";
        String s2="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                s1=s1+Character.toLowerCase(s.charAt(i));
                s2=Character.toLowerCase(s.charAt(i))+s2;
            }else if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                s1=s1+s.charAt(i);
                s2=s.charAt(i)+s2;
            }else if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                s1=s1+s.charAt(i);
                s2=s.charAt(i)+s2;
            }else{
                continue;
            }
        }
        return s1.equals(s2);
    }
}