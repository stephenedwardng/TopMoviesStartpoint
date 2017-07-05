package com.codeclan.watcheslist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 05/07/2017.
 */

public class WatchesAdapter extends ArrayAdapter<Watch> {

    public WatchesAdapter(Context context, ArrayList<Watch> movies) {
        super(context, 0, movies);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.movies_item, parent, false);
        }

        Watch currentWatch = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(currentWatch.getRanking().toString());

        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentWatch.getTitle());

        TextView year = (TextView) listItemView.findViewById(R.id.year);
        year.setText(currentWatch.getYear().toString());

        listItemView.setTag(currentWatch);

        return listItemView;
    }

}
