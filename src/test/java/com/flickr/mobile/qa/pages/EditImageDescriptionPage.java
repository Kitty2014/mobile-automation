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
public class EditImageDescriptionPage extends AbstractPage{

    public EditImageDescriptionPage(AppiumDriver driver){
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @iOSFindBy(name = "Close")
    private WebElement btnClose;

    @iOSFindBy(name = "Edit Description")
    private WebElement txtDescription;

    @iOSFindBy(name = "Done")
    private WebElement btnDone;

    @iOSFindBy(name = "Caption")
    private WebElement editCaption;

    public ImageInfoPage clickCloseBtn(){
        btnClose.click();
        return new ImageInfoPage(driver);
    }

    public boolean verifyTitleTxt(){
        return txtDescription.isDisplayed();
    }

    public ImageInfoPage clickDoneBtn(){
        btnDone.click();
        return new ImageInfoPage(driver);
    }

    public void setCaptionEdit(String txtTitle){
        editCaption.clear();
        editCaption.sendKeys(txtTitle);
    }

    public String getCaptionEditText(){
        return editCaption.getAttribute("value");
    }

    public void clearCaptionEdit(){
        editCaption.clear();
    }

    public boolean verifyCaptionEdit(String newTitle){
        return editCaption.getAttribute("value").equals(newTitle);
    }
}
