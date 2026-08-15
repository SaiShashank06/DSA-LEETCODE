class Solution {
    public int lastStoneWeight(int[] stones) {
        //MaxHeap
         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            for(int i=00;i<stones.length;i++){
                pq.offer(stones[i]);

            }

         while(pq.size()>1){
            int i=pq.poll();
            int j=pq.poll();

            if(i!=j){
                pq.offer(i-j);

            }
         }

         if(pq.size()==0) return 0;
         else return pq.poll();

         //aproach maxheap
         /**
         store aall elem in maxHeap;
         if(top 2 are not equal add 1-2 to heap)
          */



        
    }
}