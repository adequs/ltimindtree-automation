package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPage extends BasePage {

    public MenuPage(WebDriver driver) {
        super(driver);
    }

    public void selectMenuItem(String menuName) {
        WebElement menu = driver.findElement(By.linkText(menuName));
        click(menu);
    }

    public void selectDropdownItem(String menuName, String subMenuName) {
        WebElement menu = driver.findElement(By.linkText(menuName));
        click(menu);
        WebElement subMenu = driver.findElement(By.linkText(subMenuName));
        click(subMenu);
    }
}
