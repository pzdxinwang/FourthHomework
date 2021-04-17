package com.example.fouthhomework.activity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by ASUS on 2021/3/29.
 */
public class BaseActivity extends AppCompatActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
