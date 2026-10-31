class Solution {

    void solve(String digits, int index,
               StringBuilder sb,
               List<String> ans,
               HashMap<Character, String> map) {

        // Base case
        if (index == digits.length()) {
            ans.add(sb.toString());
            return;
        }

        // Current digit
        char digit = digits.charAt(index);

        // Get corresponding letters
        String letters = map.get(digit);

        for (int i = 0; i < letters.length(); i++) {

            // Choose
            sb.append(letters.charAt(i));

            // Explore next digit
            solve(digits, index + 1, sb, ans, map);

            // Backtrack
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        if (digits.length() == 0) return ans;

        HashMap<Character, String> map = new HashMap<>();

        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        solve(digits, 0, new StringBuilder(), ans, map);

        return ans;
    }
}