package com.example.wayne1838.side;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //super引用父類別
        super.onCreate(savedInstanceState);
        //設定使用的view
        setContentView(R.layout.activity_main);
        //設定button01 為Button元件  利用id在view中選找某元件
        Button button01 = (Button)findViewById(R.id.btnEnter);
        //為button01設定監聽 new一個按鈕按下後 將啟用的方法
        button01.setOnClickListener(new Button.OnClickListener() {

            public void onClick(View v) {

                // TODO Auto-generated method stub
                //設置一個intent來開啟另一個activity
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, TalkMain.class);
                startActivity(intent);

                //關閉這個activity
                MainActivity.this.finish();

            }

        });

    }

}
