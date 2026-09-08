class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> deque1 = new ArrayDeque<>();
        for(String str: tokens) {
            if(str.matches("-?\\d+")) {
                deque1.push(Integer.parseInt(str));
            } else {
                int b = deque1.pop();
                int a = deque1.pop();
                int result = calculate(a, b, str);
                deque1.push(result);
            }
        }
        return deque1.pop();
    }
    public int calculate(int a, int b, String process) {
        switch (process) {
    case "+":
        return a + b;
    case "-":
        return a - b;
    case "*":
        return a * b;
    case "/":
        return a / b;
    default:
        throw new IllegalArgumentException("Invalid operator");
}
    }
}
