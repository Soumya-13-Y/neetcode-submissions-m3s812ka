class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
            Map<Integer,Integer> m=new TreeMap<>(Collections.reverseOrder());
            for(int i=0;i<position.length;i++){
                m.put(position[i],speed[i]);
            }

            Stack<Double> s=new Stack<>();
            for(Map.Entry<Integer,Integer> am:m.entrySet()){

                int distance =target-am.getKey();
                double time=(double)distance/am.getValue();
                  if (!s.isEmpty() && time <= s.peek()) {
        continue; 
    }
                s.push(time);
               
               
            }
           return s.size();
        
    }
}
