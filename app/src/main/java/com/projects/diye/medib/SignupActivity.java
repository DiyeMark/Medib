package com.projects.diye.medib;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {

    private static TextView already_user;
    private static Button signUpBtn;
    private static EditText fullName, userEmailId, mobileNumber, location, password, confirmPassword;
    private CheckBox terms_conditions;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        already_user = findViewById(R.id.already_user);
        already_user.setOnClickListener(v -> {
            Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
            startActivity(intent);
        });

        fullName = findViewById(R.id.fullName);
        userEmailId = findViewById(R.id.userEmailId);
        mobileNumber = findViewById(R.id.mobileNumber);
        location = findViewById(R.id.location);
        password = findViewById(R.id.password);
        confirmPassword = findViewById(R.id.confirmPassword);
        signUpBtn = findViewById(R.id.signUpBtn);

        signUpBtn.setEnabled(false);

        terms_conditions = findViewById(R.id.terms_conditions);

        terms_conditions.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                //Toast.makeText(getApplicationContext(), "Checked", Toast.LENGTH_LONG).show();
                signUpBtn.setEnabled(true);
            }
            else {
                //Toast.makeText(getApplicationContext(), "UnChecked", Toast.LENGTH_LONG).show();
                signUpBtn.setEnabled(false);
            }
        });

        signUpBtn.setOnClickListener(v -> {

            if (fullName.getText().toString().trim().equals("")) {
                fullName.setError("User Name Required");
            }
            if (userEmailId.getText().toString().trim().equals("")) {
                userEmailId.setError("Email Required");
            }
            if (mobileNumber.getText().toString().trim().equals("")) {
                mobileNumber.setError("Password Required");
            }
            if (location.getText().toString().trim().equals("")) {
                location.setError("Password Required");
            }
            if (password.getText().toString().trim().equals("")) {
                password.setError("Password Required");
            }
            else{
                if(password.getText().toString().trim().equals(confirmPassword.getText().toString().trim())){
                    Intent intent = new Intent(SignupActivity.this, MainActivity.class);
                    startActivity(intent);
                }
                else{
                    confirmPassword.setError("Passwords Don't Match");
                }
            }
        });
    }
}
