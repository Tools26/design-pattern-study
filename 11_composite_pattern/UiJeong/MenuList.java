import java.util.ArrayList;
import java.util.List;

public class MenuList implements Link{ // Composite
    private String name = "전체 메뉴 리스트";
    private List<Link> childern;

    public MenuList(){
        this.childern = new ArrayList<Link>();
    }

    public MenuList(String name) {
        this.name = name;
        this.childern = new ArrayList<Link>();
    }

    @Override
    public void click() {
        System.out.println(name+"을/를 클릭했습니다");
        for(int i=0; i< this.childern.size(); i++){
            System.out.println((i+1)+"번째 메뉴 : ");
            this.childern.get(i).click();
        }
    }

    // 추가
    public void add(Link link){
        this.childern.add(link);
    }
}
