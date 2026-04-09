class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, ArrayList<String>> map= new HashMap<>();

        String key = "";
        for(int i=0;i< strs.length;i++){
            key = sortString(strs[i]);
            if (!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(strs[i]);
        }

        return new ArrayList<>(map.values());

    }
    public static String sortString(String input) {
    char[] tempArray = input.toCharArray();
    Arrays.sort(tempArray);
    return new String(tempArray);

    }
}