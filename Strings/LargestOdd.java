class LargestOdd {

    public String largestOddNumber(String num) {

        for (int i = num.length() - 1; i >= 0; i--) {
            char c = num.charAt(i);
            int r = c - '0';

            if (r % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }

        return "";
    }

    public static void main(String[] args) {

        LargestOdd obj = new LargestOdd();

        String num = "35420";   // Example input

        String result = obj.largestOddNumber(num);

        System.out.println("Input: " + num);
        System.out.println("Largest Odd Number: " + result);
    }
}