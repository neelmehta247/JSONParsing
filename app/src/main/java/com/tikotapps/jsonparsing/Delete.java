package com.tikotapps.jsonparsing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by neel on 11/06/15.
 */
public class Delete extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.delete);
        (findViewById(R.id.yes)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent result = new Intent(Delete.this, MainActivity.class);
                result.putExtra("qwerty", 0);
                setResult(RESULT_OK, result);
                finish();
            }
        });
        (findViewById(R.id.no)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent result = new Intent(Delete.this, MainActivity.class);
                result.putExtra("qwerty", 1);
                setResult(RESULT_OK, result);
                finish();
            }
        });
    }

}
