package com.example.administrator.resgistdemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.administrator.resgistdemo.R;
import com.example.administrator.resgistdemo.customLayout.TitleLayout;
import com.example.administrator.resgistdemo.util.ConstUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends Activity implements View.OnClickListener {

    private TitleLayout titleLayout;

    private EditText passwd;
    private EditText registerPhone;
    private EditText phoneVerifyCode;
    private Button registerBtn;
    private Button verifyBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titleLayout = (TitleLayout) findViewById(R.id.title_layout);
        titleLayout.setActionBtnText("登录");
        titleLayout.setTitleContent("注册");

        passwd = (EditText) findViewById(R.id.input_passwd);
        registerPhone = (EditText) findViewById(R.id.input_phone);
        phoneVerifyCode = (EditText) findViewById(R.id.input_verify_code);

        registerBtn = (Button) findViewById(R.id.register_btn);
        registerBtn.setOnClickListener(this);

        verifyBtn = (Button) findViewById(R.id.send_verify_code_btn);
        verifyBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.register_btn:
                String phoneContent = registerPhone.getText().toString();
                if (phoneContent.isEmpty()) {
                    Toast.makeText(this, "请输入电话号码", Toast.LENGTH_SHORT).show();
                    break;
                }

                Pattern p = Pattern.compile(ConstUtils.REGEX_MOBILE_EXACT);
                Matcher m = p.matcher(phoneContent);
                if (!m.find()) {
                    Toast.makeText(this, "电话号码格式不正确", Toast.LENGTH_SHORT).show();
                    break;
                }

                String passwdContent = passwd.getText().toString();
                if (passwdContent.isEmpty()) {
                    Toast.makeText(this, "请输入密码", Toast.LENGTH_SHORT).show();
                    break;
                }

                if (phoneVerifyCode.getText().toString().isEmpty()) {
                    Toast.makeText(this, "验证码不能为空", Toast.LENGTH_SHORT).show();
                    break;
                }

                if (phoneVerifyCode.getText().toString().isEmpty()) {
                    Toast.makeText(this, "请填入验证码", Toast.LENGTH_SHORT).show();
                }

//                Intent intent = new Intent(this, RegisterSuccessActivity.class);
                Toast.makeText(this, "注册成功", Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }
    }
}
