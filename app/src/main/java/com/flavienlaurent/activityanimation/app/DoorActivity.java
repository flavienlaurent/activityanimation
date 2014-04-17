package com.flavienlaurent.activityanimation.app;

import android.os.Bundle;


public class DoorActivity extends AnimatedDoorActivity {

    @Override
    protected int layoutResId() {
        return R.layout.activity_door;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
