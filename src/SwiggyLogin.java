public abstract class SwiggyLogin {
    public String username;
    private String password;

    public SwiggyLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public abstract boolean login();
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    @Override
    public String toString() {
        return "SwiggyLogin{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
