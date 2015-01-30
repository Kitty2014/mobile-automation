package com.flickr.mobile.qa.pages;

import com.flickr.mobile.qa.utils.AbstractPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by srikanthv on 1/29/15.
 */
public class EditPeopleInThisPhotoPage extends AbstractPage{

    public EditPeopleInThisPhotoPage(AppiumDriver driver){
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @iOSFindBy(name = "Close")
    private WebElement btnClose;

    @iOSFindBy(name = "Add people")
    private WebElement txtAddPeople;

    @iOSFindBy(name = "Done")
    private WebElement btnDone;

    @iOSFindBy(name = "Search people you are following")
    private WebElement editSearchPeople;

    @iOSFindBy(name = "icn search clear")
    private WebElement btnClearSearch;

    @iOSFindBy(xpath = "/UIAApplication[1]/UIAWindow[1]/UIATableView[1]")
    private WebElement viewSearchResults;

    public ImageInfoPage clickCloseBtn(){
        btnClose.click();
        return new ImageInfoPage(driver);
    }

    public boolean verifyAddPeopleTitle(){
        return txtAddPeople.isDisplayed();
    }

    public ImageInfoPage clickDoneBtn(){
        btnDone.click();
        return new ImageInfoPage(driver);
    }

    public void setSearchPeopleEdit(String txtPerson){
        editSearchPeople.sendKeys(txtPerson);
    }

    public  void clickClearSearchBtn(){
        btnClearSearch.click();
    }
}
