package com.example.administrator.resgistdemo.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.administrator.resgistdemo.R;
import com.example.administrator.resgistdemo.customLayout.TitleLayout;

public class LoginActivity extends Activity implements View.OnClickListener {

    private TitleLayout titleLayout;

    private Button loginBtn;

    private EditText passwd;
    private EditText phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        passwd = (EditText) findViewById(R.id.login_input_pwd);
        phone = (EditText) findViewById(R.id.login_input_phone);

        titleLayout = (TitleLayout) findViewById(R.id.title_layout);
        titleLayout.setTitleContent("登录");
        titleLayout.setActionBtnText("注册");

        loginBtn = (Button) findViewById(R.id.login_btn);
        loginBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.login_btn:

//                String phoneContent = phone.getText().toString();
//                if (phoneContent.isEmpty()) {
//                    Toast.makeText(this, "请输入电话号码", Toast.LENGTH_SHORT).show();
//                    break;
//                }
//
//                Pattern p = Pattern.compile(ConstUtils.REGEX_MOBILE_EXACT);
//                Matcher m = p.matcher(phoneContent);
//                if (!m.find()) {
//                    Toast.makeText(this, "电话号码格式不正确", Toast.LENGTH_SHORT).show();
//                    break;
//                }
//
//                String passwdContent = passwd.getText().toString();
//                if (passwdContent.isEmpty()) {
//                    Toast.makeText(this, "请输入密码", Toast.LENGTH_SHORT).show();
//                    break;
//                }
//
//                Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(this, FindEmployerActivity.class);
                startActivity(intent);
                finish();

                break;

            default:
                break;
        }
    }
}
