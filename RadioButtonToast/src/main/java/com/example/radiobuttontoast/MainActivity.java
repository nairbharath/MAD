package com.example.radiobuttontoast;



import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    RadioButton ch1 = findViewById(R.id.r1);
    RadioButton ch2 = findViewById(R.id.r2);


    public void checkSelect(View v){
        boolean checked=((CheckBox)v).isChecked();
        switch(v.getId())
        {
            case R.id.r1:
                if (checked)
                    Toast.makeText(MainActivity.this, "English is Selected", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "English is Unselected", Toast.LENGTH_SHORT).show();
                break;

            case R.id.r2:
                if (checked)
                    Toast.makeText(MainActivity.this, "Malayalam is Selected", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Malayalam is Unselected", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}