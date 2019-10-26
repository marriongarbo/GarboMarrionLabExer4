package com.example.garbomarrionlabexer4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.garbomarrionlabexer4.AndroidVersion;
import com.example.garbomarrionlabexer4.R;

import androidx.annotation.Nullable;

import java.util.List;

public class AndroidAdapter extends ArrayAdapter<AndroidVersion> {
    private Context context;
    private int resource;

    public AndroidAdapter(Context context, int resource, List<AndroidVersion> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
    }

    @Override
    public View getView(int i, @Nullable View convertView, ViewGroup parent) {
        int logo = getItem(i).getLogo();
        String com = getItem(i).getName();
        String coun = getItem(i).getCoun();
        String ind = getItem(i).getInd();
        String ceo1 = getItem(i).getCeo();

        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(resource, parent, false);

        ImageView img = convertView.findViewById(R.id.logo);
        TextView comName = convertView.findViewById(R.id.com);
        TextView country = convertView.findViewById(R.id.coun);
        TextView industry= convertView.findViewById(R.id.ind);
        TextView ceo = convertView.findViewById(R.id.ceo);

        img.setImageResource(logo);
        comName.setText(com);
        country.setText(coun);
        industry.setText(ind);
        ceo.setText(ceo1);
        return convertView;
    }
}


