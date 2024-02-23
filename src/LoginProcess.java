public class LoginProcess extends SwiggyLogin {
    String localusername="vipteam";
    String localpassword="vip";
    public LoginProcess(String username, String password) {
        super(username, password);
    }

    @Override
    public boolean login() {
        if(localusername.equals(getUsername()) && localpassword.equals(getPassword())){
            System.out.println("Swiggylogin successful");
        }
        else{
            System.out.println("Swiggylogin failed Try again");
        }
        return false;
    }
}

