package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestSite {

    @BeforeAll
    static void beforeAll(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen=true;
        Configuration.pageLoadStrategy="eager";

    }
    @Test
    void fillFormTest() {
        open("/automation-practice-form");

        //$(by("for", "gender-radio-3")).selectRadio("Other");
        $(byText("Male")).click();
        $("#gender-radio-3").selectRadio("Other");

      //  $("[for=gender-radio-3]").selectRadio("Other");
       /* $("#userName").setValue("Alex Egorov");
        $("#userEmail").setValue("alex@egorov.com");
        $("#currentAddress").setValue("Some address 1");
        $("#permanentAddress").setValue("Another address 1");
        $("#submit").click();

//        $("#output").$("#name").shouldHave(text("Alex Egorov"));
        $("#output #name").shouldHave(text("Alex Egorov"));
        $("#output #email").shouldHave(text("alex@egorov.com"));
        $("#output #currentAddress").shouldHave(text("Some address 1"));
        $("#output #permanentAddress").shouldHave(text("Another address 1"));

        pattern="^([a-zA-Z0-9_\-\.]+)@([a-zA-Z0-9_\-\.]+)\.([a-zA-Z]{2,5})$"

         $("[data-testid=email]").setValue("1");
        $("input[data-testid=email]").setValue("1");
        $(by("data-testid", "email")).setValue("1");
        $x("//*[@data-testid='email']").setValue("1");
        $x("//input[@data-testid='email']").setValue("1");

        // <input type="email" class="inputtext login_form_input_box" name="email" id="email">
        $("[id=email]").setValue("1");
        $("#email").setValue("1");
        $("input#email").setValue("1");

        // <input type="email" class="inputtext login_form_input_box" name="email">
        $("[name=email]").setValue("1");
        $(byName("email")).setValue("1");

        // <input type="email" class="inputtext login_form_input_box">
        $("[class=inputtext][class=login_form_input_box]").setValue("1");
        $(".inputtext.login_form_input_box").setValue("1");
        $(".login_form_input_box").setValue("1");
        $x("//input[@class='inputtext'][@class='login_form_input_box']").setValue("1");

        // <div class="inputtext">
        //      <input type="email" class="login_form_input_box">
        // </div>
        $(".inputtext .login_form_input_box").setValue("1");
        $("div.inputtext input.login_form_input_box").setValue("1");
        $("div.inputtext").$("input.login_form_input_box").setValue("1");

        // <div>Hello, qa.guru!</div>
        $x("//div[text()='Hello, qa.guru!']").click();
        $(byText("Hello, qa.guru!")).click();
        $(withText("llo, qa.g")).click();
        */


    }
}
