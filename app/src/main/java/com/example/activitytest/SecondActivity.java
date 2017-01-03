package com.example.activitytest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    private Button bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
//        bt2 = (Button) findViewById(R.id.button_2);
//        bt2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                  Intent intent = new Intent();
//        intent.putExtra("a", "你好啊！DIYIGE FBEJ WBFKJW B");
//        setResult(RESULT_OK, intent);
//        finish();
//            }
//        });

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("a", "你好啊！DIYIGE FBEJ WBFKJW B");
        setResult(RESULT_OK, intent);
        finish();
    }
}
