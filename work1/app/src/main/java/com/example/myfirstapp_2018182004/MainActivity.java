package com.example.myfirstapp_2018182004;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);         /// R -> 리소스 의미 생성된 클래스 안드로이드 에디터에 의해서 r.java 생성 , 수정 불가

    }


    public void onBtnPushMe(View view){
        TextView tv = findViewById(R.id.snumTextView);
        tv.setText("Push me");
    }


    public void onBtnAnother(View view) {
        TextView tv = findViewById(R.id.snumTextView);
        tv.setText("Another");
    }
}
