package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.browser.Waits;

public class FinishWebPage {

	public WebDriver driver;

	public Waits wait;

	public FinishWebPage(WebDriver driver) {

		this.driver = driver;
		wait = new Waits(driver);
	}

	public WebElement getUsuarioCriadoSucessoLabelText() {

		return wait.visibilityOfElement(By.id("notice"));

	}

	public WebElement getBackButton() {

		return driver.findElement(By.xpath("//div[@class='col s12 center']/a[@href='/users']"));

	}

}
