package iterator_pattern;

public enum Category {
  PHILOSOPHY(100, "철학"),
  RELIGION(200, "종교"),
  SOCIAL_SCIENCE(300, "사회과학"),
  NATURAL_SCIENCE(400, "자연과학");

  private int categoryNum;
  private String korean;

  Category(int categoryNum, String korean) {
    this.categoryNum = categoryNum;
    this.korean = korean;
  }

  public String getKorean() {
    return korean;
  }
}
