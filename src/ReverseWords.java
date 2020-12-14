import java.util.Stack;

public class ReverseWords {
    public static void main(String[] args) {
        String ss = "This is a good example";
        System.out.println(reverseWords(ss));
    }

    public static String reverseWords(String s){
        Stack stack = new Stack();
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' '){
                temp += s.charAt(i);
            }
            else if (temp != ""){
                stack.push(temp);
                temp = "";
            }
            else{
                continue;
            }
        }
        if (temp != ""){
            stack.push(temp);
        }
        String result = "";
        while (!stack.empty()){
            result += stack.pop() +" ";
        }
        return result.substring(0,result.length()-1);
    }
}
