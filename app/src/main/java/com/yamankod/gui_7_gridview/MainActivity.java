package com.yamankod.gui_7_gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView secim;
    private GridView gridView;
    private String[] liste = { "Samsung", "HTC", "IPhone", "Nokia", "Sony",
            "Huawei", "BlackBerry", "Motorola", "Lg", "Philips" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView= (GridView) findViewById(R.id.grid);
        secim = (TextView) findViewById(R.id.selection);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,liste);

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View v, int position,
                                    long id) {
                // TODO Auto-generated method stub
                secim.setText(liste[position]);
            }
        });

    }
}
