package Pages;

public class Page {
    private String pageName;
    private int pageId;
    private String URL;

    //CONSTRUCTOR
    public Page(String pageName, int pageId, String URL){
        this.pageName = pageName;
        this.pageId = pageId;
        this.URL = URL;
    }
    public Page(){

    }

    public void openPage(){
        System.out.println(String.format("Page %s was opened", pageName));
    }
    public void closePage(){
        System.out.println(String.format("Page %s was closed", pageName));
    }
    public void clickButton(String buttonName){
        System.out.println(String.format("Button %s was clicked", buttonName));
    }

}
