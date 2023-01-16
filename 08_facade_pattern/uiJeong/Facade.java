public class Facade {
    private int course_date;
    private Integer[] user_date;
    private int countStudent;

    public Facade(int date, Integer[] u_date, int count) {
        this.course_date = date;
        this.user_date = u_date;
        this.countStudent = count;
    }

    public void register(){
        CheckDate checkDate = new CheckDate(course_date);

        if(checkDate.checkDate()){ // 날짜 존재 체크
            CheckAnother checkAnother = new CheckAnother(user_date, checkDate.getDate()); // 겹치는 수업 체크

            if(checkAnother.checkAnotherDate()){ // 다른 겹치는 날짜 체크

                CheckCount checkCount = new CheckCount(countStudent); // 인원 수 체크
                if(checkCount.checkStudentCount()){
                    countStudent--;
                }
            }
            else{
                System.out.println("다른 수업과 겹칩니다");
            }
        }
        else{
            System.out.println("신청하려는 날짜가 존재하지 않습니다");
        }
    }

    public static void main(String[] args){
        int student = 1; // 이건 DB에서 가져오겠지?!
        Facade reg1 = new Facade(0, new Integer[]{0}, student); // 지정된 날짜 아닌 경우
        Facade reg2 = new Facade(2, new Integer[]{1,2}, student); // 날짜 겹치는 경우
        Facade reg3 = new Facade(2, new Integer[]{1}, student); // 정상
        Facade reg4 = new Facade(2, new Integer[]{3}, student); // 인원수 마감 test

        reg1.register();
        reg2.register();
        reg3.register();
        reg4.register();
        reg4.register(); // 신청 안 되어야
    }
}

