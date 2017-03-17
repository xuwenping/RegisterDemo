package com.example.administrator.resgistdemo.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;

import com.example.administrator.resgistdemo.R;
import com.example.administrator.resgistdemo.fragment.FindEmployerFragment;

import java.util.ArrayList;
import java.util.List;

public class FindEmployerActivity extends FragmentActivity implements View.OnClickListener {

    private ViewPager mViewPager;

    private FragmentPagerAdapter mAdapter;

    private List<Fragment> mFragments;

    private LinearLayout mTabFindEmployer;
    private LinearLayout mTabFindAide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_find_employer);

        initViews();

        initEvents();

        initDatas();
    }

    @Override
    public void onClick(View view) {

    }

    private void initViews() {

        mViewPager = (ViewPager) findViewById(R.id.id_viewpager);

        mTabFindEmployer = (LinearLayout) findViewById(R.id.id_find_employer);
        mTabFindAide = (LinearLayout) findViewById(R.id.id_find_aide);
    }

    private void initEvents() {

    }

    private void initDatas() {
        mFragments = new ArrayList<Fragment>();
        mFragments.add(new FindEmployerFragment());

        mAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return mFragments.get(position);
            }

            @Override
            public int getCount() {
                return mFragments.size();
            }
        };

        mViewPager.setAdapter(mAdapter);

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                mViewPager.setCurrentItem(position);
                selectTab(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void selectTab(int position) {
        mViewPager.setCurrentItem(position);
    }
}
