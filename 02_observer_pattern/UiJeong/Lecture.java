import java.util.ArrayList;
import java.util.List;

public class Lecture implements Professor {
    private List<StudentInterface> enrollStudent = new ArrayList<>();
    private String nameLecture;

    public Lecture(String n){
        this.nameLecture = n;
    }

    public void uploadLecture(String title){
        System.out.println(this.nameLecture+ " 강의가 업로드 되었습니다: " + title);
        notify("강의 업로드: "+title);
    }

    public void cancel(){
        System.out.println(this.nameLecture+" 취소하였습니다.");
        cancelNotify();
    }

    public void professorNotice(String body){
        System.out.println("교수님이 공지 사항을 올렸습니다.");
        notify("공지사항: "+body);
    }

    @Override
    public void notify(String msg) {
        enrollStudent.forEach(s -> s.updateNotice(msg));
    } // attention

    @Override
    public void cancelNotify() {
        enrollStudent.forEach(s -> s.deleteNotice());
    } // attention
    }

    @Override
    public void enroll(StudentInterface s) {
        enrollStudent.add(s);
    }

    @Override
    public void unenroll(StudentInterface s) {
        enrollStudent.remove(s);
    }
}
