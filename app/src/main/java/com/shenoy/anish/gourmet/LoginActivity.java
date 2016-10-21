package com.shenoy.anish.gourmet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {
    EditText mUsernameEditText;
    EditText mPasswordEditText;
    ImageView mBackgroundImageView;
    Button mSignUpButton;
    Button mLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mBackgroundImageView = (ImageView) findViewById(R.id.backgroundImage);
        mSignUpButton = (Button) findViewById(R.id.registerButton);
        mLoginButton = (Button) findViewById(R.id.loginButton);
        /*
        //mUsernameEditText = (EditText) findViewById(R.id.usernameField);
        //mPasswordEditText = (EditText) findViewById(R.id.passwordField);

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {String username = mUsernameEditText.getText().toString();
               String password = mPasswordEditText.getText().toString();

                username = username.trim();
                password = password.trim();

                if (username.isEmpty() || password.isEmpty()) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                    builder.setMessage(R.string.login_error_message);
                    builder.setTitle(R.string.login_error_title);
                    builder.setPositiveButton("ok", null);
                    AlertDialog dialog = builder.create();
                    dialog.show();
                } else {
                    postLogin(username, password);
                }
            }
        });
        */
    }
 /*
    public void postLogin(String username, String password) {
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        intent.putExtra(getResources().getString(R.string.usernameIntentExtra), username);
        intent.putExtra(getResources().getString(R.string.passwordIntentExtra), password);
        startActivity(intent);
    }
    */

}
