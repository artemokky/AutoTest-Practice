import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class OkLoginPage {
    public SelenideElement getEmailField(){
        return $("#field_email");
    }

    public SelenideElement getPasswordField(){
        return $("#field_password");
    }

    public SelenideElement getLogInButton(){
        return $(".button-pro.__wide");
    }

    public SelenideElement getLogInErrorInfo(){
        return $(".input-e.login_error");
    }

}
