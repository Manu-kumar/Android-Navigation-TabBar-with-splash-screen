package com.manukumar.tabbar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by manu.kumar on 8/31/2017.
 */

public class Tab3 extends Fragment {
    WebView hubspot_form;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.activity_tab3, container, false);

        return rootView;
    }
}
