package com.example.setweightprogrammatically;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    EditText et2;
    EditText et3;
    Button btnApply;
    FrameLayout frLayout1;
    FrameLayout frLayout2;
    FrameLayout frLayout3;

    LinearLayout.LayoutParams params1;
    LinearLayout.LayoutParams params2;
    LinearLayout.LayoutParams params3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        btnApply = findViewById(R.id.btnApply);
        frLayout1 = findViewById(R.id.piece1);
        frLayout2 = findViewById(R.id.piece2);
        frLayout3 = findViewById(R.id.piece3);

        btnApply.setOnClickListener(btnApplyListener);

        params1 = (LinearLayout.LayoutParams) frLayout1.getLayoutParams();
        params2 = (LinearLayout.LayoutParams) frLayout2.getLayoutParams();
        params3 = (LinearLayout.LayoutParams) frLayout3.getLayoutParams();

    }

    View.OnClickListener btnApplyListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int valueEt1 = Integer.parseInt(et1.getText().toString());
            int valueEt2 = Integer.parseInt(et2.getText().toString());
            int valueEt3 = Integer.parseInt(et3.getText().toString());

            params1.weight = valueEt1;
            params2.weight = valueEt2;
            params3.weight = valueEt3;

            frLayout1.setLayoutParams(params1);
            frLayout2.setLayoutParams(params2);
            frLayout3.setLayoutParams(params3);

        }
    };
}
