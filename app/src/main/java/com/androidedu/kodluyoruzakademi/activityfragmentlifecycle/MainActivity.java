package com.androidedu.kodluyoruzakademi.activityfragmentlifecycle;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "MainActivity";

    public String logMetot(String TAG, String metotAdi) {
        Log.e(TAG, metotAdi);
        return metotAdi;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logMetot(TAG, "onCreate");
        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Fragment sagFragment = new FragmentC();

        fragmentTransaction.add(R.id.linearLayout, sagFragment);

        fragmentTransaction.commit();


    }

    @Override
    protected void onStart() {
        super.onStart();
        logMetot(TAG, "onStart");

    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
        logMetot(TAG, "onRestoreInstanceState");

    }

    @Override
    protected void onResume() {
        super.onResume();
        logMetot(TAG, "onResume");

    }


    @Override
    protected void onRestart() {
        super.onRestart();
        logMetot(TAG, "onRestart");

    }

    @Override
    protected void onStop() {
        super.onStop();
        logMetot(TAG, "onStop");

    }

    @Override
    protected void onPause() {
        super.onPause();
        logMetot(TAG, "onPause");

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        logMetot(TAG, "onSaveInstanceState");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        logMetot(TAG, "onDestroy");

    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        logMetot(TAG, "onAttachFragment");

    }
}
