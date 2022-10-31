public interface Professor {
    void notify(String msg);
    void cancelNotify();
    void enroll(StudentInterface s);
    void unenroll(StudentInterface s);
}
