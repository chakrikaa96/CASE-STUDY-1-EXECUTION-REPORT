import java.util.*;

public class CO3 {

    static class Edge {
        String u, v;
        int weight;

        Edge(String u, String v, int weight) {
            this.u = u;
            this.v = v;
            this.weight = weight;
        }
    }

    static class UnionFind {

        HashMap<String, String> parent =
                new HashMap<>();

        void makeSet(String v) {
            parent.put(v, v);
        }

        String find(String x) {

            if(parent.get(x).equals(x))
                return x;

            return find(parent.get(x));
        }

        boolean union(String a, String b) {

            String ra = find(a);
            String rb = find(b);

            if(ra.equals(rb))
                return false;

            parent.put(ra, rb);
            return true;
        }
    }

    public static void main(String[] args) {

        ArrayList<Edge> edges =
                new ArrayList<>();

        edges.add(new Edge("H","K",14));
        edges.add(new Edge("H","M",11));
        edges.add(new Edge("H","Y",9));

        edges.add(new Edge("Y","M",9));
        edges.add(new Edge("Y","E",8));

        edges.add(new Edge("M","E",7));
        edges.add(new Edge("M","S",10));
        edges.add(new Edge("M","K",8));
        edges.add(new Edge("M","W",12));

        edges.add(new Edge("E","S",4));
        edges.add(new Edge("S","W",6));
        edges.add(new Edge("K","W",5));

        edges.sort(
            Comparator.comparingInt(e -> e.weight)
        );

        String[] stations = {
            "M","K","W","S","E","Y","H"
        };

        UnionFind uf = new UnionFind();

        for(String s : stations)
            uf.makeSet(s);

        int totalCost = 0;

        System.out.println(
        "====================================");
        System.out.println(
        "BANGALORE METRO PHASE-3");
        System.out.println(
        "KRUSKAL MST");
        System.out.println(
        "====================================");

        System.out.println(
        "\nSelected MST Edges:");

        for(Edge e : edges) {

            if(uf.union(e.u,e.v)) {

                totalCost += e.weight;

                System.out.println(
                e.u + " - " +
                e.v + " : " +
                e.weight + " Crore");
            }
        }

        System.out.println(
        "\nTotal MST Cost = "
        + totalCost + " Crore");

        System.out.println(
        "\nRedundancy Check:");

        System.out.println(
        "Additional Edge Suggested: M-W (12)");

        System.out.println(
        "Provides Second Path Between M and W");

        System.out.println(
        "\nComplexity:");
        System.out.println(
        "Kruskal = O(m log m)");
        System.out.println(
        "Union Find = O(alpha(n))");

        System.out.println(
        "\n====================================");
        System.out.println(
        "CASE STUDY COMPLETED");
        System.out.println(
        "====================================");
    }
}
