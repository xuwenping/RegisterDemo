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

    public TitleLayout(Context context, AttributeSet attribute) {
        super(context, attribute);
        LayoutInflater.from(context).inflate(R.layout.title, this);


    }

    @Override
    public void onClick(View view) {

    }
}
