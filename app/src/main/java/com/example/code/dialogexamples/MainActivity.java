package com.example.code.dialogexamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void simpleOnClick (View view) {
        SimpleDialogOne simpleDialogOne = new SimpleDialogOne();
        simpleDialogOne.show(getFragmentManager(), null);
    }

    public void kolaciOnClick(View view) {
        DialogZaKolace dialogZaKolace = new DialogZaKolace();
        dialogZaKolace.show(getFragmentManager(), null);
    }

    public void vremeOnClick(View view) {
        TimePicker timePicker = new TimePicker();
        timePicker.show(getFragmentManager(), null);
    }
}
