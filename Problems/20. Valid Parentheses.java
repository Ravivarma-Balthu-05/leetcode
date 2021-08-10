class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(ch);
            }else if(ch == ')' && stack.peek() == '('){
                stack.pop();
            }else if(ch == '}' && stack.peek() == '{'){
                stack.pop();
            }else if(ch == ']' && stack.peek() == '['){
                stack.pop();
            }else if(ch == ')' || ch == '}' || ch == ']'){
                return false;
            }else{
                stack.push(ch);
            }
        }

        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
