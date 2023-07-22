import java.util.*;
class HelloWorld{
    public static int post(String s){
        Stack<Integer> st=new Stack<Integer>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='0' && c<='9'){  //Operand
                st.push(c-'0');   //To convert it into  integer
            }
            else{
                // operator
                int val1=st.pop();
                int val2=st.pop();
                switch(c){
                case '+':
                    st.push(val2 + val1);
                    break;
                case '-':
                    st.push(val2 - val1);
                    break;
                case '/':
                    st.push(val2 / val1);
                    break;
                case '*':
                    st.push(val2 * val1);
                    break;
                }
            }
        }
        return st.pop();
        
    }
    public static void main(String[] args){
        String s="43+";
        System.out.println("Postfix Expression : "+post(s));
    }
    
}
