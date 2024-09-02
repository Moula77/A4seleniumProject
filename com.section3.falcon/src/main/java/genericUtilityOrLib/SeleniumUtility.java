package genericUtilityOrLib;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumUtility {
	WebDriver driver=null;
	Actions act=null;
	Select s=null;
	
	public void implicitWait(WebDriver driver ,int particularSeconds)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(particularSeconds));
		
	}
public void maximizeWindow(WebDriver driver)
{
	driver.manage().window().maximize();
}
public void rightClickOnAnElement(WebDriver driver,WebElement element)
{
	act=new Actions(driver);
	act.contextClick(element).perform();
}
public void clickOnAnElement(WebDriver driver,WebElement element) {
	act=new Actions(driver);
	act.click(element).perform();
}
public void dragAndDropAnElement(WebDriver driver,WebElement src,WebElement target){
	act=new Actions(driver);
	act.dragAndDrop(src,target);
	
}
public void dragAPointer(WebDriver driver,WebElement src,int xOffset,int yOffset) {
	act=new Actions(driver);
	act.dragAndDropBy(src, xOffset, yOffset);
}
public void scrollToParticularElement(WebDriver driver,WebElement element) {
	act=new Actions(driver);
	act.scrollToElement(element).perform();

}
public void moveCursorToAnELement(WebDriver driver,WebElement element) {
	act=new Actions(driver);
	act.moveToElement(element).perform();
	
	
}
public void holdAnElement(WebDriver driver,WebElement element) {
	act=new Actions(driver);
	act.clickAndHold(element).perform();
}
public void releaseAnElemnt(WebDriver driver,WebElement element) {
	act=new Actions(driver);
	act.release(element).perform();
}
public void selectElementByIndex(WebElement element,int indexNum) {
	s=new Select(element);
	s.selectByIndex(indexNum);
	
}
public void selectElementByVisibleText(WebElement element,String text) {
	s=new Select(element);
	s.selectByVisibleText(text);
	
}
public void selectElementByValue(WebElement element,String value) {
	s=new Select(element);
	s.selectByValue(value);
	
}
public void deSelectElementByIndex(WebElement element,int indexNum) {
	s=new Select(element);
	s.deselectByIndex(indexNum);
	
}
public void deSelectElementByVisibleText(WebElement element,String text) {
	s=new Select(element);
	s.deselectByVisibleText(text);
	
}
public void deSelectElementByValue(WebElement element,String value) {
	s=new Select(element);
	s.deselectByValue(value);
	
}
public void deSelectAllOptions(WebElement element) {
	s=new Select(element);
	s.deselectAll();
}
public List<WebElement> fetchAllSelectedOptions(WebElement element){
	s=new Select(element);
	List<WebElement> all=s.getAllSelectedOptions();
	return all;
	
}
public List<WebElement> fetchAllOptions(WebElement element){
	s=new Select(element);
	List<WebElement> all=s.getOptions();
	return all;
	
}
public void acceptAlert() {
	driver.switchTo().alert().accept();
}
public void dismissAlert() {
	driver.switchTo().alert().dismiss();
}
public void switchTochildFrame(int childFrameindex) {
	driver.switchTo().frame(childFrameindex);
}

}
