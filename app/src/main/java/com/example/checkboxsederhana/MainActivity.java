package com.example.checkboxsederhana;
z
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    radiogr1,radiogr2,radiogr3,radiogr4,radiogr5,radiogr6,radiogr7,radiogr8,radiogr9,radiogr10;
    private Button proses;
    private RadioButton value1,value2,value3,value4,value5,value6,value7,value8,value9,value10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radiogr1 = findViewById(R.id.radiogroup1);
        radiogr2 = findViewById(R.id.radiogroup2);
        radiogr3 = findViewById(R.id.radiogroup3);
        radiogr4 = findViewById(R.id.radiogroup4);
        radiogr5 = findViewById(R.id.radiogroup5);
        radiogr6 = findViewById(R.id.radiogroup6);
        radiogr7 = findViewById(R.id.radiogroup7);
        radiogr8 = findViewById(R.id.radiogroup8);
        radiogr9 = findViewById(R.id.radiogroup9);
        radiogr10 = findViewById(R.id.radiogroup10);

        proses = findViewById(R.id.button_proses);
        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int pointa = radiogr1.getCheckedRadioButtonId();
                value1 = (RadioButton) findViewById(pointa);

                int pointb = radiogr2.getCheckedRadioButtonId();
                value2 = (RadioButton) findViewById(pointb);

                int pointc = radiogr3.getCheckedRadioButtonId();
                value3 = (RadioButton) findViewById(pointc);

                int pointd = radiogr4.getCheckedRadioButtonId();
                value4 = (RadioButton) findViewById(pointd);

                int pointe = radiogr5.getCheckedRadioButtonId();
                value5 = (RadioButton) findViewById(pointe);

                int pointf = radiogr6.getCheckedRadioButtonId();
                value6 = (RadioButton) findViewById(pointf);

                int pointg = radiogr7.getCheckedRadioButtonId();
                value7 = (RadioButton) findViewById(pointg);

                int pointh = radiogr8.getCheckedRadioButtonId();
                value8 = (RadioButton) findViewById(pointh);

                int pointi = radiogr9.getCheckedRadioButtonId();
                value9 = (RadioButton) findViewById(pointi);

                int pointj = radiogr10.getCheckedRadioButtonId();
                value10 = (RadioButton) findViewById(pointj);

                int nilai = 0;


                if(value1.getText().toString().toLowerCase().equals("pc games")){
                    nilai = nilai + 10;
                }
                if(value2.getText().toString().toLowerCase().equals("mobile games")){
                    nilai = nilai + 10;
                }
                if(value3.getText().toString().toLowerCase().equals("third person shooter")){
                    nilai = nilai + 10;
                }
                if(value4.getText().toString().toLowerCase().equals("need for speed")){
                    nilai = nilai + 10;
                }
                if(value5.getText().toString().toLowerCase().equals("role playing games")){
                    nilai = nilai + 10;
                }
                if(value6.getText().toString().toLowerCase().equals("pubg mobile")){
                    nilai = nilai + 10;
                }
                if(value7.getText().toString().toLowerCase().equals("moba")){
                    nilai = nilai + 10;
                }
                if(value8.getText().toString().toLowerCase().equals("fps")){
                    nilai = nilai + 10;
                }
                if(value9.getText().toString().toLowerCase().equals("fifa")){
                    nilai += 10;
                }
                if(value10.getText().toString().toLowerCase().equals("rpg")){
                    nilai = nilai + 10;
                }

                Intent i = new Intent(MainActivity.this, ResultActivity.class);
                i.putExtra("nilai",nilai);
                startActivity(i);
                finish();

            }

        });


    }
}}