package tests;

import core.BaseTest;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.TicketPage;

import static readProperties.ConfigProvider.ADMIN_LOGIN;
import static readProperties.ConfigProvider.ADMIN_PASS;

public class HelpDeskTest extends BaseTest {
    @Test
    public void signIn() {
        LoginPage loginPage = new LoginPage();
        loginPage.signIn(ADMIN_LOGIN, ADMIN_PASS);
    }

    @Test
    public void addEntity() {
        TicketPage ticketPage = new TicketPage();
        ticketPage.fillForm();
    }

    @Test
    public void addEntity1() {
        TicketPage ticketPage = new TicketPage();
        ticketPage.clearAll();
        ticketPage.fillForm2();
    }

    @Test
    public void addEntity2() {
        TicketPage ticketPage = new TicketPage();
        ticketPage.clearAll();
        ticketPage.fillForm3();
    }
}
