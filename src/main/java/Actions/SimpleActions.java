package Actions;

import org.openqa.selenium.WebDriver;
import WebElements.SimpleElements;


public class SimpleActions {

    private SimpleElements elements;

    public SimpleActions(WebDriver driver){
        this.elements = new SimpleElements(driver);
    }

    public String getLoginText(){
        return elements.loginText().getText();
    }
}
