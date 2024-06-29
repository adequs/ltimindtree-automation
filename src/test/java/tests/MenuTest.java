package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.MenuPage;

public class MenuTest extends BaseTest {

    @Test
    public void testMenuNavigation() {
        HomePage homePage = new HomePage(driver);
        MenuPage menuPage = homePage.goToMenuPage();

        menuPage.selectMenuItem("Services");
        // Add assertions to verify correct page navigation

        menuPage.selectDropdownItem("Industries", "Banking");
        // Add assertions to verify correct submenu navigation
    }
}
