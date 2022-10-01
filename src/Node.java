public class Node implements Comparable<Node> {
    int val;
    int weight;

    public Node(int val, int weight) {
        this.val = val;
        this. weight= weight;
    }

    public int getVal() {
        return val;
    }

    public int getWeight() {
        return weight;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Node o) {
        return Integer.compare(this.val , o.val);
    }
}
