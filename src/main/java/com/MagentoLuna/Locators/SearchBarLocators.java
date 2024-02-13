package com.MagentoLuna.Locators;

import com.MagentoLuna.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBarLocators extends Base {
    public SearchBarLocators(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "search")
    protected WebElement SearchBar;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[1]/h1[1]/span[1]")
    protected WebElement ResultSearch;
    @FindBy(id = "search_autocomplete")
    protected WebElement element;
    @FindBy(className = "base")
    protected WebElement SearchResultDisplay;

}
