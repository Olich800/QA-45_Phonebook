package tests;

import dto.UserDto;
import manager.ApplicationManager;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ContacsPage;
import pages.HomaPage;
import pages.LoginPage;

import java.util.Random;

public class LoginTests extends ApplicationManager {

    private String email, password;


    @BeforeMethod
public void registration(){
            int i = new Random().nextInt(1000);
            email= "frodo_jjuu"+i+"@gmail.com";
            password = "Qasswd121212!";
            new HomaPage(getDriver()).clickBtnLoginHeader();
            new LoginPage(getDriver()).typeRegistrationForm(email, password);
            new ContacsPage(getDriver()).clickBtnSignOut();


        }
    @Test
    public void loginPositiveTest(){
        UserDto  user = new UserDto(email, password);
        new HomaPage(getDriver()).clickBtnLoginHeader();
        new LoginPage(getDriver()).typeLoginForm(user);
        Assert.assertTrue(new ContacsPage(getDriver()).isSignOutPresent());

        }
    }

