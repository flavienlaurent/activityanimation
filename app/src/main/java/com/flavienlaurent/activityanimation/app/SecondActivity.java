package com.flavienlaurent.activityanimation.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class SecondActivity extends AnimatedRectActivity implements View.OnClickListener {

    private Button mNext;

    @Override
    protected int layoutResId() {
        return R.layout.activity_second;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        findViews();

        mNext.setOnClickListener(this);
    }

    private void findViews() {
        mNext = (Button) findViewById(R.id.next);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, ThirdActivity.class);
        intent.putExtra("animation_type", mAnimationType);
        startActivity(intent);
        overridePendingTransition(0, 0);
    }
}
