package com.tikotapps.jsonparsing;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by neel on 11/06/15.
 */
public class SingleContactActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);
        ((TextView) findViewById(R.id.email)).setText(getIntent().getExtras().getString(MainActivity.TAG_EMAIL));
        ((TextView) findViewById(R.id.mobile)).setText(getIntent().getExtras().getString(MainActivity.TAG_PHONE_MOBILE));
        ((TextView) findViewById(R.id.name)).setText(getIntent().getExtras().getString(MainActivity.TAG_NAME));

    }
}
