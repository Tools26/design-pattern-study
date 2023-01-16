public class TotalScore {
    private static TotalScore score;
    private static int total = 1;

    //생성자 - 외부에서 호출 못 하게 private!
    private TotalScore(){}

    // TotalScore 객체를 얻는 것
    public static TotalScore getInstance(){
        if (score == null) {
            score = new TotalScore();
        }
        return score;
    }

    //점수 올리기
    public static void plusTotal() {
        total++;
    }

    public static int getTotal() {
        return total;
    }
}
