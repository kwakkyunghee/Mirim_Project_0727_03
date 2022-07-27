package kr.hs.emirims2117.mirim_project_0727_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    EditText editTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg = findViewById(R.id.rg);
        editTitle = findViewById(R.id.edit_title);
        Button btnStart = findViewById(R.id.btn_start);
        btnStart.setOnClickListener(btnStartListener);
    }
    View.OnClickListener btnStartListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Class c = null;
            switch(rg.getCheckedRadioButtonId()){
                case R.id.rb_second:
                    c = SecondActivity.class;
                    break;
                case R.id.rb_thied:
                    c = ThirdActivity.class;
                    break;
            }
            Intent intent = new Intent(getApplicationContext(), c);
            intent.putExtra("title", editTitle.getText().toString());
            startActivity(intent);
        }
    };

}