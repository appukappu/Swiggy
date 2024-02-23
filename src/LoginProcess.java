public class LoginProcess extends SwiggyLogin {
    String localusername="vipteam";
    String localpassword="vip";
    public LoginProcess(String username, String password) {
        super(username, password);
    }

    @Override
    public boolean login() {
        if(localusername.equals(getUsername()) && localpassword.equals(getPassword())){
            System.out.println("Swiggy login successful");
        }
        else{
            System.out.println("Swiggy login failed Try again");
        }
        return true;
    }
}

