package com.manukumar.tabbar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by manu.kumar on 8/31/2017.
 */

public class Tab1 extends Fragment{

    public static final String TAG = Tab1.class
            .getSimpleName();

    private static Tab1 mInstance;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.activity_tab1, container, false);

        return rootView;
    }
}
