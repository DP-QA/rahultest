package requestPOJOs;

public class Login_Token_Request {

    private String username;
    private String password;

    public Login_Token_Request() {
    }

    public Login_Token_Request(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username){this.username = this.username;}

    public String getPassword(){ return password;}
    public void setPassword(String password){this.password = this.password;}



}
