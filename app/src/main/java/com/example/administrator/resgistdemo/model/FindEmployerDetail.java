package com.example.administrator.resgistdemo.model;

/**
 * Created by Administrator on 2017/3/17.
 */
public class FindEmployerDetail {

    /**
     * 雇主要求护工的服务时间段
     */
    private String mServerDatePeriod;

    /**
     * 雇主提供的价格(按小时计价)
     */
    private String mPrice;

    /**
     * 雇主要求护工服务的地址
     */
    private String mAddress;

    public FindEmployerDetail(String serverDatePeriod, String price, String address) {

        mServerDatePeriod = serverDatePeriod;
        mPrice = price;
        mAddress = address;
    }

    public String getmServerDatePeriod() {
        return mServerDatePeriod;
    }

    public String getmPrice() {
        return mPrice;
    }

    public String getmAddress() {
        return mAddress;
    }
}
