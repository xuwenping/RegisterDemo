package com.example.administrator.resgistdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener {

    private EditText useName;
    private EditText passwd;
    private EditText rePasswd;
    private EditText registerPhone;
    private EditText phoneVerifyCode;
    private Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        useName = (EditText) findViewById(R.id.user_name);
        passwd = (EditText) findViewById(R.id.passwd);
        rePasswd = (EditText) findViewById(R.id.repasswd);
        registerPhone = (EditText) findViewById(R.id.register_phone);
        phoneVerifyCode = (EditText) findViewById(R.id.phono_num_verify_no);

        registerBtn = (Button) findViewById(R.id.register);
        registerBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.register:
                //if (useName.getText().toString().isEmpty()) {
                //    Toast.makeText(this, "请输入用户名", Toast.LENGTH_SHORT).show();
                //    break;
                //}

                //if (passwd.getText().toString().isEmpty()) {
                //    Toast.makeText(this, "请输入密码", Toast.LENGTH_SHORT).show();
                //    break;
                //}

                //if (rePasswd.getText().toString().isEmpty()) {
                //    Toast.makeText(this, "请输入确认密码", Toast.LENGTH_SHORT).show();
                //    break;
                //}

                //if (!rePasswd.getText().toString().equals(passwd.getText().toString())) {
                //    Toast.makeText(this, "密码不一致", Toast.LENGTH_SHORT).show();
                //    break;
                //}

                //if (registerPhone.getText().toString().isEmpty()) {
                //    Toast.makeText(this, "请输入手机号", Toast.LENGTH_SHORT).show();
                //    break;
                //}

                //if (phoneVerifyCode.getText().toString().isEmpty()) {
                //    Toast.makeText(this, "验证码不能为空", Toast.LENGTH_SHORT).show();
                //    break;
                //}

//                Intent intent = new Intent(this, RegisterSuccessActivity.class);
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                break;

            default:
                break;
        }
    }
}
