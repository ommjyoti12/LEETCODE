class Solution {
    public boolean backspaceCompare(String s1, String s2) {
              Stack<Character> ss1=new Stack<>();
        Stack<Character> ss2=new Stack<>();
 for(int i=0;i<s1.length();i++){
    if(s1.charAt(i)=='#'){
        
        if (!ss1.isEmpty()) {
                    ss1.pop();
                }
    }else{
        ss1.push(s1.charAt(i));
    }

 }
  for(int i=0;i<s2.length();i++){
    if(s2.charAt(i)=='#'){
          if (!ss2.isEmpty()) {
                    ss2.pop();
                }
    }else{
        ss2.push(s2.charAt(i));
    }

 }
 

        return ss1.equals(ss2);  
    }
}