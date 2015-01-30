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
public class ImageInfoPage extends AbstractPage{

    public ImageInfoPage(AppiumDriver driver){
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @iOSFindBy(name = "Edit TITLE")
    private WebElement btnEditTitle;

    @iOSFindBy(name = "Edit DESCRIPTION")
    private WebElement btnEditDescription;

    @iOSFindBy(name = "Edit PRIVACY")
    private WebElement btnEditPrivacy;

    @iOSFindBy(name = "Edit PEOPLE IN THIS PHOTO")
    private WebElement btnEditPeople;


    public EditImageTitlePage clickEditTitleBtn(){
        btnEditTitle.click();
        return new EditImageTitlePage(driver);
    }

    public EditImageDescriptionPage clickEditDescriptionBtn(){
        btnEditDescription.click();
        return new EditImageDescriptionPage(driver);
    }

    public EditPhotoPrivacyPage clickEditPrivacyBtn(){
        btnEditPrivacy.click();
        return new EditPhotoPrivacyPage(driver);
    }

    public  EditPeopleInThisPhotoPage clickEditPeopleBtn(){
        btnEditPeople.click();
        return new EditPeopleInThisPhotoPage(driver);
    }

}
