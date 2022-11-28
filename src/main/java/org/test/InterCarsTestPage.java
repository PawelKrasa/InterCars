package org.test;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
public class InterCarsTestPage {

    public
    SelenideElement closeCookieInfo = $x("//button[contains(@class,'CookieBannerstyled__CookieBtn-sc-ltkxr7-3')]").as("Close cookie message");
    SelenideElement popularService = $x("//article[@data-testid='popular-services-button'][1]").as("Select popular service button");
    SelenideElement popularCity = $x("//a[contains(@class,'PopularCitiesstyled__DefaultCityLink-sc-14gh73i-1')][9]").as("Select popular city Lublin");
    SelenideElement nowOpen = $x("//li[@data-testid='is-open-now-wrapper']").as("Open hours - Now open");
    SelenideElement reviewHeader = $x("//div[@data-testid='review-header']").as("Review header");
    ElementsCollection secondService = $$x("//div[@data-testid='Text__wrapper']").as("Second service from list");
    SelenideElement searchLocation = $x("//input[@data-testid='search-location-workshop']").as("Search workshop");
    SelenideElement allServiceLinkAssert = $x("//a[@data-testid='see-all-services-link']").as("Back to the search list");

    public InterCarsTestPage goToIntercarsWebsite(){
    open("https://motointegrator.com/pl/en/");
        searchLocation.shouldBe(visible);
    return this;
   }

    public InterCarsTestPage serviceTiresChange() {

        closeCookieInfo.click();
        popularService.shouldBe(visible).click();
        popularCity.shouldBe(visible).click();
        secondService.get(1).click();
        nowOpen.shouldNotBe(empty);
        reviewHeader.shouldHave(text("5"));
        allServiceLinkAssert.shouldBe(visible);
    return this;
    }
}
