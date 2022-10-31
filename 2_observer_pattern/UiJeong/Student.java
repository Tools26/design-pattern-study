import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student implements StudentInterface {
    private List<Map<Integer, String>> notice = new ArrayList<>();
    private String name;

    public Student(String n){
        this.name = n;
    }

    @Override
    public void updateNotice(String msg) {
         Map<Integer, String> map = new HashMap<Integer, String>();
         map.put(notice.size()+1, msg);

         notice.add(map);
    }

    @Override
    public void deleteNotice() {
        notice.remove(notice.size()-1);
    }

    public void printNotice(){
        System.out.println("----"+this.name+"----");
        for(int i=0; i < notice.size(); i++){
            System.out.println(notice.toString());
        }
    }

}
