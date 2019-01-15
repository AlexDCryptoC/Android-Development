package com.prototype.dCipherChat;

import android.app.Application;
import android.util.Log;

import com.parse.Parse;
import com.parse.ParseInstallation;

import static android.support.constraint.Constraints.TAG;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId(getString(R.string.back4app_app_id))
                // if defined
                .clientKey(getString(R.string.back4app_client_key))
                .server(getString(R.string.back4app_server_url))
                .build()
        );

        Long mySenderId = 93521143282L;

        Log.d(TAG, "something " + mySenderId);
        ParseInstallation installation = ParseInstallation.getCurrentInstallation();
        installation.put("GCMSenderId", mySenderId);
        installation.saveInBackground();

    }

}
