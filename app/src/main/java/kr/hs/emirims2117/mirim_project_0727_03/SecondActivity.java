package kr.hs.emirims2117.mirim_project_0727_03;

import androidx.appcompat.app.AppCompatActivity;

import android.app.UiAutomation;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();//intent와 메인액티비티에 있는 intent와 같다
        String title = intent.getStringExtra("title");//메인액티비티에 있는 name:"title" 값을 반환 받음 String title에 저장
        TextView textTitle = findViewById(R.id.text_title);
        textTitle.setText(title);
        Button btnPrev = findViewById(R.id.btn_prev);
        btnPrev.setOnClickListener(btnPrevListener);
    }

    View.OnClickListener btnPrevListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            finish();
        }
    };
}