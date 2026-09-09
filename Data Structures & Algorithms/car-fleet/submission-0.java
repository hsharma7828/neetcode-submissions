class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Map<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        Deque<Double> stack = new ArrayDeque<>();
        
        for(int i= 0; i< position.length; i++) {
            map.put(position[i], speed[i]);
        }

        int fleet = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            double t = (double)(target - entry.getKey()) / entry.getValue();
            if(stack.isEmpty()) {
                stack.push(t);
                fleet++;
            } else if(t > stack.peek()) {
             fleet++;
             stack.push(t);
            }
        }

        return fleet;
    }
}