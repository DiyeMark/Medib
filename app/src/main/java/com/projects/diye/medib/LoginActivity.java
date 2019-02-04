package com.projects.diye.medib;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.text.InputType;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private static TextView forgotPassword;
    private static TextView createAccount;
    private static Button loginBtn;
    private static EditText login_emailid, login_password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        forgotPassword = findViewById(R.id.forgot_password);
        forgotPassword.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, ForgotPasswordActivity.class);
            startActivity(intent);
        });
        createAccount = findViewById(R.id.createAccount);
        createAccount.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
            startActivity(intent);
        });

        loginBtn = findViewById(R.id.loginBtn);
        login_emailid=findViewById(R.id.login_emailid);
        login_password=findViewById(R.id.login_password);

        loginBtn.setOnClickListener(v -> {

            if (login_emailid.getText().toString().trim().equals("")) {
                login_emailid.setError("Email Required!");
            }

            if (login_password.getText().toString().trim().equals("")) {
                login_password.setError("Password Required");
            }
            else{
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }

        });

        CheckBox showPassword = findViewById(R.id.show_hide_password);
        showPassword.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                login_password.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
            } else {
                login_password.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
            }
        });
    }
}
