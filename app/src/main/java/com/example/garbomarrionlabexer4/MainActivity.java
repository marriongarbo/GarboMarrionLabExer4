package com.example.garbomarrionlabexer4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import static com.example.garbomarrionlabexer4.R.layout.newlayout;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    String[] com,coun,ind,ceo;
    int[] logo = {R.drawable.cupcake, R.drawable.donut, R.drawable.eclair, R.drawable.froyo, R.drawable.gg, R.drawable.hc, R.drawable.icc};
    ListView lstVersions;
    ArrayList<AndroidVersion> versions = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        com = getResources().getStringArray(R.array.com);
        coun = getResources().getStringArray(R.array.coun);
        ind = getResources().getStringArray(R.array.ind);
        ceo = getResources().getStringArray(R.array.ceo);
        for(int i = 0; i < com.length; i++){
            versions.add(new AndroidVersion(logo[i], com[i], coun[i], ind[i], ceo[i]));
        }

        AndroidAdapter adapter = new AndroidAdapter(this, R.layout.newlayout ,versions);
        lstVersions = findViewById(R.id.lvAndroid);
        lstVersions.setAdapter(adapter);
        lstVersions.setOnItemClickListener(this);
    }



    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, final int i, long l) {
        Toast.makeText(this,com[i], Toast.LENGTH_LONG).show();
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setIcon(logo[i]);
        dialog.setTitle(com[i]);
        dialog.setMessage(coun[i]);
        dialog.setNeutralButton("Close", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int i) {
                dialog.dismiss();
                Toast.makeText(MainActivity.this, com[i], Toast.LENGTH_LONG).show();
            }

        });
        dialog.create().show();

    }
}