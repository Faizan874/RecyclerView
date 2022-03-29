package com.example.newrectclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<ContactModel> arraycontact=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView=findViewById(R.id.reclclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));// important
        //ContactModel model=new ContactModel(R.drawable.alfa,"Alpha","Islamic Bank");
        //ADD DATA
        arraycontact.add(new ContactModel(R.drawable.alfa,"Alpha","1"));
        arraycontact.add(new ContactModel(R.drawable.apple,"Apple","2"));
        arraycontact.add(new ContactModel(R.drawable.pubg,"Pubg","3"));
        arraycontact.add(new ContactModel(R.drawable.whats,"WhatsApp","3"));
        arraycontact.add(new ContactModel(R.drawable.yt,"YouToube","4"));
        arraycontact.add(new ContactModel(R.drawable.alfa,"F","5"));
        arraycontact.add(new ContactModel(R.drawable.apple,"G","6"));
        arraycontact.add(new ContactModel(R.drawable.pubg,"H","7"));
        arraycontact.add(new ContactModel(R.drawable.whats,"I","8"));
        arraycontact.add(new ContactModel(R.drawable.yt,"J","9"));
        arraycontact.add(new ContactModel(R.drawable.alfa,"K","10"));
        arraycontact.add(new ContactModel(R.drawable.apple,"L","11"));
        arraycontact.add(new ContactModel(R.drawable.pubg,"M","12"));
        arraycontact.add(new ContactModel(R.drawable.whats,"N","13"));

        RecylerContactAdapter adapter=new RecylerContactAdapter(this,arraycontact);
        recyclerView.setAdapter(adapter);
    }
}