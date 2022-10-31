public interface Professor {
    // Observable
    void notify(String msg);
    void cancelNotify();
    void enroll(StudentInterface s);
    void unenroll(StudentInterface s);
}
