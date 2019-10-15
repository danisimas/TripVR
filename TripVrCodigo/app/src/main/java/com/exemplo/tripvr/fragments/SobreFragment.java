package com.exemplo.tripvr.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;

import com.exemplo.tripvr.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SobreFragment extends Fragment {

    WebView mWebView;



    public SobreFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_sobre, container, false);




    }

}
