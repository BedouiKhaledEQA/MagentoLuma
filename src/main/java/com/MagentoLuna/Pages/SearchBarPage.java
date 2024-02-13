package com.MagentoLuna.Pages;

import com.MagentoLuna.Base;
import com.MagentoLuna.Locators.SearchBarLocators;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class SearchBarPage extends SearchBarLocators {
    public SearchBarPage(){
        PageFactory.initElements(driver,this);
    }
    public void performSearchBar() throws InterruptedException {
        SearchBar.sendKeys(Base.props.getProperty("searchBar"));
        Thread.sleep(2000);
        SearchBar.sendKeys(" ");
        Thread.sleep(2000);
        SearchBar.sendKeys(Keys.BACK_SPACE);
        Thread.sleep(5000);
        List<WebElement> lists =driver.findElements(By.xpath("//ul[@role='listbox']"));
        for (WebElement list : lists) {
            if (list.getText().contains("tshirts for men")) {
                list.click();
                break;
        }

    }}
    public void performResultDisplay(){
        Assert.assertTrue((ResultSearch).isDisplayed());

    }
}
