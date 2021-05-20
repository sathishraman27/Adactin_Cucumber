$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Searching stuff",
  "description": "",
  "id": "hotel-booking-in-adactin-application;searching-stuff",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"\u003cusername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"\u003cpassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;searching-stuff;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10,
      "id": "hotel-booking-in-adactin-application;searching-stuff;;1"
    },
    {
      "cells": [
        "ssss",
        "12345"
      ],
      "line": 11,
      "id": "hotel-booking-in-adactin-application;searching-stuff;;2"
    },
    {
      "cells": [
        "pppp",
        "2027"
      ],
      "line": 12,
      "id": "hotel-booking-in-adactin-application;searching-stuff;;3"
    },
    {
      "cells": [
        "sathishraman27",
        "Chennai4996#"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-application;searching-stuff;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Searching stuff",
  "description": "",
  "id": "hotel-booking-in-adactin-application;searching-stuff;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"ssss\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"12345\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 4341901000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ssss",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 1523294400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 160263400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 794716100,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Searching stuff",
  "description": "",
  "id": "hotel-booking-in-adactin-application;searching-stuff;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"pppp\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"2027\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 374979600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pppp",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 119074700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2027",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 126051400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 445517500,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Searching stuff",
  "description": "",
  "id": "hotel-booking-in-adactin-application;searching-stuff;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"sathishraman27\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"Chennai4996#\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 366353200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sathishraman27",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 151682500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chennai4996#",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 119064100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1357014900,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "Select location In Location Field",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Select the Hotel In Hotels Field",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Select the Room In Room Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Select the Number of rooms In Number Of Rooms Field",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Select the Check in Date In Check In Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Select the Check out Date In Check out Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Select the Adults Room In Adults Per Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Select the Children Room In Children Per Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User Click on Search Button In Search Field",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.select_location_In_Location_Field()"
});
formatter.result({
  "duration": 4403500500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.select_the_Hotel_In_Hotels_Field()"
});
formatter.result({
  "duration": 4186170000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.select_the_Room_In_Room_Type_Field()"
});
formatter.result({
  "duration": 4195366500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.select_the_Number_of_rooms_In_Number_Of_Rooms_Field()"
});
formatter.result({
  "duration": 4206175900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.select_the_Check_in_Date_In_Check_In_Date_Field()"
});
formatter.result({
  "duration": 127688600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.select_the_Check_out_Date_In_Check_out_Date_Field()"
});
formatter.result({
  "duration": 115647400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.select_the_Adults_Room_In_Adults_Per_Room_Field()"
});
formatter.result({
  "duration": 4217693900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.select_the_Children_Room_In_Children_Per_Room_Field()"
});
formatter.result({
  "duration": 4233075600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_on_Search_Button_In_Search_Field()"
});
formatter.result({
  "duration": 1056299500,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "Click on the Radio Button",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "User Click on the Continue",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.click_on_the_Radio_Button()"
});
formatter.result({
  "duration": 93636300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_on_the_Continue()"
});
formatter.result({
  "duration": 606094400,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 32,
  "name": "Enter the First name in First name field",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "Enter the Last name in Last name field",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Enter the Address in the Address field",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Enter the Card number in Card number field",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Select the Card Type in the Card type field",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Select the Expiry date and Expiry year",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Enter the CVV number in the CVV field",
  "keyword": "And "
});
formatter.match({
  "location": "Step_Definition.enter_the_First_name_in_First_name_field()"
});
formatter.result({
  "duration": 315669100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.enter_the_Last_name_in_Last_name_field()"
});
formatter.result({
  "duration": 143276600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.enter_the_Address_in_the_Address_field()"
});
formatter.result({
  "duration": 193150000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.enter_the_Card_number_in_Card_number_field()"
});
formatter.result({
  "duration": 127087200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.select_the_Card_Type_in_the_Card_type_field()"
});
formatter.result({
  "duration": 4231785300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.select_the_Expiry_date_and_Expiry_year()"
});
formatter.result({
  "duration": 8451633200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.enter_the_CVV_number_in_the_CVV_field()"
});
formatter.result({
  "duration": 139059500,
  "status": "passed"
});
});