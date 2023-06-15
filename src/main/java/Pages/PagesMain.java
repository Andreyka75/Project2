package Pages;

public class PagesMain {
    public static void main(String[] args) {

        Page loginScreen = new Page("Login", 1,"www.legionIT.com/login");
//        loginScreen.pageName = "Login";
//        loginScreen.pageId = 1;
//        loginScreen.URL = "www.legionIT.com/login";

//        loginScreen.setPageId(1);
//        loginScreen.setPageName("Login");
//        loginScreen.setURL("www.legionIT.com/login");

        loginScreen.openPage();
        loginScreen.clickButton("Login");
        loginScreen.closePage();

        LoginPage LoginPage=new LoginPage();
//        loginPage.setPageName("LoginPage");
//        loginPage.setURL("http//...");





    }
}
