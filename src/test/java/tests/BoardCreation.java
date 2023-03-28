package tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardCreation extends TestBase{

    @BeforeMethod
    public void preCondition(){
        app.getUser().initLogin();
        app.getUser().pause(2000);
        app.getUser().fillINLoginForm("amaverik281@gmail.com", "^94NqXC,5fxvUQ=");
        app.getUser().submitLogin();
        app.getUser().pause(2000);
    }

    @Test
    public void boardCreation1(){
        app.getBoard().initBoardCreationFromHeader();
        app.getBoard().pause(6000);
        app.getBoard().fillInBoardCreationForm("qa37");
        // app.scrollDownTheForm();
        app.getBoard().pause(6000);
        app.getBoard().submitBoardCreation();
        app.getBoard().pause(6000);
        app.getBoard().isCreated();

    }

}
