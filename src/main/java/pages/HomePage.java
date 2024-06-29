package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public MenuPage goToMenuPage() {
        // Implement navigation logic to the menu page
        // e.g., click on a specific element to navigate to the menu
        return new MenuPage(driver);
    }
}
