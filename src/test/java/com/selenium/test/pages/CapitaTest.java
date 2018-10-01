package com.selenium.test.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class CapitaTest {

    @BeforeTest
    public void setUp(){
        Configuration.browser="Chrome";
    }

    @Test
    public void verifySoonTextOnPage() {

        open("https://www.traektoria.ru/product/310205_snoubord-capita-spring-break-slush-slasher/");

        $(By.className("nothing_text")).shouldBe(Condition.visible);
    }
    @Test
    public void verifySlusher() {
        open ("https://www.traektoria.ru/brand/capita/");
        $$(By.xpath("//div[@class='p_info_name']")).findBy((Condition.text("Сноуборд CAPITA SPRING BREAK - SLUSH SLASHER"))).shouldNotBe(Condition.visible);
    }
    @Test
    public void verifyMetallicaTickets() {
        open ("https://msk.kassir.ru/koncert/ok-lujniki/metallica-worldwired-tour-2019_2019-07-21");
        $$(By.xpath("//*[@id=\"prices\"]/table")).findBy((Condition.text("ФАН-ЗОНА"))).shouldNotBe(Condition.visible);
    }
}
