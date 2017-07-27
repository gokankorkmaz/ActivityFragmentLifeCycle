package com.androidedu.kodluyoruzakademi.activityfragmentlifecycle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by GokhanKorkmaz on 26.07.2017.
 */

public class FragmentC extends Fragment {
    private final String TAG = "FragmentC";

    public String logMetot(String TAG, String metotAdi) {
        Log.e(TAG, metotAdi);
        return metotAdi;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        logMetot(TAG, "onCreateView");

        View view = inflater.inflate(R.layout.fragmentc, container, false);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        logMetot(TAG, "onCreate");

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        logMetot(TAG, "onActivityCreated");

    }

    @Override
    public void onStart() {
        super.onStart();
        logMetot(TAG, "onStart");

    }

    @Override
    public void onResume() {
        super.onResume();
        logMetot(TAG, "onResume");

    }


    @Override
    public void onPause() {
        super.onPause();
        logMetot(TAG, "onPause");

    }

    @Override
    public void onStop() {
        super.onStop();
        logMetot(TAG, "onStop");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        logMetot(TAG, "onDestroy");

    }
}
