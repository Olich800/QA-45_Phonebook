package tests;

import manager.ApplicationManager;
import org.testng.annotations.Test;
import pages.HomaPage;
import pages.LoginPage;

import java.util.Random;

public class RegistrationTest extends ApplicationManager {

    @Test
    public void registrationPositiveTest(){
        int i = new Random().nextInt(1000);
        new HomaPage(getDriver()).clickBtnLoginHeader();
        new LoginPage(getDriver()).typeRegistrationForm("frodo_jjuu"+i+"@gmail.com","Qasswd121212!");









    }

}
