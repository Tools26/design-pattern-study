public abstract class User {
    private boolean isLogin;

    public User(){
        this.isLogin = false;
    }

    public void whoAmI() {

    }

    public void login(){

    };

    public void setLogin(boolean login) {
        isLogin = login;
    }
}
