class Solution {
    public boolean isValid(String s) {
    char [] ch= new char [s.length()]; 
    int y=-1;
    for(int i=0;i<s.length();i++){
        char ch1=s.charAt(i);
        if(ch1=='(' || ch1=='['|| ch1=='{'){
            ch[++y]=ch1;
        } 
        else{
              if(y==-1) return false;
            char ch2=ch[y--];
            if(ch1==')' && ch2!='('  )return false;
            if(ch1==']' &&  ch2!='['   )return false;
            if(ch1=='}' && ch2!='{'   )return false;
        }
    }
    return y==-1;
    }
}