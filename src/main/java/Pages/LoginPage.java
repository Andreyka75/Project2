package Pages;
//Inheritance
public class LoginPage extends Page{

    String userName;
    String password;


    public void populateCredentials(){

        System.out.println(String.format("credentials are populated: %s, %s", userName, password ));
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
