class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs) {
            String code = helper(s);
            map.putIfAbsent(code, new ArrayList<>());
            map.get(code).add(s);
        }
        List<List<String>> ans = new ArrayList<>();
        for(List<String> str : map.values()) {
            ans.add(str);
        }
        return ans;
    }

    private String helper(String s) {
        char[] ch = s.toCharArray();
        char[] arr = new char[26];
        for(char c : ch){
            arr[c - 'a']++;
        }
        return new String(arr);
    }
}
