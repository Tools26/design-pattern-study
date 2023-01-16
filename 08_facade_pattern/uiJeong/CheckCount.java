public class CheckCount {
    private int student_num;

    public CheckCount(int student_num) {
        this.student_num = student_num;
    }

    public boolean checkStudentCount(){
        if(student_num > 0){
            System.out.println("신청되었습니다");
            return true;
        }
        else{
            System.out.println("수강신청 마감되었습니다");
            return false;
        }
    }

}
