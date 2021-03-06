package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Numbers on English
        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        // Numbers on Miwok

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);

        ListView listView = (ListView) findViewById(R.id.list);


        listView.setAdapter(itemsAdapter);

        /*LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

        int i =0;
        while(i < words.size()) {
            TextView wordView = new TextView(this);
            wordView.setText(words.get(i));
            wordView.setHeight(100);
            wordView.setPadding(10,10,10,10);
            wordView.setBackgroundColor(125);
            wordView.setTextSize(32);
            wordView.setMaxWidth(400);
            rootView.addView(wordView);
            i++;
        }**/




    }


}
