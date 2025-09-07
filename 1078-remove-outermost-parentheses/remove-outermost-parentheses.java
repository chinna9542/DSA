class Solution {
    public String removeOuterParentheses(String s) {
        int b=0;
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='('){
                if(b>0){
                    sb.append(c);
                }
                b++;
            }else{
                b--;
                if(b>0){
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}