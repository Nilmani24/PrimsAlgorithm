import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class PrimsAlgo {
   private int dist[] ;
   private int parent[];
   private boolean mst[];
   private List<List<Node>> graph;
   private int v;

    public PrimsAlgo(List<List<Node>> graph, int v){
        this.graph = graph;
       this.dist = new int[v];
       this.parent = new int[v];
       this.mst = new boolean[v];
       this.v = v;
        Arrays.fill(dist,Integer.MAX_VALUE);
        Arrays.fill(parent,-1);
    }

    public void primsAlgo(int s){
        dist[s] = 0;
        PriorityQueue<Node> queue = new PriorityQueue();
        queue.add(new Node(s,0));
        for(int i =0;i<v-1;i++) {

   //         int min= Integer.MAX_VALUE;
  //          int u =0;
            // commented brute for solution
//            for(int j =0;j<dist.length;j++){
//                if(!mst[j] && dist[j] < min){
//                    min= dist[j];
//                    u = j;
//                }
//            }
            int u = queue.remove().getVal();
            mst[u] = true;
            List<Node> adjList = graph.get(u);

            for(Node node :adjList){
                if(mst[node.getVal()] == false && node.getWeight() < dist[node.getVal()]){
                    parent[node.getVal()] = u;
                    dist[node.getVal()] = node.getWeight();
                    queue.add(new Node(node.getVal(), dist[node.getVal()]));
                }
            }

        }

        for(int i =1;i<v;i++){
            System.out.print(parent[i] + " " );
        }

    }



}
