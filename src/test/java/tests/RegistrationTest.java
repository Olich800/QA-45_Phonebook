package tests;

import manager.ApplicationManager;
import org.testng.annotations.Test;
import pages.HomaPage;
import pages.LoginPage;

public class RegistrationTest extends ApplicationManager {

    @Test
    public void registrationPositiveTest(){
        new HomaPage(getDriver()).clickBtnLoginHeader();
        new LoginPage(getDriver()).typeLoginForm("my_mail@gmail.com","password121212");
        new LoginPage(getDriver()).typePasswordForm("my_mail@gmail.com", "password21212");









    }

}
