package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Lhl91nT6kfTkws52wBlc2Bg1oUnmQ01lvK1ggD0t")
                .clientKey("PgEyJfeKTM9ZCuieKPFqsLnMh2oqTRrd1zILFxOP")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
