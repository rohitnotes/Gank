package com.example.chen.gank.utils;

import android.annotation.SuppressLint;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/**
 * @author : chenshuaiyu
 * @date : 2019/3/17 15:10
 */
public class BottomNavigationViewUtils {
    @SuppressLint({"RestrictedApi", "WrongConstant"})
    public static void disableShiftMode(BottomNavigationView view) {
        BottomNavigationMenuView menuView = (BottomNavigationMenuView) view.getChildAt(0);
        try {
            menuView.setLabelVisibilityMode(1);
            for (int i = 0; i < menuView.getChildCount(); i++) {
                BottomNavigationItemView item = (BottomNavigationItemView) menuView.getChildAt(i);
                item.setShifting(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
