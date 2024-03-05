package com.MagentoLuna.Apis;

import com.MagentoLuna.Base;
import com.MagentoLuna.Pages.UserPage;

public class UserApi extends Base {
    private static UserApi userApi;
    private UserApi(){}
    public static UserApi getInstance(){
        if ((userApi == null)) {

            userApi =new UserApi();
        }return userApi;}

 /*  public Response register(UserPage user){
           Response response =  RestAssured.given()
                   .baseUri(props.getProperty("url"))
                   .multiPart("form_key", "pPUdkdgMxv88XwtL")
                   .multiPart("success_url", "")
                   .multiPart("error_url", "")
                   .multiPart("firstname", "TEETETE")
                   .multiPart("lastname", "TETETET")
                   .multiPart("email", "testermob5eea@gmail.com")
                   .multiPart("password", "Test1234")
                   .multiPart("password_confirmation", "Test1234")
                   .contentType(ContentType.MULTIPART)
                   //.contentType(ContentType.JSON)
                   // .body(user)
                   .when()
                   .post("/customer/account/createpost/")
                   .then()
                   //.log().all()
                   .extract().response();
           String access_token = response.path("access_token");
           String firstName = response.path("firstName");
           System.out.println(firstName);


       return response;
   }*/


   }

