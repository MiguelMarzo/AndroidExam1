package org.zterr.miguelmarzoexamen;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

class CustomizedListAdapter extends BaseAdapter {

    private Activity activity;
    private ArrayList<String> people;
    private ArrayList<Integer> hanSalido = new ArrayList<Integer>();

    public CustomizedListAdapter(Activity activity, ArrayList<String> people) {
        super();
        this.activity = activity;
        this.people = people;

    }

    public int getCount() {

        return people.size();
    }

    public Object getItem(int position) {
        return people.get(position);
    }


    @Override
    public long getItemId(int position) {

        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        int icons[] = {android.R.drawable.ic_dialog_info,
                android.R.drawable.ic_dialog_info,
                android.R.drawable.ic_dialog_alert,
                android.R.drawable.ic_dialog_email};
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.main_list_item, null);
        }

        Random randomGenerator = new Random();
        int num = randomGenerator.nextInt(9);;
        while (hanSalido.contains(num)) {
            num = randomGenerator.nextInt(9);
        }

        String person = people.get(num);
        hanSalido.add(num);


        TextView textViewName = (TextView) view.findViewById(R.id.textViewName);
        textViewName.setText(person.split(",")[0]);

        TextView textViewPoints = (TextView) view.findViewById(R.id.textViewPoints);
        textViewPoints.setText(person.split(",")[1]);


        return view;


    }


}