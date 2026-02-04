public class Validparenthesis {
    public static void main(String[] args) {
        String s = "(()()())()(()())";
        String result = removeOuterParentheses(s);
        System.out.println(result);
    }

    public static String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int depth = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (depth > 0) {
                    sb.append(c);
                }
                depth++;
            } else if (c == ')') {
                depth--;
                if (depth > 0) {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}
