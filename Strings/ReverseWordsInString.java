public class ReverseWordsInString {

    public static void main(String[] args) {

        ReverseWordsInString obj = new ReverseWordsInString();

        String input = "  the   sky  is blue  ";
        String output = obj.reverseWords(input);

        System.out.println("Input : \"" + input + "\"");
        System.out.println("Output: \"" + output + "\"");
    }

    public String reverseWords(String s) {

        String ns = s.trim();
        StringBuilder sb = new StringBuilder();

        int l = ns.length() - 1;

        while (l >= 0) {

            // skip spaces
            while (l >= 0 && ns.charAt(l) == ' ') {
                l--;
            }

            if (l < 0) break;

            int r = l;

            // move to start of word
            while (l >= 0 && ns.charAt(l) != ' ') {
                l--;
            }

            sb.append(ns.substring(l + 1, r + 1)).append(" ");
        }

        return sb.toString().trim();
    }
}
