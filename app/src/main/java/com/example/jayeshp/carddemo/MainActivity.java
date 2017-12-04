package com.example.jayeshp.carddemo;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String[] name;
    String[] email;
    TypedArray photo;
    List<MemberBean> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        name=getResources().getStringArray(R.array.name);
        email=getResources().getStringArray(R.array.email);
        photo=getResources().obtainTypedArray(R.array.photo);

        list=new ArrayList<MemberBean>();

        for(int i=0;i<name.length;i++)
        {
            MemberBean bean=new MemberBean(name[i],email[i],photo.getResourceId(i,-1));
            list.add(bean);
        }

        recyclerView=(RecyclerView)findViewById(R.id.recycle);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        MemberAdapter adapter=new MemberAdapter(MainActivity.this,list);
        recyclerView.setAdapter(adapter);

    }
}
