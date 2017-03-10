package com.example.administrator.resgistdemo.customLayout;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.administrator.resgistdemo.R;
import com.example.administrator.resgistdemo.activity.LoginActivity;
import com.example.administrator.resgistdemo.activity.MainActivity;

/**
 * Created by Administrator on 2017/3/9.
 */
public class TitleLayout extends LinearLayout implements View.OnClickListener{

    private Button closeBtn;

    private Button actionBtn;

    private TextView titleContent;

    private Context mContext;

    public TitleLayout(Context context, AttributeSet attribute) {
        super(context, attribute);
        LayoutInflater.from(context).inflate(R.layout.title, this);

        mContext = context;

        closeBtn = (Button) findViewById(R.id.close_btn);
        closeBtn.setOnClickListener(this);

        actionBtn = (Button) findViewById(R.id.action_btn);
        actionBtn.setOnClickListener(this);
        titleContent = (TextView) findViewById(R.id.title_content);
    }

    @Override
    public void onClick(View view) {
        String str = titleContent.getText().toString();
        Intent intent = null;
        switch (view.getId()) {
            case R.id.close_btn:
                if (str.equals("注册")) {
                    ((MainActivity) getContext()).finish();
                }

                if (str.equals("登录")) {
                    ((LoginActivity) getContext()).finish();
                }

                break;

            case R.id.action_btn:
                if (str.equals("注册")) {
                    intent = new Intent(mContext, LoginActivity.class);
                    mContext.startActivity(intent);
                }

                if (str.equals("登录")) {
                    intent = new Intent(mContext, MainActivity.class);
                    mContext.startActivity(intent);
                }
                break;

            default:
                break;
        }
    }

    public void setActionBtnText(String text) {
        actionBtn.setText(text);
    }

    public void setTitleContent(String text) {
        titleContent.setText(text);
    }
}
