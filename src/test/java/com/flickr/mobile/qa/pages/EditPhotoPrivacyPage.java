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
public class EditPhotoPrivacyPage extends AbstractPage{

    public EditPhotoPrivacyPage(AppiumDriver driver){
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @iOSFindBy(name = "Change Photo Privacy")
    private WebElement txtPhotoPrivacy;

    @iOSFindBy(name = "Public")
    private WebElement btnPublic;

    @iOSFindBy(name = "Friends")
    private WebElement btnFriends;

    @iOSFindBy(name = "Family")
    private WebElement btnFamily;

    @iOSFindBy(name = "Friends & Family")
    private WebElement btnFriendsAndFamily;

    @iOSFindBy(name = "Private")
    private WebElement btnPrivate;

    @iOSFindBy(name = "Cancel")
    private WebElement btnCancel;

    public boolean verifyPhotoPrivacyTitle(){
        return txtPhotoPrivacy.isDisplayed();
    }

    public ImageInfoPage clickPublicBtn(){
        btnPublic.click();
        return new ImageInfoPage(driver);
    }

    public boolean verifyPublicBtn(){
        return btnPublic.isDisplayed();
    }

    public ImageInfoPage clickFriendsBtn(){
        btnFriends.click();
        return new ImageInfoPage(driver);
    }

    public boolean verifyFriendsBtn(){
        return btnFriends.isDisplayed();
    }

    public ImageInfoPage clickFamilyBtn(){
        btnFamily.click();
        return new ImageInfoPage(driver);
    }

    public boolean verifyFamilyBtn(){
        return btnFamily.isDisplayed();
    }

    public ImageInfoPage clickFriendsAndFamilyBtn(){
        btnFriendsAndFamily.click();
        return new ImageInfoPage(driver);
    }

    public boolean verifyFriendsAndFamilyBtn(){
        return btnFriendsAndFamily.isDisplayed();
    }

    public ImageInfoPage clickPrivateBtn(){
        btnPrivate.click();
        return new ImageInfoPage(driver);
    }

    public boolean verifyPrivateBtn(){
        return btnPrivate.isDisplayed();
    }

    public ImageInfoPage clickCancelBtn(){
        btnCancel.click();
        return new ImageInfoPage(driver);
    }

    public boolean verifyCancelBtn(){
        return btnCancel.isDisplayed();
    }
}
