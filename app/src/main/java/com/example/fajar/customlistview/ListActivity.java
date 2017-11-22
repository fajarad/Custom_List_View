package com.example.fajar.customlistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    ListView list;
    String[] itemname = {
            "ACEH",
            "BALI",
            "JAKARTA",
            "JAWA BARAT",
            "JAWA TIMUR",
            "JAWA TENGAH",
            "SULAWESI SELATAN",
            "PAPUA",

    };

    Integer[] imgid = {
        R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round,
            R.mipmap.ic_launcher_round,

    };

    String[] descriptionitem = {
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    CustomListAdapter adapter = new CustomListAdapter (this, itemname, imgid, descriptionitem);
    list = (ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
