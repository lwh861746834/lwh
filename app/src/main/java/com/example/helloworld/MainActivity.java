package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private String[] names = new String[]{"Lion","Tiger","Monkey","Dog","Cat","Elephant"};
    private String[] fy = new String[]{"狮子","老虎","猴子","狗","猫","大象"};
    private int[] imgID = new int[]{R.drawable.lion,R.drawable.tiger,R.drawable.monkey
    ,R.drawable.dog,R.drawable.cat,R.drawable.elephant};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ma);
        List<Map<String,Object>> listItems = new ArrayList<>();
        for (int i=0; i<names.length; i++){
            Map<String,Object> listItem = new HashMap<>();
            listItem.put("name",names[i]);
            listItem.put("fy",fy[i]);
            listItem.put("imgID",imgID[i]);
            listItems.add(listItem);
        }
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, listItems,R.layout.imglayout
        ,new String[]{"name","imgID","fy"},new int[]{R.id.name,R.id.imgID,R.id.fy});
        ListView list = findViewById(R.id.mylist);
        list.setAdapter(simpleAdapter);
    }
}
