package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    CheckBox ch1 = findViewById(R.id.c1);
    CheckBox ch2 = findViewById(R.id.c2);


    public void checkSelect(View v){
        boolean checked=((CheckBox)v).isChecked();
        switch(v.getId())
        {
            case R.id.c1:
                if (checked)
                    Toast.makeText(MainActivity.this, "English is Selected", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "English is Unselected", Toast.LENGTH_SHORT).show();
                break;

            case R.id.c2:
                if (checked)
                    Toast.makeText(MainActivity.this, "Malayalam is Selected", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Malayalam is Unselected", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}