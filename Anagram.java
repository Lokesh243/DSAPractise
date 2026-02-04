public class Anagram {

    public static void main(String[] args) {

        Anagram obj = new Anagram();

        System.out.println(obj.isAnagram("anagram", "nagaram")); // true
        System.out.println(obj.isAnagram("rat", "car"));         // false
    }

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
