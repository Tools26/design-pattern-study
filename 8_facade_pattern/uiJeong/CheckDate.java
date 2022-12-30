import java.util.ArrayList;
import java.util.Arrays;

public class CheckDate {
    private Integer[] date = new Integer[]{2,4,6,8};
    private int checkDate;

    public CheckDate(int d)
    {
        this.checkDate = d;
    }

    public Integer[] getDate(){
        return date;
    }

    public boolean checkDate()
    {
        return Arrays.asList(date).contains(checkDate); // 특정 날짜 존재하는지 확인
    }

}
