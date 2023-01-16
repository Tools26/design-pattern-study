import java.util.ArrayList;
import java.util.Arrays;

public class CheckAnother {
    private Integer[] user_classDate;
    private Integer[] date;

    public CheckAnother(Integer[] user_class, Integer[] date) {
        this.user_classDate = user_class;
        this.date =date;
    }

    public boolean checkAnotherDate(){
        for(int i=0; i < user_classDate.length; i++){
            if(Arrays.asList(date).contains(user_classDate[i])){
                return false;
            }
        }
        return true;
    }

}
