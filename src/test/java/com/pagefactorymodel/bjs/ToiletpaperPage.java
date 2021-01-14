package com.pagefactorymodel.bjs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToiletpaperPage {

public WebDriver driver;	
	
public ToiletpaperPage(WebDriver driver) {
	
	this.driver=driver;
	
	PageFactory.initElements(driver, this);	
	
	
}	
	
@FindBy(xpath="//input[@id='searchTerm']")	
	public WebElement searchbutton;
public void getsearchbutton() {
	searchbutton.click();
}
@FindBy(xpath="(//a[@class='cat-link'])[2]")

public WebElement selectpaper;
public void gettoiletpaper() {
	selectpaper.click();
}
@FindBy(xpath="(//button[@class='red-btn height-each-btn'])[1]")
public WebElement choosescoot;
public void getchoosescoot() {
	choosescoot.click();
}
}
