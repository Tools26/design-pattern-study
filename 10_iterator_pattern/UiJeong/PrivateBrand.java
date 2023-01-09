public class PrivateBrand { // pb 상품
    private String name;
    private int cost;
    private double score; // 평점

    public PrivateBrand(String name, int cost, double score) {
        this.name = name;
        this.cost = cost;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public double getScore() {
        return score;
    }
}
