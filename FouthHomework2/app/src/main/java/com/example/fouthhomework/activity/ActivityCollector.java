package com.example.fouthhomework.activity;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 2021/3/29.
 */

public class ActivityCollector {
    public static List<Activity> activities = new ArrayList<>();
    public static void addActivity(Activity activity){
        activities.add(activity);
    }
    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }
    public static void finishAll(){
        for (Activity activity:activities) {
            activity.finish();
        }
        activities.clear();
    }
}

