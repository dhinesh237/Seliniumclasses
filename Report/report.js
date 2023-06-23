$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/sample.Feature");
formatter.feature({
  "name": "To validate the account creation of fb application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To create new account",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To launch the chrome browser and maximise window",
  "keyword": "Given "
});
formatter.match({
  "location": "FbLoginPage.to_launch_the_chrome_browser_and_maximise_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch the url of fb app",
  "keyword": "When "
});
formatter.match({
  "location": "FbLoginPage.to_launch_the_url_of_fb_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the create new account button",
  "keyword": "And "
});
formatter.match({
  "location": "FbLoginPage.to_click_the_create_new_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass firstname in firstname text box",
  "rows": [
    {
      "cells": [
        "selein",
        ""
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "FbLoginPage.to_pass_firstname_in_firstname_text_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass secondname in secondname text box",
  "keyword": "And "
});
formatter.match({
  "location": "FbLoginPage.to_pass_secondname_in_secondname_text_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass phno or email in email text box",
  "rows": [
    {
      "cells": [
        "abcdef@gmail.com",
        "123456789",
        "sdfghjkj@gmail.com",
        "12345678909"
      ]
    },
    {
      "cells": [
        "automation@",
        "1234566",
        "iphones@gmail.com",
        "23456788765"
      ]
    },
    {
      "cells": [
        "always@gmail.com",
        "123433556",
        "zxcgf@gmail.com",
        "2345 678765"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "FbLoginPage.to_pass_phno_or_email_in_email_text_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To create new password using new password text box",
  "keyword": "And "
});
formatter.match({
  "location": "FbLoginPage.to_create_new_password_using_new_password_text_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FbLoginPage.to_close_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
});