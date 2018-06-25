package com.krisna.kalkulator;


import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{
    EditText vTxtA, vTxtB, vTxtC;

    protected float yTxtA, yTxtB, yTxtC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vTxtA = (EditText) findViewById(R.id.txtA);
        vTxtB = (EditText) findViewById(R.id.txtB);
        vTxtC = (EditText) findViewById(R.id.txtC);

        Button vBtnTambah = (Button) findViewById(R.id.btnTambah);
        Button vBtnKurang = (Button) findViewById(R.id.btnKurang);
        Button vBtnKali = (Button) findViewById(R.id.btnKali);
        Button vBtnBagi = (Button) findViewById(R.id.btnBagi);

        vBtnTambah.setOnClickListener(this);
        vBtnKurang.setOnClickListener(this);
        vBtnKali.setOnClickListener(this);
        vBtnBagi.setOnClickListener(this);
    }

    public void onClick(View v) {
        try {
            yTxtA = Float.parseFloat(vTxtA.getText().toString());
            yTxtB = Float.parseFloat(vTxtB.getText().toString());

            switch (v.getId()) {
                case R.id.btnTambah:
                    yTxtC = yTxtA + yTxtB;

                    vTxtC.setText(Float.toString(yTxtC));
                    break;
            }

            switch (v.getId()) {
                case R.id.btnKurang:
                    yTxtC = yTxtA - yTxtB;

                    vTxtC.setText(Float.toString(yTxtC));
                    break;
            }

            switch (v.getId()) {
                case R.id.btnKali:
                    yTxtC = yTxtA * yTxtB;

                    vTxtC.setText(Float.toString(yTxtC));
                    break;
            }

            switch (v.getId()) {
                case R.id.btnBagi:
                    yTxtC = yTxtA / yTxtB;

                    vTxtC.setText(Float.toString(yTxtC));
                    break;
            }
        }catch(Exception e){
            Toast.makeText(this, "Inputlah angka, form tidak boleh kosong!", Toast.LENGTH_LONG).show();
        }
    }
}