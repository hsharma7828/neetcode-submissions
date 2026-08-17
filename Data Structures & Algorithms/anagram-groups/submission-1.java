class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String str: strs) {
            char[] sortedKey = str.toCharArray();
            Arrays.sort(sortedKey);
            String mapKey = new String(sortedKey);
            if(map.containsKey(mapKey)) {
                map.get(mapKey).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);

                map.put(mapKey, list);
            }
        }
        return new ArrayList<>(map.values());

    }
}
