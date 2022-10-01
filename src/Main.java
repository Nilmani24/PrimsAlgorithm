import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        int v = 3;
        int s = 0;

        List<List<Node>> graph = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            graph.add(new ArrayList<Node>());
        }
        Node node = new Node(1, 1);
        Node node1 = new Node(2, 6);

        graph.get(0).add(node);
        graph.get(0).add(node1);

        Node node3 = new Node(2, 3);
        Node node4 = new Node(0, 1);

        graph.get(1).add(node3);
        graph.get(1).add(node4);

        Node node5 = new Node(1, 3);
        Node node6 = new Node(0, 6);

        graph.get(2).add(node5);
        graph.get(2).add(node6);

        PrimsAlgo primsAlgo = new PrimsAlgo(graph,v);
        primsAlgo.primsAlgo(s);


    }
}
