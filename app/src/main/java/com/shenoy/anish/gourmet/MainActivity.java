package com.shenoy.anish.gourmet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        isUserLoggedIn();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void isUserLoggedIn() {
        Intent origIntent = getIntent();
        if (!(origIntent.hasExtra(getResources().getString(R.string.usernameIntentExtra)) &&
                origIntent.hasExtra(getResources().getString(R.string.passwordIntentExtra)))) {
            Intent intent = new Intent(this, LoginActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            finish();
        }
    }
}
