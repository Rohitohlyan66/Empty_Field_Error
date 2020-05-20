package com.example.emptyfield;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         final EditText editText=findViewById(R.id.text);
        Button button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(editText.getText()))
                {
                    editText.setError("Required Field");
                }
                else
                    Toast.makeText(MainActivity.this, "Ok Field", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
