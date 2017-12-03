package com.selenium.test.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CapitaTest {

    @BeforeTest
    public void setUp(){
        Configuration.browser="Chrome";
    }

    @Test
    public void verifySoonTextOnPage() {

        open("https://www.traektoria.ru/product/310205_snoubord-capita-spring-break-slush-slasher/");

        $(By.className("soon_text")).shouldBe(Condition.visible);

    }
}
