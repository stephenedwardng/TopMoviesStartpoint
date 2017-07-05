package com.codeclan.watcheslist;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class WatchesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movies_list);

        Watches watches = new Watches();
        ArrayList<Watch> list = watches.getList();

        WatchesAdapter movieAdapter = new WatchesAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(movieAdapter);
    }

    public void getMovie(View listItem){
        Watch watch = (Watch) listItem.getTag();
        StringBuilder sb = new StringBuilder();
        sb.append("You clicked");
        sb.append(watch.getTitle());

        Snackbar snackbar = Snackbar.make(listItem, sb.toString(), Snackbar.LENGTH_LONG);

        snackbar.show();

    }

}
