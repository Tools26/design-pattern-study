public class Main {
    public static void main(String[] args){
        MenuList firstMenuBar = new MenuList(); // 전체에 해당하는 메뉴 리스트
        firstMenuBar.add(new Menu("대학 소개"));

        MenuList secondMenuBar = new MenuList("대학 현황"); // 대학 현황에 해당하는 메뉴 리스트
        secondMenuBar.add(new Menu("일반현황"));
        secondMenuBar.add(new Menu("재정현황"));
        firstMenuBar.add(secondMenuBar);

        firstMenuBar.click();
    }
}
