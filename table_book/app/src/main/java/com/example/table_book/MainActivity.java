package com.example.table_book;

import androidx.appcompat.app.AppCompatActivity;

import android.R.layout;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    public SeekBar sb;
    public ListView l;
    public int i, a;
    public String w;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sb = findViewById(R.id.seekBar);
        l = findViewById(R.id.l1);


        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int j = progress / 5;
                ArrayList<String> list = new ArrayList<String>();
                if (j == 0) {
                    j=1;
                }
                    for (i = 1; i <= 20; i++) {
                        a = j * i;
                        w=j+" * "+i+" = "+a;
                        list.add(w);

                    }

                n(list);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void n(ArrayList list)

    {
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, layout.simple_list_item_1, list);
        l.setAdapter(arrayAdapter);
    }
}