package com.example.krish.medical_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    public static final String LOGIN_URL = "http://parinishah.esy.es/Login_check.php";

    public static final String KEY_USERNAME="username";
    public static final String KEY_PASSWORD="password";

    private EditText Email;
    private EditText Password;
    private TextView Sign_up;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Email = (EditText)findViewById(R.id.et_login_email);
        Password = (EditText)findViewById(R.id.et_login_password);
        Sign_up = (TextView)findViewById(R.id.tv_login_signup);
        Login = (Button)findViewById(R.id.btn_login_login);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Launch_Homepage();
            }
        });

        Sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Launch_Signup();
            }
        });

    }
    public void Launch_Homepage()
    {

    }

    public void Launch_Signup()
    {

    }
}
