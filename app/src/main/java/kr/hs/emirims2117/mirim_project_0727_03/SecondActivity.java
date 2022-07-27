package kr.hs.emirims2117.mirim_project_0727_03;

import androidx.appcompat.app.AppCompatActivity;

import android.app.UiAutomation;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
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