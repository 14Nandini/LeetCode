class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        String[] words = paragraph.split("[ !?',;.]+");
        Set<String> bannedSet = new HashSet<>();
        for (String b : banned) {
            bannedSet.add(b);
        }
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            if (!bannedSet.contains(word)) {
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        }
        String mostFrequentWord = "";
        int maxCount = 0;
        for (String key : wordCounts.keySet()) {
            if (wordCounts.get(key) > maxCount) {
                maxCount = wordCounts.get(key);
                mostFrequentWord = key;
            }
        }
        return mostFrequentWord;
    }
}