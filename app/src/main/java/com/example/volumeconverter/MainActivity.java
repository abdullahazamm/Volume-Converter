package com.example.volumeconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConverterLiter();
        ConverterMilliLiter();
        ConverterCubicMeter();
        ConverterCubicFoot();
        Reset();
    }



    public void ConverterLiter(){
        Button btn1=findViewById(R.id.button4);
        Button btn2=findViewById(R.id.button3);
        Button btn3=findViewById(R.id.button1);
        Button btn4=findViewById(R.id.button2);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText=findViewById(R.id.editText);
                EditText editText1=findViewById(R.id.editText1);
                EditText editText2=findViewById(R.id.editText2);
                EditText editText3=findViewById(R.id.editText3);


                float LiterToMilliliter=Float.parseFloat(editText.getText().toString());
                float LiterToMLiter= LiterToMilliliter*1000;

                editText1.setText(String.valueOf(LiterToMLiter));


                float LiterToCubicMeter=Float.parseFloat(editText.getText().toString());
                float LiterToCMeter= LiterToCubicMeter/1000;

                editText2.setText(String.valueOf(LiterToCMeter));


                float LiterToCubicFoot=Float.parseFloat(editText.getText().toString());
                float LiterToCFoot= (float) (LiterToCubicFoot/28.317);

                editText3.setText(String.valueOf(LiterToCFoot));
            }
        });


    }
    public void ConverterMilliLiter() {
        Button btn1 = findViewById(R.id.button4);
        Button btn2 = findViewById(R.id.button3);
        Button btn3 = findViewById(R.id.button1);
        Button btn4 = findViewById(R.id.button2);



        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText=findViewById(R.id.editText);
                EditText editText1=findViewById(R.id.editText1);
                EditText editText2=findViewById(R.id.editText2);
                EditText editText3=findViewById(R.id.editText3);


                float MilliLiterToLiter=Float.parseFloat(editText1.getText().toString());
                float MLiterToLiter= MilliLiterToLiter/1000;
                editText.setText(String.valueOf(MLiterToLiter));


                float MilliLiterToCubicMeter=Float.parseFloat(editText1.getText().toString());
                float MLiterToCMeter=MilliLiterToCubicMeter/1000000;
                editText2.setText(String.valueOf(MLiterToCMeter));


                float MilliLiterToCubicFoot=Float.parseFloat(editText1.getText().toString());
                float MLiterToCFoot= MilliLiterToCubicFoot/28320;
                editText3.setText(String.valueOf(MLiterToCFoot));

            }
        });
    }


    public void ConverterCubicMeter() {
        Button btn1 = findViewById(R.id.button4);
        Button btn2 = findViewById(R.id.button3);
        Button btn3 = findViewById(R.id.button1);
        Button btn4 = findViewById(R.id.button2);



        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText=findViewById(R.id.editText);
                EditText editText1=findViewById(R.id.editText1);
                EditText editText2=findViewById(R.id.editText2);
                EditText editText3=findViewById(R.id.editText3);


                float CubicMeterToLiter=Float.parseFloat(editText2.getText().toString());
                float CMeterToLiter= CubicMeterToLiter*1000;
                editText.setText(String.valueOf(CMeterToLiter));


                float CubicMeterToMilliLiter=Float.parseFloat(editText2.getText().toString());
                float CMeterToMLiter=CubicMeterToMilliLiter*1000000 ;
                editText1.setText(String.valueOf(CMeterToMLiter));


                float CubicMeterToCubicFoot=Float.parseFloat(editText2.getText().toString());
                float CMeterToCFoot= (float) (CubicMeterToCubicFoot*35.315);
                editText3.setText(String.valueOf(CMeterToCFoot));

            }

        });

    }

    public void ConverterCubicFoot() {
        Button btn1 = findViewById(R.id.button4);
        Button btn2 = findViewById(R.id.button3);
        Button btn3 = findViewById(R.id.button1);
        Button btn4 = findViewById(R.id.button2);



        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText=findViewById(R.id.editText);
                EditText editText1=findViewById(R.id.editText1);
                EditText editText2=findViewById(R.id.editText2);
                EditText editText3=findViewById(R.id.editText3);


                float CubicFootToLiter=Float.parseFloat(editText3.getText().toString());
                float CFootToLiter= (float) (CubicFootToLiter*28.317);
                editText.setText(String.valueOf(CFootToLiter));


                float CubicFootToMilliLiter=Float.parseFloat(editText3.getText().toString());
                float CFootToMLiter= CubicFootToMilliLiter*28320;
                editText1.setText(String.valueOf(CFootToMLiter));


                float CubicFootToCubicMeter=Float.parseFloat(editText3.getText().toString());
                float CFootToCMeter=CubicFootToCubicMeter/28320;
                editText2.setText(String.valueOf(CFootToCMeter));

            }

        });

    }

    public void Reset(){
        Button resetbtn=findViewById(R.id.resetbtn);
        resetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText=findViewById(R.id.editText);
                EditText editText1=findViewById(R.id.editText1);
                EditText editText2=findViewById(R.id.editText2);
                EditText editText3=findViewById(R.id.editText3);


                editText.setText(null);
                editText1.setText(null);
                editText2.setText(null);
                editText3.setText(null);

            }
        });


    }



}