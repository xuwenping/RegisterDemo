package com.example.administrator.resgistdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/3/9.
 */
public class TitleLayout extends LinearLayout implements View.OnClickListener{

    private Button closeBtn;

    private Button actionBtn;

    private TextView titleContent;

    private Button loginBtn;

    public TitleLayout(Context context, AttributeSet attribute) {
        super(context, attribute);
        LayoutInflater.from(context).inflate(R.layout.title, this);

        closeBtn = (Button) findViewById(R.id.close_btn);
        closeBtn.setOnClickListener(this);

        actionBtn = (Button) findViewById(R.id.action_btn);
        actionBtn.setOnClickListener(this);



        titleContent = (TextView) findViewById(R.id.title_content);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.close_btn:
                ((LoginActivity) getContext()).finish();
                break;

            case R.id.action_btn:

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
