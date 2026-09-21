class Solution {
    public int[][] merge(int[][] intervals) {
        
        if (intervals == null || intervals.length == 0) {
            return new int[0][];
        }
        List<int[]> result = new ArrayList<>();

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        result.add(intervals[0]);

        for(int i =1; i< intervals.length; i++) {
            int[] last = result.get(result.size() - 1);
            if(last[1] >= intervals[i][0]) {
                last[1] = Math.max(last[1], intervals[i][1]);
            } else {
                result.add(intervals[i]);
            }
        }
        
        return result.toArray(new int[result.size()][]);
    }
}