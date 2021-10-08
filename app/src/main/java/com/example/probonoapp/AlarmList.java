package com.example.probonoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AlarmList extends AppCompatActivity {

    @Override
    public void onBackPressed() { //뒤로가기
        super.onBackPressed();
        Intent intent = new Intent(AlarmList.this, MenuActivity.class); //지금 액티비티에서 다른 액티비티로 이동하는 인텐트 설정
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);    //인텐트 플래그 설정
        startActivity(intent);  //인텐트 이동
        finish();   //현재 액티비티 종료
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_list);

        Button emergencyButton = (Button)findViewById(R.id.emergencyButton);
        Button getFallButton = (Button)findViewById(R.id.fallButton);


        emergencyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlarmList.this, Push_emergency_button.class); //화면 이동
                startActivity(intent);
                finish(); // 현재 액티비티 파괴
            }
        });

        getFallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(AlarmList.this, Emergency_getFall.class);
                startActivity(intent2);
                finish();
            }
        });
    }
}