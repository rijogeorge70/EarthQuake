package com.example.user.earthquake;

import android.util.Log;

import static android.content.ContentValues.TAG;

/**
 * Created by User on 03/Jul/2017.
 */

public class earthquake {


    private String mMagnitude,mpart1,mpart2,mdate,mtime,murl;

    public earthquake(String Magnitude,String part1,String part2,String date,String time,String url){

        mMagnitude = Magnitude;
        mpart1 = part1;
        mpart2 = part2;
        mdate = date;
        mtime = time;
        murl = url;

    }
    public earthquake(String magnitude, long location, double time, String url){
        geturl();
        Log.d(TAG,"hey this is your url :"+ murl);
    }

    public String getmagnitude(){return mMagnitude; }
    public String getMpart1(){return mpart1;}
    public String getMpart2(){return mpart2;}
    public String getMdate(){return  mdate;}
    public String getMtime(){return mtime;}
    public String geturl(){return murl;}

}
